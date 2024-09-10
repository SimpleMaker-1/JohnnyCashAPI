package com.liam.JohnnyCash.controller;

import com.liam.JohnnyCash.model.Song;
import com.liam.JohnnyCash.repo.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {

    @Autowired
    private SongRepo songRepo;

    @GetMapping(value="/")
    public String getPage(){
        return "welcome";
    }


    @GetMapping(value="/song/{id}/{token}")
    public Song getSong(@PathVariable String token,@PathVariable long id){
        if(token.equals(System.getenv("token")) || token.equals(System.getenv("token2"))){
            return songRepo.findById(id).get();
        }
        else{
            return null;
        }
    }

    @GetMapping(value="/songs/{songName}/{token}")
    public List<Song> getSongs(@PathVariable String token,@PathVariable String songName){
        if(token.equals(System.getenv("token")) || token.equals(System.getenv("token2"))){
            return songRepo.findByName(songName);
        }
        else{
            return null;
        }
    }
    @GetMapping(value="/songsInAlbum/{albumName}/{token}")
    public List<Song> getSongsByAlbum(@PathVariable String token, @PathVariable String albumName){
        if(token.equals(System.getenv("token")) || token.equals(System.getenv("token2"))){
            return songRepo.findByAlbum(albumName);
        }
        else{
            return null;
        }
    }

    @GetMapping(value="/songsByDate/{date}/{token}")
    public List<Song> getSongsByDate(@PathVariable String token, @PathVariable String date){
        String fixedDate= date.replace(',','/'); //you cannot have / in the URL path so im substituting commas
        if(token.equals(System.getenv("token")) || token.equals(System.getenv("token2"))){
            return songRepo.findByAlbum(fixedDate);
        }
        else{
            return null;
        }
    }


    @PostMapping(value="/save/{token}")
    public String saveSong(@RequestBody Song song, @PathVariable String token){
        if(token.equals(System.getenv("token"))){
            songRepo.save(song);
            return "saved...";
        }
        else{
            return "You do not have access";
        }
    }

    @PutMapping(value="update/{id}/{token}")
    public String updateSong(@PathVariable long id, @RequestBody Song song , @PathVariable String token){
        if(token.equals(System.getenv("token"))){
            Song updatedSong=songRepo.findById(id).get();
            updatedSong.setName(song.getName());
            updatedSong.setDate(song.getDate());
            updatedSong.setAlbum(song.getAlbum());
            updatedSong.setUrl(song.getUrl());
            songRepo.save(updatedSong);
            return "updated...";
        }
        else{
            return "You do not have access";
        }
    }

    @DeleteMapping(value="/delete/{id}/{token}")
    public String deleteSong(@PathVariable long id, @PathVariable String token){
        if(token.equals(System.getenv("token"))){
            Song deleteSong = songRepo.findById(id).get();
            songRepo.delete(deleteSong);
            return "deleted song with id: " + id;
        }
        else{
            return "You do not have access";
        }
    }

}

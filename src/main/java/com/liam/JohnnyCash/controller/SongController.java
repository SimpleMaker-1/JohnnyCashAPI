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
    @GetMapping(value="/songs")
    public List<Song> getSongs(){
        return songRepo.findAll();
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

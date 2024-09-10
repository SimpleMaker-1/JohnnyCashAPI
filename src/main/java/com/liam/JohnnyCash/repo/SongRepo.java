package com.liam.JohnnyCash.repo;

import com.liam.JohnnyCash.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepo extends JpaRepository<Song, Long> {
    List<Song> findByName(String name);
    List<Song> findByAlbum(String album);
    List<Song> findByDate(String date);

}

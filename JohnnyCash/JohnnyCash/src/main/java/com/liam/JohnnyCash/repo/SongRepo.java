package com.liam.JohnnyCash.repo;

import com.liam.JohnnyCash.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepo extends JpaRepository<Song, Long> {


}

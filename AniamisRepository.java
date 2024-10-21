package com.exemple.dem.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.dem.entities.Animais;
public interface AniamisRepository extends JpaRepository<Animais, Long> {

}


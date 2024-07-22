package com.krngdev.gamedb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krngdev.gamedb.domai.Videojuegos;

public interface VideojugoRepository extends JpaRepository<Videojuegos, Integer> {

}

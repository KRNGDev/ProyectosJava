package com.krngdev.apidbgame.repository;

import com.krngdev.apidbgame.modelo.Generos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenerosRepository extends JpaRepository<Generos,Long> {
}

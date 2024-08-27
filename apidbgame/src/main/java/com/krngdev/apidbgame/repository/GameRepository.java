package com.krngdev.apidbgame.repository;

import com.krngdev.apidbgame.modelo.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {




    @Query("select v from Game v order by v.ano_salida")
    List<Game> buscarPorAno();

    @Query("SELECT v FROM Game v WHERE v.genero.nombre = ?1 ORDER BY v.nombre")
    List<Game> buscarPorGenero(String genero);

    List<Game> findByNombreContaining(String nombre);
}

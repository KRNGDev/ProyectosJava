package com.krngdev.gamedb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.krngdev.gamedb.domai.Videojuegos;

public interface VideojugoRepository extends JpaRepository<Videojuegos, Integer> {

    @Query("select v from Videojuegos v order by v.nombre")
    List<Videojuegos> buscarTodos();

    @Query("select v from Videojuegos v order by v.ano_salida")
    List<Videojuegos> buscarPorAno();

    @Query("SELECT v FROM Videojuegos v WHERE v.genero.nombre = ?1 ORDER BY v.nombre")
    List<Videojuegos> buscarPorGenero(String genero);

    List<Videojuegos> findByNombreContaining(String nombre);

}

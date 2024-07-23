package com.krngdev.gamedb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.krngdev.gamedb.domai.Generos;
import com.krngdev.gamedb.repository.GenerosRepositorio;

@Service
public class GenerosService {

    private final GenerosRepositorio generosRepositorio;

    public GenerosService(GenerosRepositorio generosRepositorio) {
        this.generosRepositorio = generosRepositorio;
    }

    public List<Generos> buscarTodos() {
        return generosRepositorio.findAll();

    }

}

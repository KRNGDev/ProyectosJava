package com.krngdev.gamedb.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.krngdev.gamedb.domai.Videojuegos;
import com.krngdev.gamedb.repository.VideojugoRepository;

@Service
public class VideojuegoService {

    private final VideojugoRepository videojugoRepository;

    public VideojuegoService(VideojugoRepository videojugoRepository) {
        this.videojugoRepository = videojugoRepository;
    }

    public List<Videojuegos> buscarDestacados() {

        return videojugoRepository.findAll();
    }
}

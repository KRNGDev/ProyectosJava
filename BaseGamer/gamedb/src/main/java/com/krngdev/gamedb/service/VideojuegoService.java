package com.krngdev.gamedb.service;

import java.util.List;
import java.util.Optional;

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

        return videojugoRepository.buscarTodos();
    }

    public List<Videojuegos> buscar(String consulta) {
        return videojugoRepository.findByNombreContaining(consulta);
    }

    public List<Videojuegos> buscarPorGenero(String genero) {
        return videojugoRepository.buscarPorGenero(genero);
    }

    public List<Videojuegos> buscarPorAno() {
        return videojugoRepository.buscarPorAno();
    }

    public Videojuegos buscarJuegoId(Integer id) {
        return videojugoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Videojuego no encontrado con ID: " + id));
    }

    public Videojuegos guardar(Videojuegos videojuegos) {
        return videojugoRepository.save(videojuegos);
    }
}

package com.krngdev.apidbgame.service;



import com.krngdev.apidbgame.modelo.Game;
import com.krngdev.apidbgame.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {


    @Autowired
    GameRepository gameRepository;

    public ArrayList<Game> getGame(){
        return (ArrayList<Game>) gameRepository.findAll();
    }

    public Game buscarId(Long id){
        return gameRepository.findById(id).orElseThrow(() -> new  IllegalArgumentException("Juego no encontrado con ID: "+id));
    }
    public Game guardar(Game game){
        return gameRepository.save(game);
    }


    public List<Game> buscar(String consulta){
        return gameRepository.findByNombreContaining(consulta);

    }

    public List<Game> buscarGenero(String genero){
        return gameRepository.buscarPorGenero(genero);

    }
    public List<Game> buscarFecha(){
        return gameRepository.buscarPorAno();

    }



}

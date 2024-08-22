package com.krngdev.apidbgame.service;


import com.krngdev.apidbgame.modelo.Game;
import com.krngdev.apidbgame.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {


    @Autowired
    GameRepository gameRepository;

    public List<Game> buscarDestacados(){
        return gameRepository.findAll();
    }
}

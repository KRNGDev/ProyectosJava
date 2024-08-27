package com.krngdev.apidbgame.controller;

import com.krngdev.apidbgame.modelo.Game;
import com.krngdev.apidbgame.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;


    @GetMapping
    public ArrayList<Game> getGames(){
        return this.gameService.getGame();
    }

    @RequestMapping("/buscar")
        public String buscar(@RequestParam("q") String consulta){
            return gameService.buscar(consulta).toString();

        }

}

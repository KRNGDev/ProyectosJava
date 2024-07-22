package com.krngdev.gamedb.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.krngdev.gamedb.domai.Videojuegos;
import com.krngdev.gamedb.service.VideojuegoService;

@Controller
public class ListadoController {

    private final VideojuegoService videojuegoService;

    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }

    @RequestMapping("/")
    public String listarVideojuegos(Model model) {
        List<Videojuegos> destacados = videojuegoService.buscarDestacados();
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }

}

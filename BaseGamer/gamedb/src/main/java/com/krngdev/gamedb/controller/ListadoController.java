package com.krngdev.gamedb.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/fecha")
    public String listarVideojuegosPorAno(Model model) {
        List<Videojuegos> destacados = videojuegoService.buscarPorAno();
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }

    @RequestMapping("/genero/{genero}")
    public String listarVideojuegosPorGenero(@PathVariable String genero, Model model) {
        List<Videojuegos> destacados = videojuegoService.buscarPorGenero(genero);
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }

    @RequestMapping("/buscar")
    public String buscar(@RequestParam("q") String consulta, Model model) {
        List<Videojuegos> destacados = videojuegoService.buscar(consulta);
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }

}

package com.krngdev.gamedb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krngdev.gamedb.domai.Videojuegos;
import com.krngdev.gamedb.service.DistribuidorService;
import com.krngdev.gamedb.service.GenerosService;
import com.krngdev.gamedb.service.VideojuegoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VideojuegoAbmController {

    private final DistribuidorService distribuidorService;
    private final VideojuegoService videojuegoService;
    private final GenerosService generosService;

    public VideojuegoAbmController(DistribuidorService distribuidorService, VideojuegoService videojuegoService,
            GenerosService generosService) {
        this.distribuidorService = distribuidorService;
        this.videojuegoService = videojuegoService;
        this.generosService = generosService;
    }

    @GetMapping("/videojuegos/{id}/edit")
    public String editarJuego(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("generos", generosService.buscarTodos());
        Videojuegos juego = videojuegoService.buscarJuegoId(id);
        model.addAttribute("videojuego", juego);
        return "editJuego";
    }

    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("generos", generosService.buscarTodos());
        model.addAttribute("videojuego", new Videojuegos());
        return "formVideojuegos";
    }

    @PostMapping("/videojuegos/{id}/update")
    public String updateJuego(@PathVariable("id") Integer id, Videojuegos videojuegos) {
        videojuegos.setId(id);
        videojuegoService.guardar(videojuegos);

        return "redirect:/";
    }

    @PostMapping("/videojuegos/guardar")
    public String guardar(Videojuegos videojuego) {
        videojuegoService.guardar(videojuego);
        return "redirect:/";
    }

}

package com.krngdev.gamedb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krngdev.gamedb.domai.Distribuidor;
import com.krngdev.gamedb.service.DistribuidorService;

@Controller
public class DistribuidorAbmController {
    private final DistribuidorService distribuidorService;

    public DistribuidorAbmController(DistribuidorService distribuidorService) {
        this.distribuidorService = distribuidorService;
    }

    @RequestMapping("/distribuidor/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("distribuidor", new Distribuidor());
        return "crearDistribuidor";
    }

    @PostMapping("/distribuidor/guardar")
    public String guardar(Distribuidor distribuidor) {
        distribuidorService.guardar(distribuidor);
        System.out.println(distribuidor);
        return "redirect:/videojuegos/crear";
    }
}

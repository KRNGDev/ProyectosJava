package com.krngdev.gamedb.gamedb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {

    @RequestMapping("/")
    public String listarVideojuegos() {
        return "listado";
    }

}

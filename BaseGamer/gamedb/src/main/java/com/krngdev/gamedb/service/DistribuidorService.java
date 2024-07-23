package com.krngdev.gamedb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.krngdev.gamedb.domai.Distribuidor;
import com.krngdev.gamedb.repository.DistribuidorRepositorio;

@Service
public class DistribuidorService {

    private final DistribuidorRepositorio distribuidorRepositorio;

    public DistribuidorService(DistribuidorRepositorio distribuidorRepositorio) {
        this.distribuidorRepositorio = distribuidorRepositorio;
    }

    public List<Distribuidor> buscarTodos() {
        return distribuidorRepositorio.findAll();
    }

    public Distribuidor guardar(Distribuidor distribuidor) {
        return distribuidorRepositorio.save(distribuidor);
    }

}

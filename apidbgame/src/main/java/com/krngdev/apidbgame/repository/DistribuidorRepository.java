package com.krngdev.apidbgame.repository;

import com.krngdev.apidbgame.modelo.Distribuidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistribuidorRepository  extends JpaRepository<Distribuidor,Long> {
}

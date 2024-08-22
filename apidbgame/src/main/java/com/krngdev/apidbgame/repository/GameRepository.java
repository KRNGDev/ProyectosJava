package com.krngdev.apidbgame.repository;

import com.krngdev.apidbgame.modelo.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {
}

package com.github.henriquealves4624.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.henriquealves4624.model.Bot;

@Repository
public interface BotRepository 
        extends JpaRepository<Bot, Long> {
}
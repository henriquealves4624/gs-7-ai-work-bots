package com.github.henriquealves4624.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.henriquealves4624.dto.bot.BotRequestCreate;
import com.github.henriquealves4624.dto.bot.BotRequestUpdate;
import com.github.henriquealves4624.model.Bot;
import com.github.henriquealves4624.repository.BotRepository;

@Service
public class BotService {
    
    @Autowired
    private BotRepository botRepository;

    public Bot createBot(BotRequestCreate dto) {
        return botRepository.save(dto.toModel());
    }

    public Optional<Bot> updateBot(
            Long id, BotRequestUpdate dto) {

        return botRepository.findById(id)
            .map(p -> botRepository.save(dto.toModel(p)));
    }

    public Optional<Bot> getBotById(Long id) {        
        return botRepository.findById(id);
    }

    public List<Bot> getAll() {
        return botRepository.findAll();
    }

    public boolean deleteBot(Long id) { 
        if (botRepository.existsById(id)) {
            botRepository.deleteById(id);
            return true;
        }

        return false;     
    }
}
package com.github.henriquealves4624.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.github.henriquealves4624.dto.bot.BotResponse;
import com.github.henriquealves4624.service.BotService;

@RestController
@RequestMapping("/api/${api.version}/bots")
public class BotController {

    @Autowired
    private BotService botService;

    @GetMapping("/info")
    public ResponseEntity<List<BotResponse>> findAll() {
        List<BotResponse> response = 
            botService.getAll().stream()
            .map(p-> new BotResponse().toDto(p))
            .collect(Collectors.toList()); 
        return ResponseEntity.ok(response);
    }
    
}
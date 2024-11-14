package com.marcon.dev.controllers;


import com.marcon.dev.dto.GameMinDTO;
import com.marcon.dev.entities.Game;
import com.marcon.dev.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gamerService;

    @GetMapping
    public List<GameMinDTO> findAll(){
            List<GameMinDTO> result = gamerService.findAll();
            return result;
    }
}

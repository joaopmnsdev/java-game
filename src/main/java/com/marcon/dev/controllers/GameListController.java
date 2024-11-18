package com.marcon.dev.controllers;

import com.marcon.dev.dto.GameListDTO;
import com.marcon.dev.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
            List<GameListDTO> result = gameListService.findAll();
            return result;
    }
}

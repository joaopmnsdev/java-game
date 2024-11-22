package com.marcon.dev.controllers;

import com.marcon.dev.dto.GameListDTO;
import com.marcon.dev.dto.GameMinDTO;
import com.marcon.dev.dto.replacementDTO;
import com.marcon.dev.services.GameListService;
import com.marcon.dev.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
            List<GameListDTO> result = gameListService.findAll();
            return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findBylist(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody replacementDTO body){
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }


}

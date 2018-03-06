package com.essejose.games.controller

import com.essejose.games.model.Game
import com.essejose.games.service.GameServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@CrossOrigin
@RequestMapping( value = "/game")
class GameController{

    @Autowired
    lateinit var gameService:GameServices

    @GetMapping
    fun buscarTodos() : List<Game>{

        return gameService.buscarTodos()
    }

    @PostMapping
    fun salvar(@RequestBody game: Game){
        gameService.salvar(game)
    }
}
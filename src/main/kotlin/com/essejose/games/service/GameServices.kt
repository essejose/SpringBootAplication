package com.essejose.games.service

import com.essejose.games.model.Game
import com.essejose.games.repository.GameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GameServices {

    @Autowired
    lateinit var gameRepository: GameRepository

    fun buscarTodos() : List<Game> {

        return gameRepository.findAll()
    }

    fun salvar(game:Game){

        gameRepository.save(game);
    }

}

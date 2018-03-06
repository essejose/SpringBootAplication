package com.essejose.games.repository

import com.essejose.games.model.Game
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface  GameRepository : MongoRepository<Game,String>
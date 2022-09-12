package com.example.learnroomdatabase.data

import androidx.lifecycle.LiveData
import com.example.learnroomdatabase.model.User

class UserRepositor(private val userDao: UserDao){

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }

    suspend fun deleteUser(user: User){
        userDao.deleteUser(user)
    }

    suspend fun deleteAllUser(){
        userDao.deleteAllUsers()
    }
}
package com.example.learnroomdatabase.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.learnroomdatabase.model.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUser (user: User)

    @Delete
    fun deleteUser (user: User)

    @Query("DELETE FROM user_table")
    fun deleteAllUsers()

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>
}
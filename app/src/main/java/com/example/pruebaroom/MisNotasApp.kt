package com.example.pruebaroom

import android.app.Application
import androidx.room.Room
import database.TaskDatabase

class MisNotasApp: Application() {
    companion object{
        lateinit var database: TaskDatabase
    }

    override fun onCreate() {
        super.onCreate()

        MisNotasApp.database= Room.databaseBuilder(this,TaskDatabase::class.java,"tasks-db").build()
    }
}
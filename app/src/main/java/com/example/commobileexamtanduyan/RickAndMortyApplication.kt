package com.example.commobileexamtanduyan

import android.app.Application
import com.example.commobileexamtanduyan.data.container.AppContainer
import com.example.commobileexamtanduyan.data.container.DefaultAppContainer

class RickAndMortyApplication: Application(){
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
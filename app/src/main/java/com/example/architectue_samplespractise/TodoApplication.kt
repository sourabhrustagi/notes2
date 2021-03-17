package com.example.architectue_samplespractise

import android.app.Application
import com.example.architectue_samplespractise.data.source.TasksRepository
import timber.log.Timber

class TodoApplication : Application() {

    val tasksRepository: TasksRepository
        get() = ServiceLocator.provideTasksRepository(this)

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}
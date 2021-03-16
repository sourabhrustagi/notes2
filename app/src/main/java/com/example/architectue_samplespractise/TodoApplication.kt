package com.example.architectue_samplespractise

import android.app.Application
import com.example.architectue_samplespractise.data.source.TasksRepository

class TodoApplication : Application() {

    val tasksRepository: TasksRepository
        get() = ServiceLocator.provideTasksRepository(this)
}
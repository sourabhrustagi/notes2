package com.example.architectue_samplespractise

import android.content.Context
import com.example.architectue_samplespractise.data.source.TasksRepository

object ServiceLocator {
    @Volatile


    fun provideTasksRepository(context: Context): TasksRepository {
        synchronized(this){
            return task
        }
    }
}
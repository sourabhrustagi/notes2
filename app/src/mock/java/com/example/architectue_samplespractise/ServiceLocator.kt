package com.example.architectue_samplespractise

import android.content.Context
import androidx.annotation.VisibleForTesting
import com.example.architectue_samplespractise.data.source.DefaultTasksRepository
import com.example.architectue_samplespractise.data.source.TasksRepository
import kotlin.random.Random

object ServiceLocator {
    @Volatile
    var tasksRepository: TasksRepository? = null
        @VisibleForTesting set

    fun provideTasksRepository(context: Context): TasksRepository {
        synchronized(this) {
            return tasksRepository ?: tasksRepository ?: createTasksRepository(context)
        }
    }

    private fun createTasksRepository(context: Context): TasksRepository {
        val newRepo =
            DefaultTasksRepository()
        tasksRepository = newRepo
        return newRepo
    }
}
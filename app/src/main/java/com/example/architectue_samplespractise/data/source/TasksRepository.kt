package com.example.architectue_samplespractise.data.source

import androidx.lifecycle.LiveData
import com.example.architectue_samplespractise.data.Task
import com.example.architectue_samplespractise.data.Result

interface TasksRepository {
    fun observeTasks(): LiveData<Result<List<Task>>>

    suspend fun refreshTasks()

    suspend fun completeTask(task: Task)

    suspend fun activateTask(task: Task)

    suspend fun clearCompletedTasks()
}
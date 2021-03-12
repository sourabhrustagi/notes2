package com.example.architectue_samplespractise.tasks

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.architectue_samplespractise.data.source.TasksRepository

class TasksViewModel(
    private val tasksRepository: TasksRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

}
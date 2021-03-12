package com.example.architectue_samplespractise.tasks

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class TasksFragment : Fragment() {
    private val viewModel by viewModels<TasksViewModel> {getViewModelFactory()}
}
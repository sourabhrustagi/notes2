package com.example.architectue_samplespractise.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.architectue_samplespractise.databinding.TasksFragBinding
import com.example.architectue_samplespractise.util.getViewModelFactory

class TasksFragment : Fragment() {
    private val viewModel by viewModels<TasksViewModel> { getViewModelFactory() }

    private val args: TasksFragmentArgs by navArgs()

    private lateinit var viewDataBinding: TasksFragBinding

    private lateinit var listAdapter: TasksAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = TasksFragBinding.inflate(inflater, container, false).apply {
            viewmodel = viewModel
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
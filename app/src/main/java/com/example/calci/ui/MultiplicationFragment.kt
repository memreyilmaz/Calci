package com.example.calci.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.calci.databinding.FragmentMultiplicationBinding
import com.example.calci.viewModel.CalciViewModel
import org.koin.android.viewmodel.ext.android.sharedViewModel

class MultiplicationFragment : Fragment() {
    private var _binding: FragmentMultiplicationBinding? = null
    private val binding get() = _binding!!
    private val viewModel by sharedViewModel<CalciViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMultiplicationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = MultiplicationFragment()
    }
}
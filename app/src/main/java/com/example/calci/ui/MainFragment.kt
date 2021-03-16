package com.example.calci.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.calci.R
import com.example.calci.databinding.FragmentMainBinding
import com.example.calci.viewModel.CalciViewModel
import org.koin.android.viewmodel.ext.android.sharedViewModel

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val viewModel by sharedViewModel<CalciViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(
        view: View, savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        initButtons()
    }

    private fun initButtons() {
        with(binding) {
            buttonAddition.setOnClickListener {
                view?.findNavController()?.navigate(R.id.action_mainFragment_to_additionFragment)
            }
            buttonSubtraction.setOnClickListener {
                view?.findNavController()?.navigate(R.id.action_mainFragment_to_subtractionFragment)
            }
            buttonMultiplication.setOnClickListener {
                view?.findNavController()
                    ?.navigate(R.id.action_mainFragment_to_multiplicationFragment)
            }
            buttonDivision.setOnClickListener {
                view?.findNavController()?.navigate(R.id.action_mainFragment_to_divisionFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}
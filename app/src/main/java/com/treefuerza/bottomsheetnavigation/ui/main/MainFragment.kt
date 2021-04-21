package com.treefuerza.bottomsheetnavigation.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.treefuerza.bottomsheetnavigation.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private var binding: MainFragmentBinding? = null
    private lateinit var bottomSheetDialog: MainBottomSheetDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding?.root!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bottomSheetDialog = MainBottomSheetDialog()
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding?.button?.setOnClickListener {
            bottomSheetDialog.show(childFragmentManager, "BottomNav")
        }
    }

}
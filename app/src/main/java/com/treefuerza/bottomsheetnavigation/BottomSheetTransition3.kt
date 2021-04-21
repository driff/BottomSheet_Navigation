package com.treefuerza.bottomsheetnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.treefuerza.bottomsheetnavigation.databinding.FragmentBottomSheetTransition2Binding
import com.treefuerza.bottomsheetnavigation.databinding.FragmentBottomSheetTransition3Binding

class BottomSheetTransition3 : Fragment(R.layout.fragment_bottom_sheet_transition_3) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FragmentBottomSheetTransition3Binding.bind(view).apply {
            btnNext.setOnClickListener {
                findNavController().navigate(R.id.action_bottomSheetTransition3_to_bottom_sheet_fragment_1)
            }
        }
    }
}
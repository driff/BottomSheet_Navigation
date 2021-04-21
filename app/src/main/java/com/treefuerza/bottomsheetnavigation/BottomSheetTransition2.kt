package com.treefuerza.bottomsheetnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.treefuerza.bottomsheetnavigation.databinding.FragmentBottomSheetTransition2Binding

/**
 * A simple [Fragment] subclass.
 * Use the [bottom_sheet_transition_2.newInstance] factory method to
 * create an instance of this fragment.
 */
class BottomSheetTransition2 : Fragment(R.layout.fragment_bottom_sheet_transition_2) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FragmentBottomSheetTransition2Binding.bind(view).apply {
            btnNext.setOnClickListener {
                findNavController().navigate(R.id.action_bottomSheetTransition2_to_bottomSheetTransition3)
            }
            btnBack.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }
}
package com.treefuerza.bottomsheetnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.treefuerza.bottomsheetnavigation.databinding.FragmentBottomSheet1Binding

/**
 * A simple [Fragment] subclass.
 * Use the [BottomSheetFragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class BottomSheetFragment1 : Fragment(R.layout.fragment_bottom_sheet_1) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FragmentBottomSheet1Binding.bind(view).apply {
            btnNext.setOnClickListener {
                findNavController().navigate(R.id.action_bottom_sheet_fragment_1_to_bottomSheetTransition2)
            }
        }
    }
}
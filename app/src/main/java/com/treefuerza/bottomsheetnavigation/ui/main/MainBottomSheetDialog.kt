package com.treefuerza.bottomsheetnavigation.ui.main

import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.treefuerza.bottomsheetnavigation.R
import com.treefuerza.bottomsheetnavigation.databinding.BottomSheetMainFragmentBinding

class MainBottomSheetDialog: BottomSheetDialogFragment() {

    private var binding: BottomSheetMainFragmentBinding? = null
    lateinit var dialogNavController: NavController


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = BottomSheetMainFragmentBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog?.setOnShowListener { dialog ->
            val d = dialog as BottomSheetDialog
            val bottomSheetInternal =
                d.findViewById<View>(R.id.design_bottom_sheet)
            bottomSheetInternal?.minimumHeight =
                Resources.getSystem().displayMetrics.heightPixels
        }
        binding?.apply {
            val navHostFragment = childFragmentManager.findFragmentById(R.id.dialog_nav_host_fragment) as NavHostFragment
            dialogNavController = navHostFragment.navController
            dialogNavController.setGraph(R.navigation.bottom_sheet_nav, savedInstanceState)
        }
    }
}
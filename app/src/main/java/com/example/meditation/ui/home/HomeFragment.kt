package com.example.meditation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.meditation.R
import com.example.meditation.recadapters.FeelRecycler
import com.example.meditation.recadapters.FeelRecycler2
import com.example.meditation.recadapters.MyFeel
import com.example.meditation.recadapters.MyFeel2

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val feel_recycler: RecyclerView = root.findViewById(R.id.feel_rec)
        feel_recycler.adapter = FeelRecycler(requireContext(), MyFeel().list )

        val feel_recycler2: RecyclerView = root.findViewById(R.id.feel_rec2)
        feel_recycler2.adapter = FeelRecycler2(requireContext(), MyFeel2().list)

        return root
    }

}
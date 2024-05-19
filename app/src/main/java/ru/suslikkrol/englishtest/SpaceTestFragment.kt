package ru.suslikkrol.englishtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import ru.suslikkrol.englishtest.databinding.FragmentSpaceTestBinding

class SpaceTestFragment : Fragment() {

    private lateinit var binding: FragmentSpaceTestBinding

    private val fragList = listOf(
        Space1Fragment.newInstance(),
        Space2Fragment.newInstance(),
        Space3Fragment.newInstance()
    )

    private val fragListTitles = listOf(
        "Тест 1",
        "Тест 2",
        "Тест 3"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSpaceTestBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = VpAdapter(activity as AppCompatActivity, fragList)
        binding.vpTestFood.adapter = adapter
        TabLayoutMediator(binding.tbFood, binding.vpTestFood){
                tab, pos -> tab.text = fragListTitles[pos]
        }.attach()
    }

    companion object {
        @JvmStatic
        fun newInstance() = SpaceTestFragment()
    }
}
package ru.suslikkrol.englishtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import ru.suslikkrol.englishtest.databinding.FragmentSpace2Binding

class Space2Fragment : Fragment() {
    private lateinit var binding: FragmentSpace2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSpace2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.layoutAnswer1.setOnClickListener {
            markAnswerCorrect(
                binding.layoutAnswer1,
                binding.tvVariantNumber1,
                binding.tvVariantText1
            )



        }

        binding.layoutAnswer3.setOnClickListener {
            markAnswerError(
                binding.layoutAnswer3,
                binding.tvVariantNumber3,
                binding.tvVariantText3
            )

        }

        binding.layoutAnswer2.setOnClickListener {
            markAnswerError(
                binding.layoutAnswer2,
                binding.tvVariantNumber2,
                binding.tvVariantText2
            )

        }

        binding.layoutAnswer4.setOnClickListener {
            markAnswerError(
                binding.layoutAnswer4,
                binding.tvVariantNumber4,
                binding.tvVariantText4
            )

        }
    }

    private fun markAnswerCorrect(
        layoutAnswer: LinearLayout,
        tvVariantNumber: TextView,
        tvVariantText: TextView,
    ) {

        layoutAnswer.background = ContextCompat.getDrawable(
            activity as AppCompatActivity,
            R.drawable.shape_stroke_answer_correct
        )

        tvVariantNumber.background = ContextCompat.getDrawable(
            activity as AppCompatActivity,
            R.drawable.shape_stroke_number_correct
        )

        tvVariantNumber.setTextColor(
            ContextCompat.getColor(
                activity as AppCompatActivity,
                R.color.white
            )
        )

        tvVariantText.setTextColor(
            ContextCompat.getColor(
                activity as AppCompatActivity,
                R.color.correctAnswerColor
            )
        )


    }

    private fun markAnswerError(
        layoutAnswer: LinearLayout,
        tvVariantNumber: TextView,
        tvVariantText: TextView,
    ) {

        layoutAnswer.background = ContextCompat.getDrawable(
            activity as AppCompatActivity,
            R.drawable.shape_stroke_answer_error
        )

        tvVariantNumber.background = ContextCompat.getDrawable(
            activity as AppCompatActivity,
            R.drawable.shape_stroke_number_error
        )

        tvVariantNumber.setTextColor(
            ContextCompat.getColor(
                activity as AppCompatActivity,
                R.color.white
            )
        )

        tvVariantText.setTextColor(
            ContextCompat.getColor(
                activity as AppCompatActivity,
                R.color.errorAnswerColor
            )
        )

        markAnswerCorrect(
            binding.layoutAnswer1,
            binding.tvVariantNumber1,
            binding.tvVariantText1
        )
    }

    companion object {
        @JvmStatic
        fun newInstance() = Space2Fragment()
    }
}
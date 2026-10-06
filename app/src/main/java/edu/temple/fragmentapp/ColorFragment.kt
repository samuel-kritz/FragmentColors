package edu.temple.fragmentapp

import android.graphics.Color
import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlin.random.Random
import androidx.core.graphics.toColorInt


class ColorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val colors = arrayOf("Red", "Yellow", "Green", "Cyan", "Maroon", "Magenta", "Olive", "Purple", "Silver", "Gray", "Maroon", "Black" )

        return inflater.inflate(R.layout.fragment_color, container, false).apply {
            setOnClickListener {
                setBackgroundColor(
                    colors.random().toColorInt()
                )
            }
        }
    }
}

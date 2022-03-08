package com.codepath.debuggingchallenges.activities

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle
import android.util.Log
import android.view.View
import com.codepath.debuggingchallenges.R
import java.util.*

private const val TAG = "CurrentDayActivity"
class CurrentDayActivity : AppCompatActivity() {
    var tvDay: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_day)
        tvDay = findViewById<TextView>(R.id.tvDay)
        tvDay?.setText(dayOfMonth)
    }

    private val dayOfMonth: String
        get() {
            val cal = Calendar.getInstance()
            // Log.i(TAG, "Day is ${cal[Calendar.DAY_OF_MONTH]}")
            return cal[Calendar.DAY_OF_MONTH].toString()
        }
}
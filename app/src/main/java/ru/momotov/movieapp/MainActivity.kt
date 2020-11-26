package ru.momotov.movieapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.ActivityChooserView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.show_detail_text_view)
        textView.setOnClickListener {
            showMovieDetails()
        }
    }

    private fun showMovieDetails() {
        val intent = Intent(this, MovieDetailsActivity::class.java)
        startActivity(intent)
    }
}
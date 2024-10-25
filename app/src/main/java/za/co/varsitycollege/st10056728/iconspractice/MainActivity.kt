package za.co.varsitycollege.st10056728.iconspractice

import android.os.Bundle
import android.view.View
import android.widget.GridLayout
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views
        val mainIcon: ImageView = findViewById(R.id.mainIcon)
        val iconSelectionLayout: GridLayout = findViewById(R.id.iconSelectionLayout)

        // Set OnClickListener to toggle the visibility of the icon selection layout
        mainIcon.setOnClickListener {
            // Toggle visibility of icon selection layout
            if (iconSelectionLayout.visibility == View.GONE) {
                iconSelectionLayout.visibility = View.VISIBLE
            } else {
                iconSelectionLayout.visibility = View.GONE
            }
        }

        // Handle icon selection for each icon
        val icon1: ImageView = findViewById(R.id.icon1)
        val icon2: ImageView = findViewById(R.id.icon2)
        val icon3: ImageView = findViewById(R.id.icon3)
        val icon4: ImageView = findViewById(R.id.icon4)
        val icon5: ImageView = findViewById(R.id.icon5)
        val icon6: ImageView = findViewById(R.id.icon6)
        val icon7: ImageView = findViewById(R.id.icon7)
        val icon8: ImageView = findViewById(R.id.icon8)
        val icon9: ImageView = findViewById(R.id.icon9)

        icon1.setOnClickListener {
            // Update the main icon and hide the icon selection layout
            mainIcon.setImageResource(R.drawable.bread_48)
            saveSelectedIcon(R.drawable.bread_48)
            iconSelectionLayout.visibility = View.GONE
        }

        icon2.setOnClickListener {
            mainIcon.setImageResource(R.drawable.butter_48)
            saveSelectedIcon(R.drawable.butter_48)
            iconSelectionLayout.visibility = View.GONE
        }

        icon3.setOnClickListener {
            mainIcon.setImageResource(R.drawable.cake_48)
            saveSelectedIcon(R.drawable.cake_48)
            iconSelectionLayout.visibility = View.GONE
        }

        icon4.setOnClickListener {
            // Update the main icon and hide the icon selection layout
            mainIcon.setImageResource(R.drawable.cheese_48)
            saveSelectedIcon(R.drawable.cheese_48)
            iconSelectionLayout.visibility = View.GONE
        }

        icon5.setOnClickListener {
            mainIcon.setImageResource(R.drawable.fish_48)
            saveSelectedIcon(R.drawable.fish_48)
            iconSelectionLayout.visibility = View.GONE
        }

        icon6.setOnClickListener {
            mainIcon.setImageResource(R.drawable.fruits_48)
            saveSelectedIcon(R.drawable.fruits_48)
            iconSelectionLayout.visibility = View.GONE
        }

        icon7.setOnClickListener {
            // Update the main icon and hide the icon selection layout
            mainIcon.setImageResource(R.drawable.meat_48)
            saveSelectedIcon(R.drawable.meat_48)
            iconSelectionLayout.visibility = View.GONE
        }

        icon8.setOnClickListener {
            mainIcon.setImageResource(R.drawable.pasta_48)
            saveSelectedIcon(R.drawable.pasta_48)
            iconSelectionLayout.visibility = View.GONE
        }

        icon9.setOnClickListener {
            mainIcon.setImageResource(R.drawable.vegetables_48)
            saveSelectedIcon(R.drawable.vegetables_48)
            iconSelectionLayout.visibility = View.GONE
        }

    }

    // Function to save the selected icon in the database
    private fun saveSelectedIcon(iconResId: Int) {

    }
}

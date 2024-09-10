package edu.vt.mobiledev.multiquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import com.google.android.material.snackbar.Snackbar
import edu.vt.mobiledev.multiquiz.databinding.ActivityMainBinding

    //gvwilson
    //Grant Wilson
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var option1: Button
    private lateinit var option2: Button
    private lateinit var option3: Button
    private lateinit var option4: Button
    private lateinit var resetButton: Button
    private lateinit var helpButton: Button

    private val answers = listOf(
        Answer(R.string.option1, false),
        Answer(R.string.option2, true),
        Answer(R.string.option3, false),
        Answer(R.string.option4, false),)

        private lateinit var buttons: List<Button>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        option1 = findViewById(R.id.option1)
        option2 = findViewById(R.id.option2)
        option3 = findViewById(R.id.option3)
        option4 = findViewById(R.id.option4)
        resetButton = findViewById(R.id.reset_button)
        helpButton = findViewById(R.id.help_button)

        buttons = listOf(option1, option2, option3, option4)

        fun updateView(){
            for(button in buttons){
                button.updateColor()
            }
            helpButton.updateColor()
        }

        binding.option1.setOnClickListener {
            option1.isSelected = !option1.isSelected
            updateView()
        }

        binding.option2.setOnClickListener {
            option2.isSelected = !option2.isSelected
            updateView()
        }

        binding.option3.setOnClickListener {
            option3.isSelected = !option3.isSelected
            updateView()
        }

        binding.option4.setOnClickListener {
            option4.isSelected = !option4.isSelected
            updateView()
        }

        resetButton.setOnClickListener {
            for(button in buttons){
                button.isSelected = false
                button.isEnabled = true
            }
            helpButton.isSelected = false
            helpButton.isEnabled = true
            updateView()
        }

        helpButton.setOnClickListener {
            helpButton.isEnabled = false
            option1.isEnabled = false
            option3.isEnabled = false
            updateView()
        }


    }


}
package edu.vt.mobiledev.multiquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import com.google.android.material.snackbar.Snackbar
import edu.vt.mobiledev.multiquiz.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var option1: Button
    private lateinit var option2: Button
    private lateinit var option3: Button
    private lateinit var option4: Button
    private lateinit var reset_button: Button
    private lateinit var help_button: Button

    private val answers = listOf(
        Answer(R.string.option1, false),
        Answer(R.string.option2, true),
        Answer(R.string.option3, false),
        Answer(R.string.option4, false),)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        option1 = findViewById(R.id.option1)
        option2 = findViewById(R.id.option2)
        option3 = findViewById(R.id.option3)
        option4 = findViewById(R.id.option4)
        reset_button = findViewById(R.id.reset_button)
        help_button = findViewById(R.id.help_button)

        binding.option1.setOnClickListener {
            option1.isSelected = !option1.isSelected
            option1.updateColor()
        }

        binding.option2.setOnClickListener {
            option2.isSelected = !option2.isSelected
            option2.updateColor()
        }

        binding.option3.setOnClickListener {
            option3.isSelected = !option3.isSelected
            option3.updateColor()
        }

        binding.option4.setOnClickListener {
            option4.isSelected = !option4.isSelected
            option4.updateColor()
        }

        reset_button.setOnClickListener {


        }

        help_button.setOnClickListener {
            var counter = 0
            for(answer in answers){
                if(counter < 2 && !answer.isCorrect){
                    answer.isEnabled = false
                    counter++
                }
            }

        }


    }


}
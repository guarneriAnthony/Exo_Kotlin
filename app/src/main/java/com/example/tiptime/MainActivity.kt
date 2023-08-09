package com.example.tiptime
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tiptime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{ calculateNbrPlanets() }
    }

    private fun calculateNbrPlanets(){
        val yearInput = binding.yearInput.text.toString()
        var nbrPlanets = 0
        val textResult: String

        if (yearInput <= "1599" || yearInput >= "2021") {
            textResult = "Le programme ne peut pas fournir de résultat pour l'année $yearInput"
        } else {
            if (yearInput <= "1800"){
                nbrPlanets = 7
            } else if (yearInput <= "2006") {
                nbrPlanets = 8
            } else if (yearInput <= "2020") {
                nbrPlanets = 9
            }
            textResult = "Il y a $nbrPlanets planettes dans l'année $yearInput"
        }
        binding.answer.text = textResult
    }
}


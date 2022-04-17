package net.tipam2022.countriesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.tipam2022.countriesapp.databinding.ActivityMainBinding
import net.tipam2022.countriesapp.databinding.FragmentCountryDetailsBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
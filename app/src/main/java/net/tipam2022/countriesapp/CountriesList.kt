package net.tipam2022.countriesapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.tipam2022.countriesapp.databinding.FragmentCountriesListBinding
import net.tipam2022.countriesapp.databinding.FragmentCountryDetailsBinding


class CountriesList : Fragment() {

    private var _binding: FragmentCountriesListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCountriesListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
}
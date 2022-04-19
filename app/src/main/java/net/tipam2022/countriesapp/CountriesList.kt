package net.tipam2022.countriesapp

import android.os.Build
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jsonMapper
import net.tipam2022.countriesapp.databinding.FragmentCountriesListBinding
import net.tipam2022.countriesapp.models.Country
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


class CountriesList : Fragment() {

    private var _binding: FragmentCountriesListBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCountriesListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Retrofit implementation
        try{
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
            val service = retrofit.create(ApiService::class.java)
            val countriesRequest = service.getCountries()
            countriesRequest.enqueue(object : Callback<List<Country>> {
                @RequiresApi(Build.VERSION_CODES.N)
                override fun onResponse(call: Call<List<Country>>,
                                        response: Response<List<Country>>
                ) {
                    countries = response.body()
                    if (countries != null) {
                        for (country in countries!!){
                            Toast.makeText(requireContext(), "${country.name.common}", Toast.LENGTH_LONG*7).show()

                        }
                        var mapper: JsonMapper = JsonMapper()
                        var jsonString = mapper.writeValueAsString(countries!!.get(249).currencies)
                        println("------->${getKeysInJsonUsingJsonNodeFieldNames(jsonString, mapper)?.size}")
                        Toast.makeText(requireContext(), "${countries!!.size}", Toast.LENGTH_LONG*7).show()

                        try{
                            var recycleView = binding.countries
                            recycleView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
                            recycleView.adapter = CountryAdapter(countries!!)
                        }catch (e: Exception){
                            Toast.makeText(requireContext(), "Error Occurred: ${e.message}", Toast.LENGTH_LONG*100).show()
                        }
                    }
                }
                override fun onFailure(call: Call<List<Country>>, t: Throwable) {
                    Toast.makeText(requireContext(), "Error Occurred: ${t.message}", Toast.LENGTH_LONG*100).show()
                }
            })

        }
        catch (e: Exception){
            Toast.makeText(requireContext(), "Error Occurred: ${e.message}", Toast.LENGTH_LONG*20).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_list, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}
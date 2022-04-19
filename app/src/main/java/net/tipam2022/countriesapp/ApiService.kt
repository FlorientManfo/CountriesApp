package net.tipam2022.countriesapp

import net.tipam2022.countriesapp.models.*
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("v3.1/all")
    fun getCountries(): Call<List<Country>>
}
package net.tipam2022.countriesapp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CountryAdapter():
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>()  {
    
    var countries: ArrayList<Country>? = null
    class CountryViewHolder(viewHolder: View): RecyclerView.ViewHolder(viewHolder) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
package net.tipam2022.countriesapp

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.AsyncTask
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.core.view.children
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.paris.extensions.style
import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import kotlinx.serialization.json.JsonObject
import net.tipam2022.countriesapp.models.Country
import org.json.JSONObject

class CountryAdapter(var countries: List<Country>):
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>()  {

    class CountryViewHolder(viewHolder: View): RecyclerView.ViewHolder(viewHolder) {
        var flag: ImageView = viewHolder.findViewById(R.id.flag)
        var countryName: TextView = viewHolder.findViewById(R.id.countryName)
        var countryCode: TextView = viewHolder.findViewById(R.id.countryCode)
        var initial: TextView = viewHolder.findViewById(R.id.initial)
        var dropdown: ImageButton = viewHolder.findViewById(R.id.dropdownDetails)
        var more: LinearLayout = viewHolder.findViewById(R.id.more)
        var region: TextView = viewHolder.findViewById(R.id.region)
        var officialName: TextView = viewHolder.findViewById(R.id.officialName)
        var capital: TextView = viewHolder.findViewById(R.id.capital)
        var languages: ChipGroup = viewHolder.findViewById(R.id.languages)
        var currencies: TextView = viewHolder.findViewById(R.id.currencies)
        var seeMore: Button = viewHolder.findViewById(R.id.seeMore)

        init{
            dropdown.setOnClickListener {
                if(more.visibility == View.GONE){
                    more.visibility = View.VISIBLE
                    dropdown.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24)
                }
                else{
                    more.visibility = View.GONE
                    dropdown.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24)
                }
            }

            seeMore.setOnClickListener {
                val action = CountriesListDirections.actionCountriesListToCountryDetails(countries!![position])
                findNavController(viewHolder).navigate(action)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return CountryViewHolder(view)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        DownloadImageFromInternet(holder.flag).execute(countries[position].flags.png)
        holder.countryName.text = countries[position].name.common
        holder.countryCode.text = countries[position].idd.root+countries[position].idd.suffixes[0]
        holder.initial.text = countries[position].cca2+"/"+countries[position].cioc
        holder.region.text = countries[position].region+" / "+countries[position].subregion
        holder.officialName.text = countries[position].name.official
        holder.capital.text = countries[position].capital.joinToString(", ")
        bindLanguages(holder.languages, countries[position].languages)
        bindCurrencies(holder.currencies, countries[position].currencies)
    }

    override fun getItemCount(): Int {
        return countries.size
    }
}
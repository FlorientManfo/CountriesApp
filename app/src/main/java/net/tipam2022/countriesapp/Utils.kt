package net.tipam2022.countriesapp

import android.os.Build
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.airbnb.paris.extensions.style
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import net.tipam2022.countriesapp.models.Country
import org.json.JSONObject

var countries: List<Country>? = null
const val BASE_URL: String = "https://restcountries.com/"

@RequiresApi(Build.VERSION_CODES.N)
@Throws(JsonMappingException::class, JsonProcessingException::class)
fun getKeysInJsonUsingJsonNodeFieldNames(json: String?, mapper: ObjectMapper): List<String>? {
    val keys: MutableList<String> = ArrayList()
    val jsonNode: JsonNode = mapper.readTree(json)
    val iterator: Iterator<String> = jsonNode.fieldNames()
    iterator.forEachRemaining { e: String ->
        keys.add(
            e
        )
    }
    return keys
}


@RequiresApi(Build.VERSION_CODES.N)
fun bindCurrencies(currency: TextView, currencies: Any?) {
    var mapper = JsonMapper()
    var jsonString = mapper.writeValueAsString(currencies)
    var jsonObj: JSONObject = JSONObject(jsonString)
    var keys = getKeysInJsonUsingJsonNodeFieldNames(jsonString, mapper)

    var stringResult = ""
    keys?.forEach {
        var jsonNode = jsonObj.getJSONObject(it)
        stringResult+= it + " (${jsonNode.getString("symbol")}), "
    }
    stringResult = stringResult.substring(0, stringResult.length - 2 )
    currency.text = stringResult
}

@RequiresApi(Build.VERSION_CODES.N)
fun bindLanguages(languages: ChipGroup, language: Any?) {
    var mapper = JsonMapper()
    var jsonString = mapper.writeValueAsString(language)
    var jsonObj: JSONObject = JSONObject(jsonString)
    var keys = getKeysInJsonUsingJsonNodeFieldNames(jsonString, mapper)

    keys?.forEach {
        var chip = Chip(languages.context)
        chip.text = jsonObj.getString(it)
        chip.style(R.style.chip_style)
        languages.addView(chip)
    }
}

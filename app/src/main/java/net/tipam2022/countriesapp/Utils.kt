package net.tipam2022.countriesapp

import android.os.Build
import androidx.annotation.RequiresApi
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import net.tipam2022.countriesapp.models.Country

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
package com.farkhodkhaknazarov.phonesandflags

import android.content.Context

object PhoneCodesPicker {
    /**
     * Method gets countries list
     */
    fun getCountriesList(context: Context): List<CountryCodeAndFlag> {

        val dataArray = context.resources.getStringArray(R.array.country_codes_flags)

        return dataArray.map { line ->
            val items = line.split(" ")

            CountryCodeAndFlag(
                code = items.last(),
                flag = items.first(),
                codeAndFlag = line
            )
        }
    }

    /**
     * Country item by default
     */
    val defaultCountryData = CountryCodeAndFlag(
        code = "+7",
        flag = "\uD83C\uDDF7\uD83C\uDDFA",
        codeAndFlag = "\uD83C\uDDF7\uD83C\uDDFA +7"
    )
}
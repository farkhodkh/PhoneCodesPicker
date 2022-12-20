package com.farkhodkhaknazarov.phonesandflags

/**
 * Country identification class for phone list
 */
data class CountryCodeAndFlag(
    /**
     * Country phone code
     */
    val code: String,
    /**
     * Country flag unicode
     */
    val flag: String,
    /**
     * Country phone and flag
     */
    val codeAndFlag: String
)
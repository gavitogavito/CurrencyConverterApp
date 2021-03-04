package com.example.currencyconverterapp.main

import com.example.currencyconverterapp.data.models.CurrencyResponse
import com.example.currencyconverterapp.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>

}
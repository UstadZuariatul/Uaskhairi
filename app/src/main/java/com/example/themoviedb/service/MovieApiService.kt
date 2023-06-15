package com.example.themoviedb.service

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieApiService {

    companion object val BASE_URL = "https://www.api.themoviedb.org"

    private var retrofit: Retrofit? = null

    fun getInstance(): Retrofit{
        if(retrofit == null){
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            }
            return retrofit!!
        }
}
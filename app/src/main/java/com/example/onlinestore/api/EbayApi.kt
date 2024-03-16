package com.example.onlinestore.api

import retrofit2.Call
import com.example.onlinestore.models.Item
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface EbayApi {
    @Headers(
        "Accept: application/json",
        "Authorization:Bearer <token>",
        "Content-Type: application/json",
        "X-EBAY-C-MARKETPLACE-ID: EBAY_US"
    )
    @GET("buy/browse/v1/item_summary/search")
    fun findEbayItem(
        @Query("q") item: String,
        @Query("offset") offsetNum: Int,
        @Query("filter") filterName: String
    )
            : Call<Item>
}
package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class BestSellerBook {
    @SerializedName("rank")
    var rank = 0

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("author")
    var author: String? = null

    //TODO bookImageUrl
    @JvmField
    @SerializedName("bookImageUrl")
    var bookImageUrl: String? = null

    //Create a String? variable called bookImageUrl that will match the correct JSON key.
    // Create a String? variable called description that will match the correct JSON key.

    //TODO description
    @JvmField
    @SerializedName("description")
    var description: String? = null


    //TODO-STRETCH-GOALS amazonUrl
}
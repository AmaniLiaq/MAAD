package com.b16.maadproject.model

import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("Result") val title: String,
    @SerializedName("Icon") val icon: Icon,
    @SerializedName("Text") val description: String
) {


}

data class Icon(@SerializedName("URL") val url: String)

enum class CharacterType(val type: String){
    SIMPSONS("simpsons+characters"),
    WIRE("the+wire+characters")
}
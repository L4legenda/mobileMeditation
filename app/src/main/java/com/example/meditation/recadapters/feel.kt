package com.example.meditation.recadapters

import com.example.meditation.R

data class feel(val image:Int, val name_feel:String)
class MyFeel{
    val list = arrayListOf(
        feel(R.drawable.ic_cuate, "Спокойным"),
        feel(R.drawable.ic_pana, "Расслабленым"),
        feel(R.drawable.ic_rafiki, "Сосредоточеным")
    )
}
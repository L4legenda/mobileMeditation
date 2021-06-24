package com.example.meditation.recadapters

import com.example.meditation.R

data class feel2(val image:Int, val title_feel:String, val descript_feel:String)
class MyFeel2{
    val list = arrayListOf(
        feel2(R.drawable.cuate2, "Заголовок Блока", "Кратенькое описание"),
        feel2(R.drawable.cuate2, "Заголовок Блока", "Кратенькое описание"),
        feel2(R.drawable.cuate2, "Заголовок Блока", "Кратенькое описание")
    )

}
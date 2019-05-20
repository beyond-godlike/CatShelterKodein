package com.unava.dia.catshelterkodein

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import android.widget.TextView
import org.kodein.di.generic.instance
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware

class MainActivity : AppCompatActivity(), KodeinAware {

    override lateinit var kodein: Kodein
    private val cat: String by instance<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kodein = (application as CatShelterApp).kodein

        val tv = findViewById<TextView>(R.id.tv)
        tv.setText(cat)
    }
}

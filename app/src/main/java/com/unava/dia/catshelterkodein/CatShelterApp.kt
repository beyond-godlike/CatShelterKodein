package com.unava.dia.catshelterkodein

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class CatShelterApp : Application(), KodeinAware {
    // Using Kodein.lazy allows you to access the Context at binding time.
    override val kodein by Kodein.lazy {
        bind<String>() with singleton { "one cat" }
    }

    // поменять в манифесте CatShelterApp

}
package com.smrahmadi.blooddependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smrahmadi.blooddependencyinjection.dagger.DaggerPersonComponent
import com.smrahmadi.blooddependencyinjection.dagger.PersonModule
import com.smrahmadi.blooddependencyinjection.person.Person
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Person model without name parameter

        //DaggerPersonComponent
        // .create()
        // .inject(this)

        //person.getBloodType()

        DaggerPersonComponent
            .builder()
            .personModule(PersonModule("Andy"))
            .build()
            .inject(this)

        person.sayHello()
        person.getBloodType()

    }
}

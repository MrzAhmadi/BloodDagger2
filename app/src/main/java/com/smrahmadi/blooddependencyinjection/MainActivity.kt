package com.smrahmadi.blooddependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smrahmadi.blooddependencyinjection.dagger.DaggerPersonComponent
import com.smrahmadi.blooddependencyinjection.person.Person
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerPersonComponent.create().inject(this)
        person.getBloodType()

    }
}

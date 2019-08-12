package com.smrahmadi.blooddependencyinjection.dagger

import com.smrahmadi.blooddependencyinjection.MainActivity
import com.smrahmadi.blooddependencyinjection.person.Person
import dagger.Component
import javax.inject.Inject

@Component (modules = [PersonModule::class])
interface PersonComponent {
    fun injectPerson():Person
    fun inject(mainActivity: MainActivity)
}
package com.smrahmadi.blooddependencyinjection.dagger

import com.smrahmadi.blooddependencyinjection.person.Body
import com.smrahmadi.blooddependencyinjection.person.Person
import com.smrahmadi.blooddependencyinjection.person.blood.*
import dagger.Module
import dagger.Provides
import java.util.*

@Module
class PersonModule(private var personName: String) {

    @Provides
    fun providePerson(body: Body): Person = Person(personName, body)

    @Provides
    fun provideBody(blood: Blood): Body = Body(blood)

    @Provides
    fun provideBlood(): Blood {
        return when (Random().nextInt(3)) {
            0 -> A_Blood()
            1 -> B_Blood()
            2 -> AB_Blood()
            4 -> O_Blood()
            else -> A_Blood()
        }
    }
}
package com.smrahmadi.blooddependencyinjection.person.blood

import javax.inject.Inject

class A_Blood @Inject constructor() : Blood {

    override fun getType(): String = "Blood type is A"
}
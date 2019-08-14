package com.smrahmadi.blooddependencyinjection.person

import android.util.Log
import javax.inject.Inject

class Person @Inject constructor(
    private var name: String,
    private var body: Body
) {

    companion object {
        const val TAG = "Person"
    }

    fun getBloodType() = Log.v(TAG, body.blood.getType())

    fun sayHello() = Log.v(TAG,"Hi i'm $name")
}
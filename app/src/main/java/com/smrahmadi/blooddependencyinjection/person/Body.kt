package com.smrahmadi.blooddependencyinjection.person

import com.smrahmadi.blooddependencyinjection.person.blood.Blood
import javax.inject.Inject

class Body @Inject constructor(var blood: Blood)

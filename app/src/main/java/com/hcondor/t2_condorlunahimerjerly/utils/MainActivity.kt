package com.hcondor.t2_condorlunahimerjerly.utils

import android.app.Application
import com.google.firebase.FirebaseApp

class MainActivity : Application() {

    override fun onCreate() {
        super.onCreate()

        FirebaseApp.initializeApp(this)
    }

}
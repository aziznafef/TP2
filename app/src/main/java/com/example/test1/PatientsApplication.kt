
package com.example.test1

import android.app.Application
import com.example.test1.di.AppContainer

class PatientsApplication : Application() {
    val container by lazy { AppContainer() }
}

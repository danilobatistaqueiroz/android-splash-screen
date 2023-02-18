package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // *** delay ***
        // **** option 1 ****
        var keepSplashOnScreen = true
        val delay = 500L
        installSplashScreen().setKeepOnScreenCondition { keepSplashOnScreen }
        Handler(Looper.getMainLooper()).postDelayed({ keepSplashOnScreen = false }, delay)

        // **** option 2 ****
        //runBlocking { delay(3200) }
        setContentView(R.layout.activity_main)

        /***** For some reason when the app is launched through android studio it doesn't show the icon.
         * Kill the app and launch app from the menu. Then the icon will appear. ****/
    }
}
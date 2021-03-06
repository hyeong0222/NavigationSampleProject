package com.example.navigationsampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainBottomNavigation: BottomNavigationView = findViewById(R.id.main_bottom_navigation)
        NavigationUI.setupWithNavController(mainBottomNavigation, findNavController(R.id.nav_host))
    }
}
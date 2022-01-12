package com.example.navigationsampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainBottomNavigation: BottomNavigationView = findViewById(R.id.main_bottom_navigation)
        val navHostFragment: NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        val navController = navHostFragment.navController

//        NavigationUI.setupActionBarWithNavController(this, navController)
//        NavigationUI.setupWithNavController(mainBottomNavigation, findNavController(R.id.nav_host))
        mainBottomNavigation.setupWithNavController(navController)
    }
}
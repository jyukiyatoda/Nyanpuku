package com.example.nyanpuku

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.GridView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.nyanpuku.ui.dashboard.DashboardFragment
import com.example.nyanpuku.ui.home.HomeFragment
import com.example.nyanpuku.ui.notifications.NotificationsFragment
import com.example.nyanpuku.ui.zaisekicat.ZaisekicatFragment

class MainActivity : AppCompatActivity() {

    private lateinit var mGridAdapter: GridAdapter

    private val mOnNavigationItemSelectedListener=BottomNavigationView.OnNavigationItemSelectedListener{ item ->
        when(item.itemId){
            R.id.navigation_home ->{
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout,HomeFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications ->{
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout,NotificationsFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_zaisekicat ->{
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout,ZaisekicatFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true

                GridView gridview=(GridView)findViewId(R.id.gridview)
                GridView.setadapter=GridAdapter
            }
            R.id.navigation_dashboard ->{
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout,DashboardFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}

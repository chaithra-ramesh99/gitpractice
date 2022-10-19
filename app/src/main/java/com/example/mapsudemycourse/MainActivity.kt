package com.example.mapsudemycourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mapmyindia.sdk.maps.MapView
import com.mapmyindia.sdk.maps.MapmyIndia
import com.mmi.services.account.MapmyIndiaAccountManager

class MainActivity : AppCompatActivity() {
    lateinit var mapView: MapView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mapView = findViewById(R.id.map_view)

        MapmyIndiaAccountManager.getInstance().restAPIKey = "fb0dbde3abfd0a8350114b857e911946"
        MapmyIndiaAccountManager.getInstance().mapSDKKey = "fb0dbde3abfd0a8350114b857e911946"
        MapmyIndiaAccountManager.getInstance().atlasClientId = "33OkryzDZsLw3vdFTcCWmmpAN_01PHzKLP2HzzWDNtivFBSNGcHeGVA3NgeVqpgoFL41AG5fhzED3pcivHNFRg=="
        MapmyIndiaAccountManager.getInstance().atlasClientSecret = "lrFxI-iSEg8YqyzoLOvbEdN46Qbx8_L_rPkZZp4TlvrbF_Mqi99_E9Zd3dzVZhJ_sc9rcdhApnChuMqOZTiJcfVrksAJ7Sq5"
        MapmyIndia.getInstance(applicationContext)


        mapView.onCreate(savedInstanceState)



    }


    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onStop() {
        super.onStop()
        mapView.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapView.onSaveInstanceState(outState)
    }

}

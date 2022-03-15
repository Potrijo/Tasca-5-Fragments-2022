package com.example.video2fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.video2fragments.databinding.ActivityMainBinding

private const val TAG = "PEPE: "

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var numFragmento = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "passa por binding")
        var boton: Button = findViewById(R.id.button)
        var boton2: Button = findViewById(R.id.button2)
        var boton3: Button = findViewById(R.id.button3)

        boton.setOnClickListener {
            Log.d(TAG, "boton dos")

            val bundle = Bundle() // mapa conjunto de datos clave valor
            bundle.putInt("numero", ++numFragmento)

            val transaccion = supportFragmentManager.beginTransaction()
            val fragmento = FragmentUno()
            fragmento.arguments = bundle
            transaccion.replace(R.id.fragmentContainerView, fragmento)
            transaccion.addToBackStack(null)
            transaccion.commit()
        }

        boton2.setOnClickListener {
            Log.d(TAG, "boton dos")
            val transaccion = supportFragmentManager.beginTransaction()
            val fragmento = FragmentDos()
            transaccion.replace(R.id.fragmentContainerView, fragmento)
            transaccion.addToBackStack(null)
            transaccion.commit()
        }

        boton3.setOnClickListener {
            Log.d(TAG, "boton dos")
            val transaccion = supportFragmentManager.beginTransaction()
            val fragmento = FragmentTres()
            transaccion.replace(R.id.fragmentContainerView, fragmento)
            transaccion.addToBackStack(null)
            transaccion.commit()
        }


    }
}
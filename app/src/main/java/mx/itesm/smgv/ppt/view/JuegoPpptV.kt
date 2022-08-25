package mx.itesm.smgv.ppt.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import mx.itesm.smgv.ppt.R
import mx.itesm.smgv.ppt.databinding.ActivityMainBinding
import mx.itesm.smgv.ppt.model.Elemento
import mx.itesm.smgv.ppt.view_model.JuegoPptVM

/**
 * Autor: Sergio Gonzalez
 * La vista del Juego PPT
 */
class JuegoPpptV : AppCompatActivity() {
    // viewModel
    private val viewModel: JuegoPptVM by viewModels()
    // binding
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarObservables()
        registrarEventos()
    }

    private fun registrarEventos() {
        binding.btnPiedra.setOnClickListener {
            viewModel.jugar(Elemento.PIEDRA)
        }
        binding.btnPapel.setOnClickListener {
            viewModel.jugar(Elemento.PAPEL)
        }
        binding.btnTijera.setOnClickListener {
            viewModel.jugar(Elemento.TIJERAS)
        }
    }

    private fun configurarObservables() {
        viewModel.puntosJugador.observe(this) { puntos ->
            binding.etPuntosJugador.setText(puntos.toString())

        }
        viewModel.puntosComputadora.observe(this) { puntos ->
            binding.etPuntosComputadora.setText(puntos.toString())
        }
    }
}
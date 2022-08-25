package mx.itesm.smgv.ppt.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mx.itesm.smgv.ppt.model.Elemento
import mx.itesm.smgv.ppt.model.PiedraPapelTijeras


/**
 * @author Sergio Gonzalez
 * ViewModel de @JuegoPptV
 */
class JuegoPptVM : ViewModel () {

    // Modelo
    private var ppt = PiedraPapelTijeras()

    //Vista. Variabes observabl
    val puntosJugador = MutableLiveData(0)
    val puntosComputadora = MutableLiveData(0)

    // Interfaz. Funciones que proporciona el ViewModel
    // Normalmente llamados por los eventos de la Vista<<
    fun jugar(elementoJugador: Elemento) {
        // La computadora juega al azar
        val elementoComputadora = ppt.generarElemento()
        // pedimos al modelo que resuelva
        val resultado = ppt.jugar(elementoJugador, elementoComputadora)
        // Actualizamos las variables Observables
        puntosJugador.value = ppt.puntosJugador
        puntosComputadora.value = ppt.puntosComputadora
    }


















































}
package mx.itesm.smgv.ppt

import mx.itesm.smgv.ppt.model.Elemento
import mx.itesm.smgv.ppt.model.PiedraPapelTijeras
import mx.itesm.smgv.ppt.model.Resultado
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun validarEmpate() {
        val ppt = PiedraPapelTijeras()
        for(elementoJugador in Elemento.values()) {
            for(elementoComputadora in Elemento.values()) {
                if (elementoJugador == elementoComputadora) {
                    assertEquals(Resultado.EMPATE, ppt.jugar(elementoJugador, elementoComputadora))
                }
                else {
                    assertNotEquals(Resultado.EMPATE, ppt.jugar(elementoJugador, elementoComputadora))
                }
            }
        }
    }

}
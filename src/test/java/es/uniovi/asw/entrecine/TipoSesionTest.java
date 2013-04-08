package es.uniovi.asw.entrecine;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import es.uniovi.asw.entrecine.model.Dia_Espectador;
import es.uniovi.asw.entrecine.model.Diario;
import es.uniovi.asw.entrecine.model.Matutino;
import es.uniovi.asw.entrecine.model.Noche;

public class TipoSesionTest {

    @Test 
    public void cambiarPrecioDia_Espectador() {
        Dia_Espectador.getInstance().setPrecio(5.5);
        assertThat(Dia_Espectador.getInstance().getPrecio()==5.5);
    }
    
    @Test 
    public void cambiarPrecioDiario() {
        Diario.getInstance().setPrecio(4.35);
        assertThat(Diario.getInstance().getPrecio()==4.35);
    }
    
    @Test 
    public void cambiarPrecioMatutino() {
        Matutino.getInstance().setPrecio(6.1);
        assertThat(Matutino.getInstance().getPrecio()==6.1);
    }
    
    @Test 
    public void cambiarPrecioNoche() {
       Noche.getInstance().setPrecio(7.25);
        assertThat(Noche.getInstance().getPrecio()==7.25);
    }

}

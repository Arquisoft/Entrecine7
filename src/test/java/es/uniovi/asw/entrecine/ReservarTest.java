package es.uniovi.asw.entrecine;

import static org.fest.assertions.Assertions.assertThat;

import java.util.Date;

import org.junit.Test;

import es.uniovi.asw.entrecine.model.Dia_Espectador;
import es.uniovi.asw.entrecine.model.EstadoButaca;
import es.uniovi.asw.entrecine.model.FranjaHoraria;
import es.uniovi.asw.entrecine.model.Pelicula;
import es.uniovi.asw.entrecine.model.Sala;
import es.uniovi.asw.entrecine.model.Sesion;
import es.uniovi.asw.entrecine.model.Sesion_Pelicula;

public class ReservarTest {
	
	Sesion_Pelicula programa;
	
	@org.junit.Before
	public void iniciar(){
		Pelicula pelicula = new Pelicula("El señor de los anillos","Pues eso, una historia muy larga", 180);
		Sala sala = new Sala(1,10,12);
		Sesion sesion = new Sesion(Dia_Espectador.getInstance(),FranjaHoraria.TARDE);
		programa = new Sesion_Pelicula(sesion, pelicula, sala, new Date());
	}

    @Test 
    public void reservarButaca() {
        programa.getSala().reservarButaca(7, 7);
        assertThat(programa.getSala().getButacas()[7][7].getEstado().equals(EstadoButaca.RESERVADA));
    }
  

}

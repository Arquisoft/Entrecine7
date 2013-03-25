package es.uniovi.asw.entrecine;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Assert;

import cucumber.api.Format;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Dada;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Cuando;
import cucumber.runtime.PendingException;
import es.uniovi.asw.entrecine.Reservation;

public class AforoCompleto {
	
	private Reservation r;
	
	
	@Dado("^un cine completo con (\\d+) butacas$")
	public void una_reserva_de_butacas(int seats) throws Throwable {
	    r = new Reservation(seats);
	}
	
	@Cuando("^yo compro una entrada y aforo esta lleno$")
	public void yo_compro_una_entrada_y_aforo_esta_lleno() throws Throwable {
	}

	@Entonces("^la disponibilidad debe ser (.+)$")
	public void la_disponibilidad_debe_ser_false(String disponibilidad) throws Throwable {
		Assert.assertEquals(disponibilidad, "false");
	}

	

}
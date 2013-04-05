package es.uniovi.asw.entrecine;

import java.util.ArrayList;
import java.util.List;


public class Sesion {
	
	private TipoSesion tipo;
	private FranjaHoraria franjaHoraria;
	private List<Sesion_Pelicula> peliculas = new ArrayList<Sesion_Pelicula>();

	public TipoSesion getTipo() {
		return tipo;
	}

	public void setTipo(TipoSesion tipo) {
		this.tipo = tipo;
	}

	public FranjaHoraria getFranjaHoraria() {
		return franjaHoraria;
	}

	public void setFranjaHoraria(FranjaHoraria franjaHoraria) {
		this.franjaHoraria = franjaHoraria;
	}

}

package es.uniovi.asw.entrecine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sesion {
	
	private TipoSesion tipo;
	private FranjaHoraria franjaHoraria;
	private List<Sesion_Pelicula> peliculas = new ArrayList<Sesion_Pelicula>();

	public Sesion(TipoSesion tipo, FranjaHoraria franjaHoraria) {
		super();
		this.tipo = tipo;
		this.franjaHoraria = franjaHoraria;
	}

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

	public List<Sesion_Pelicula> getPeliculas() {
		return Collections.unmodifiableList(peliculas);
	}
	

}

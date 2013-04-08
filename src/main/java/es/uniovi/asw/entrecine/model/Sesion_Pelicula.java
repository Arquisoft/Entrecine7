package es.uniovi.asw.entrecine.model;

import java.util.Date;

public class Sesion_Pelicula {

	private Sesion sesion;
	private Pelicula pelicula;
	private Sala sala;
	private Date horario;
	
	public Sesion_Pelicula(Sesion sesion, Pelicula pelicula, Sala sala,
			Date horario) {
		super();
		this.sesion = sesion;
		this.pelicula = pelicula;
		this.sala = sala;
		this.horario = horario;
	}

	public Sesion getSesion() {
		return sesion;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public Sala getSala() {
		return sala;
	}

	public Date getHorario() {
		return horario;
	}
	
	
}

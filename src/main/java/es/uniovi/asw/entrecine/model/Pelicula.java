package es.uniovi.asw.entrecine.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pelicula {

	private String titulo;
	private String sinopsis;
	private String fotoCartel;
	private int duracion;
	private List<Sesion_Pelicula> sesiones = new ArrayList<Sesion_Pelicula>();

	public Pelicula(String titulo, String sinopsis, String fotoCartel,
			int duracion) {
		super();
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.fotoCartel = fotoCartel;
		this.duracion = duracion;
	}

	public Pelicula(String titulo, String sinopsis, int duracion) {
		super();
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getFotoCartel() {
		return fotoCartel;
	}

	public void setFotoCartel(String fotoCartel) {
		this.fotoCartel = fotoCartel;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public List<Sesion_Pelicula> getSesiones() {
		return Collections.unmodifiableList(sesiones);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duracion;
		result = prime * result
				+ ((sinopsis == null) ? 0 : sinopsis.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (duracion != other.duracion)
			return false;
		if (sinopsis == null) {
			if (other.sinopsis != null)
				return false;
		} else if (!sinopsis.equals(other.sinopsis))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}

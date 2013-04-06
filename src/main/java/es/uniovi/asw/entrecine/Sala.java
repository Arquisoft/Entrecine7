package es.uniovi.asw.entrecine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sala {

	private int num_sala;
	private int filas;
	private int columnas;
	private Butaca[][] butacas;
	private List<Sesion_Pelicula> sesiones = new ArrayList<Sesion_Pelicula>();
	
	public int getFilas() {
		return filas;
	}
	
	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public Butaca[][] getButacas() {
		return butacas;
	}

	public Sala(int numero, int filas, int columnas) {
		super();
		this.num_sala=numero;
		this.filas = filas;
		this.columnas = columnas;
		butacas = new Butaca[filas][columnas];
		for(int i=0; i<filas; i++)
			for(int j=0; j<columnas; j++)
				butacas[i][j]=new Butaca();
	}
	
	public void reservarButaca(int fila,int columna) {
		butacas[fila][columna].reservar();
	}

	public List<Sesion_Pelicula> getSesiones() {
		return Collections.unmodifiableList(sesiones);
	}

	public int getNum_sala() {
		return num_sala;
	}

	public void setNum_sala(int num_sala) {
		this.num_sala = num_sala;
	}
	
	
}

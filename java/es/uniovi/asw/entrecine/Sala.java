package es.uniovi.asw.entrecine;

public class Sala {

	private int filas;
	private int columnas;
	private Butaca[][] butacas;
	
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

	public Sala(int filas, int columnas) {
		super();
		this.filas = filas;
		this.columnas = columnas;
		butacas = new Butaca[filas][columnas];
	}
	
	public void reservarButaca(int fila,int columna) {
		butacas[fila][columna].reservar();
	}
	
	
}

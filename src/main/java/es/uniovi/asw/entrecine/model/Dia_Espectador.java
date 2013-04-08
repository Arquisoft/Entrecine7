package es.uniovi.asw.entrecine.model;

public class Dia_Espectador extends TipoSesion{
	
	private static Dia_Espectador instance;
	
	private Dia_Espectador(){
		super();
	}
	
	public static Dia_Espectador getInstance(){
		if(instance==null)
			instance = new Dia_Espectador();
		return instance;
	}
	
	
}

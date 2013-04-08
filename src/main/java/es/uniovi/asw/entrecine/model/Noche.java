package es.uniovi.asw.entrecine.model;

public class Noche extends TipoSesion {

private static Noche instance;
	
	private Noche(){
		super();
	}
	
	public static Noche getInstance(){
		if(instance==null)
			instance = new Noche();
		return instance;
	}
}

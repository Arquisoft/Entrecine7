package es.uniovi.asw.entrecine;

public class Diario extends TipoSesion{

private static Diario instance;
	
	private Diario(){
		super();
	}
	
	public static Diario getInstance(){
		if(instance==null)
			instance = new Diario();
		return instance;
	}
}

package es.uniovi.asw.entrecine.model;

public class Matutino extends TipoSesion{
	
private static Matutino instance;
	
	private Matutino(){
		super();
	}
	
	public static Matutino getInstance(){
		if(instance==null)
			instance = new Matutino();
		return instance;
	}

}

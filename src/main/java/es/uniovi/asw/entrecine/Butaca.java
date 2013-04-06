package es.uniovi.asw.entrecine;

public class Butaca {

	private EstadoButaca estado;
	
	public Butaca(){
		estado = EstadoButaca.LIBRE;
	}

	public void reservar() {
		if(estado.equals(EstadoButaca.LIBRE))
			estado=EstadoButaca.RESERVADA;
	}

	public EstadoButaca getEstado() {
		return estado;
	}

	public void setEstado(EstadoButaca estado) {
		this.estado = estado;
	}
}

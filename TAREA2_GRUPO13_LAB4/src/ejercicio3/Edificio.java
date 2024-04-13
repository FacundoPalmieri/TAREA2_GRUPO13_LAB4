package ejercicio3;

public class Edificio {
	
	private double superficieEdificio;
	//private ITipoInstalacion tipoInstalacion;
	
	public Edificio() {
		this.superficieEdificio = 0;
	}
	
	
	public Edificio(double SuperficieEdificio) {
		this.superficieEdificio = SuperficieEdificio;
	}
	
	/*
	public Edificio(double SuperficieEdificio, ITipoInstalacion TipoInstalacion) {
		this.superficieEdificio = SuperficieEdificio;
		this.tipoInstalacion = TipoInstalacion;
	}*/
	
	public double getSuperficieEdificio() {
		return superficieEdificio;
	}
	
}


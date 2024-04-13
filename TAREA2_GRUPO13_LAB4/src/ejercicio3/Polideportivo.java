package ejercicio3;

public class Polideportivo extends InstalacionDeportiva implements ITipoInstalacion {
	
	private String Nombre;

	
	public Polideportivo(String nombre, double Superficie) {
		super(nombre, Superficie);
		Nombre = nombre;
	}
	
	
	public String getNombre() {
		return Nombre;
	}

	@Override
	public String toString() {
		return "Polideportivo " + Nombre + " - Superficie= "+ getSuperficieEdificio() + " - Tipo de Instalacion: "+ getTipoDeInstalacion() ;
	}


	@Override
	public int getTipoDeInstalacion() {
		return 2;
	}
	
	
	
	
	
	
	

}

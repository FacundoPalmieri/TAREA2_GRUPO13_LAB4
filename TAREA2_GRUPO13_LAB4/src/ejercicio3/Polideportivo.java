package ejercicio3;

public class Polideportivo extends InstalacionDeportiva {
	
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
		return "Polideportivo [Nombre=" + Nombre + "][Superficie= "+ getSuperficieEdificio() + "]";
	}
	
	
	
	
	
	
	

}

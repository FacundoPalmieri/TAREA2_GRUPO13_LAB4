package ejercicio3;

public class Polideportivo implements InstalacionDeportiva, Edificio{

	private String nombre;

    public Polideportivo(String nombre) {
        this.nombre = nombre;
    }
        
	@Override
	public double getSuperficieEdificio() {
		
		return 0;
	}

	@Override
	public int getTipoDeInstalacion() {

		return 0;
	}
	

}

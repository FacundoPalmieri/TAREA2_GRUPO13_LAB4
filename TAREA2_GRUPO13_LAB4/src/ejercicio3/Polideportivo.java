package ejercicio3;

public class Polideportivo implements InstalacionDeportiva, Edificio{

	private String nombre;
    private double superficie;

    public Polideportivo(String nombre, double superficie) {
        this.nombre = nombre;
        this.superficie = superficie;
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

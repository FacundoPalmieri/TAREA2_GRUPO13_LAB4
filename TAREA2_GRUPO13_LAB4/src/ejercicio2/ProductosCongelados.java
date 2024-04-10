package ejercicio2;

public class ProductosCongelados extends Producto {
private int temperaturaRecomendada;
	
	// Constructors
	public ProductosCongelados() {
		
		
		this.temperaturaRecomendada = 10;
	}	

	public ProductosCongelados(int temperaturaRecomendada) {
		
		
		this.temperaturaRecomendada = temperaturaRecomendada;
		
	}
	
	// getters, setters y ToString
	

	public int getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}

	public void setTemperaturaRecomendada(int temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	
	}	
	
	
	@Override
	public String toString() {
		return "Producto Congelado: Temperatura recomendada " + temperaturaRecomendada + ", " + super.toString();
	}
}
	
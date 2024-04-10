package ejercicio2;

public class ProductosRefrigerados extends Producto {
private int temperaturaCongelacionRecomendada;
	
	//Constructors
	public ProductosRefrigerados() {
		
		super();
		this.temperaturaCongelacionRecomendada = -1;
		
	}
	
	public ProductosRefrigerados(int temperaturaCongelacionRecomendada) {
		
		
		this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
		
	}

	// getters, setters

	public int getTemperaturaCongelacionRecomendada() {
		return temperaturaCongelacionRecomendada;
	}


	public void setTemperaturaCongelacionRecomendada(int temperaturaCongelacionRecomendada) {
		this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
	}


	//ToString		
	@Override
	public String toString() {
		return "Producto Refrigerado: Temperatura recomendada:" + temperaturaCongelacionRecomendada + ", " + super.toString();
	}
	
}

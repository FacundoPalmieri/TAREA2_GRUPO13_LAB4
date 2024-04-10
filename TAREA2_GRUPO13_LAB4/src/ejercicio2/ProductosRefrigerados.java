package ejercicio2;

public class ProductosRefrigerados extends Producto {
	private int temperaturaCongelacionRecomendada;
	private String codigoOrganismoSupervisor;
	
	public String getCodigoOrganismoSupervisor() {
		return codigoOrganismoSupervisor;
	}

	public void setCodigoOrganismoSupervisor(String codigoOrganismoSupervisor) {
		this.codigoOrganismoSupervisor = codigoOrganismoSupervisor;
	}

	@Override
	public String toString() {
		return "ProductosRefrigerados [temperaturaCongelacionRecomendada=" + temperaturaCongelacionRecomendada
				+ ", codigoOrganismoSupervisor=" + codigoOrganismoSupervisor + "]";
	}

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


	
}

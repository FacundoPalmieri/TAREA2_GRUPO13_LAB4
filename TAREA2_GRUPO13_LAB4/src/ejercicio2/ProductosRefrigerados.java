package ejercicio2;

public class ProductosRefrigerados extends Producto {
	private int temperaturaCongelacionRecomendada;
	private String codigoOrganismoSupervisor;
	
	//Constructors
	public ProductosRefrigerados() {
			
		super();
		this.temperaturaCongelacionRecomendada = -1;
		this.codigoOrganismoSupervisor = "sin dato";	
		}
		
	public ProductosRefrigerados(int temperaturaCongelacionRecomendada, String CodigoOrganismo) {
			
			
		this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
		this.codigoOrganismoSupervisor = CodigoOrganismo;	
	}

		// getters, setters

	public int getTemperaturaCongelacionRecomendada() {
		return temperaturaCongelacionRecomendada;
	}


	public void setTemperaturaCongelacionRecomendada(int temperaturaCongelacionRecomendada) {
		this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
	}


	public String getCodigoOrganismoSupervisor() {
		return codigoOrganismoSupervisor;
	}

	public void setCodigoOrganismoSupervisor(String codigoOrganismoSupervisor) {
		this.codigoOrganismoSupervisor = codigoOrganismoSupervisor;
	}

		
	//Método ToString
	@Override
	public String toString() {
		return "ProductosRefrigerados: Temperatura de congelacion recomendada " + temperaturaCongelacionRecomendada
				+ ", código Organismo Supervisor " + codigoOrganismoSupervisor + "]";
	}

}

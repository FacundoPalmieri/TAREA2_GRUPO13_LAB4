package ejercicio2;

import java.time.LocalDate;

public class ProductosFrescos extends Producto {
	private LocalDate fechaDeEnvasado;
	private String paisDeOrigen;
	
	// Constructors
	public ProductosFrescos() {
		super(LocalDate.now(), 1);
		this.fechaDeEnvasado = LocalDate.now();
		paisDeOrigen = "Sin Pais de Origen ";
	}	

	public ProductosFrescos(LocalDate fechaDeCaducidad, int numeroDeLote, LocalDate fechaDeEnvasado, String paisDeOrigen) {
		super(fechaDeCaducidad, numeroDeLote);
		this.fechaDeEnvasado = fechaDeEnvasado;
		this.paisDeOrigen = paisDeOrigen;
	}
	
	// getters, setters y ToString


	public LocalDate getFechaDeEnvasado() {
		return fechaDeEnvasado;
	}

	public void setFechaDeEnvasado(LocalDate fechaDeEnvasado) {
		this.fechaDeEnvasado = fechaDeEnvasado;
	}

	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}

	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}	
	
	@Override
	public String toString() {
		return "Producto Fresco: fechaDeEnvasado=" + fechaDeEnvasado + ", " + "Pais de Origen: " + paisDeOrigen + super.toString();
	}
}
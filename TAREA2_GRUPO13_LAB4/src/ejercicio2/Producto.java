package ejercicio2;

import java.time.LocalDate;

public class Producto {
	private LocalDate fechaDeCaducidad;
	private int numeroDeLote;	
	
	// constructores	
	public Producto()
	{
		this.fechaDeCaducidad = LocalDate.now();
		this.numeroDeLote = 1;
	}
	
	public Producto(LocalDate fechaDeCaducidad, int numeroDeLote)
	{
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.numeroDeLote = numeroDeLote;
	}
	
	// getters, setters y ToString	
	public LocalDate getFechaDeCaducidad() {
		return this.fechaDeCaducidad;
	}
	
	public void setFechaDeCaducidad(LocalDate fechaDeCaducidad) {
		this.fechaDeCaducidad = fechaDeCaducidad;
	}
	
	public int getNumeroDeLote() {
		return this.numeroDeLote;
	}
	
	public void setNumeroDeLote(int numeroDeLote) {
		this.numeroDeLote = numeroDeLote;
	}	
	
	public String toString() {
		return "Fecha de caducidad=" + this.fechaDeCaducidad + ", Numero de lote=" + this.numeroDeLote;
	}
	
}

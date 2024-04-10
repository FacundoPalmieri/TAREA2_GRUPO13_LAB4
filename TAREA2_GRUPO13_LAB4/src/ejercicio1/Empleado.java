package ejercicio1;

public class Empleado {

	private static int cont = 1000;
	private final int id;
	private String nombre;
	private int edad;
	
	

	//constructor
	
	public Empleado() {
		id = cont;
		nombre= "sin nombre";
		edad=99;
		cont ++;
	}
	
	public Empleado(String Nombre, int Edad) {
		id = cont;
		nombre = Nombre;
		edad = Edad;
		cont ++;
	}
	
	//getters y setters
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public static int devuelveProximoID() {
		System.out.println("El próximo ID será el " + cont);
		return cont;
	}

	@Override
	public String toString() {
		return "Empleado ID=" + id + ", NOMBRE=" + nombre + ", EDAD=" + edad;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}



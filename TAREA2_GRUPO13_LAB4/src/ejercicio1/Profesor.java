package ejercicio1;

public class Profesor extends Empleado {
	
	private String cargo;
	private int antiguedadDocente;

<<<<<<< HEAD

	public Profesor() {
		super();
		cargo= "sin nombre";
		antiguedadDocente=0;
	}
	
	public Profesor(String Nombre, int Edad, String Cargo, int Antiguedad) {
		super (Nombre, Edad);
		cargo= Cargo;
		antiguedadDocente= Antiguedad;
	}

	@Override
	public String toString() {
		return "Id: " + getId() + " - Nombre: " + getNombre() + " -Edad: " + getEdad() +
			   " - Cargo: " + cargo + " - AntiguedadDocente: " + antiguedadDocente;
	}



}
=======

	public Profesor() {
		super();
		cargo= "sin nombre";
		antiguedadDocente=0;
	}
	
	public Profesor(String Nombre, int Edad, String Cargo, int Antiguedad) {
		super (Nombre, Edad);
		cargo= Cargo;
		antiguedadDocente= Antiguedad;
	}

}

>>>>>>> a1e7e7e3997b8d8ffa880c8261f195df9dbe1742

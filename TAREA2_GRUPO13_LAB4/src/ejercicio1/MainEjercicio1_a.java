package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		
		Profesor p1 = new Profesor("Juan",40,"Titular", 10);
	    Profesor p2 = new Profesor("María",35,"Titular", 8);
	    Profesor p3 = new Profesor("Carlos",50,"Ayudante", 15);
	    Profesor p4 = new Profesor("Ana", 45,"Titular", 12);
	    Profesor p5 = new Profesor("Pedro", 55,"Suplente", 20);
		
		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>(5);
		listaProfesores.add(p1);
		listaProfesores.add(p2);
		listaProfesores.add(p3);
		listaProfesores.add(p4);
		listaProfesores.add(p5);
	
		System.out.println("Listado de Profesores: ");

		ListIterator<Profesor> it = listaProfesores.listIterator();
		while(it.hasNext()) {
			Profesor prof = it.next();
			System.out.println(prof.toString());
			it.remove();
		}
		
		/*for(int i=0; i<listaProfesores.size(); i++)
		{
			System.out.println(listaProfesores.get(i).toString());
		}*/
		
	
		
		
		
	}

}

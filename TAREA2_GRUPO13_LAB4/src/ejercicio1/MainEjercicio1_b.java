package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_b {
	
	public static void main(String[] args) {
			
		
			//Punto 6 - Ejercicio 1
		
			Profesor p1 = new Profesor("Mario",20,"Titular", 9);
		    Profesor p2 = new Profesor("Vanesa",55,"Titular", 1);
		    Profesor p3 = new Profesor("Lorena",60,"Ayudante", 10);
		    Profesor p4 = new Profesor("Miriam", 35,"Titular", 8);
		    Profesor p5 = new Profesor("Felix", 25,"Suplente", 2);
			
		    TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
			listaProfesores.add(p1);
			listaProfesores.add(p2);
			listaProfesores.add(p3);
			listaProfesores.add(p4);
			listaProfesores.add(p5);
		
			System.out.println("Listado de Profesores ordenado: ");
			
			
			Iterator<Profesor> itr= listaProfesores.iterator();
			while(itr.hasNext()) {
				Profesor prof = (Profesor)itr.next();
				System.out.println(prof.toString());
				itr.remove();
			}
			
			/*
			for (Profesor x : listaProfesores) {
				System.out.println(x.toString());
			}
			*/
			
			//Punto 7 - Ejercicio 1
			
			Profesor p6 = new Profesor("Pinina",20,"Titular", 9);
			Profesor p7 = new Profesor("Pinina",20,"Titular", 9);
		    
		    if(p6.equals(p7))
			{
				System.out.println("Es el mismo profesor.");
			}
			else
			{
				System.out.println("No es el mismo profesor.");
			}
		    
			
		}

}

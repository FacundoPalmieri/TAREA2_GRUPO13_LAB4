package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio3 {

	public static void main(String[] args) {
	
	Polideportivo p1 = new Polideportivo("Club Altético Independiente", 3000);
	Polideportivo p2 = new Polideportivo("Club Altético Ferro", 1500.00);
	Polideportivo p3 = new Polideportivo("Club Altético Huracan", 1000.00);
	EdificioDeOficinas e1 = new EdificioDeOficinas(1500.00);
	EdificioDeOficinas e2 = new EdificioDeOficinas(1800.00);
	
	ArrayList<Edificio> listaEdificios = new ArrayList<Edificio>(5);
	listaEdificios.add(p1);
	listaEdificios.add(p2);
	listaEdificios.add(p3);
	listaEdificios.add(e1);
	listaEdificios.add(e2);
	
	ListIterator<Edificio> it = listaEdificios.listIterator();
	while (it.hasNext()) {
		Edificio edificio = it.next();
		System.out.println(edificio.toString());
	//	it.remove();
	}
	
	//for(int i=0; i<listaEdificios.size(); i++)
//	{
	//	System.out.println(listaEdificios.get(i).toString());
//	}


	}
}

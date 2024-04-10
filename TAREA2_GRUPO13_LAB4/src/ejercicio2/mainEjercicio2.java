package ejercicio2;

import java.time.LocalDate;
import java.time.Month;

public class mainEjercicio2 {   
	public static void main(String[] args) {
        
		
		Producto producto = new Producto();
		ProductosFrescos productoFresco = new ProductosFrescos(LocalDate.now(),7,LocalDate.of(2023, Month.SEPTEMBER, 30),"Brasil ,");
		ProductosCongelados productoCongelado = new ProductosCongelados();
		ProductosRefrigerados productoRefrigerado = new ProductosRefrigerados();

		System.out.println(producto.toString());
		System.out.println(productoFresco.toString());
		System.out.println(productoCongelado.toString());
		System.out.println(productoRefrigerado.toString());
			
     }
}

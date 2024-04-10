package ejercicio2;

import java.time.LocalDate;
import java.time.Month;

public class mainEjercicio2 {   
	public static void main(String[] args) {
        
		
		Producto producto1 = new Producto();
		Producto producto2 = new Producto();
		ProductosFrescos productoFresco1 = new ProductosFrescos(LocalDate.now(),7,LocalDate.of(2023, Month.SEPTEMBER, 30),"Brasil ,");
		ProductosFrescos productoFresco2 = new ProductosFrescos(LocalDate.now(),2,LocalDate.of(2022, Month.AUGUST, 23),"Argentina ,");
		ProductosCongelados productoCongelado1 = new ProductosCongelados();
		ProductosCongelados productoCongelado2 = new ProductosCongelados();
		
		ProductosRefrigerados productoRefrigerado1 = new ProductosRefrigerados();
		ProductosRefrigerados productoRefrigerado2 = new ProductosRefrigerados();

		producto1.setFechaDeCaducidad(LocalDate.now());
		producto2.setFechaDeCaducidad(LocalDate.now());

		producto1.setNumeroDeLote(12345);
		producto2.setNumeroDeLote(54321);

		System.out.println(producto1.toString());
		System.out.println(producto2.toString());
		System.out.println(productoFresco1.toString());
		System.out.println(productoFresco2.toString());
		System.out.println(productoCongelado1.toString());
		System.out.println(productoCongelado2.toString());
		System.out.println(productoRefrigerado1.toString());
		System.out.println(productoRefrigerado2.toString());		
		
		
     }
}

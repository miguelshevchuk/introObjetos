package test;

import java.util.ArrayList;
import java.util.List;

import business.Compra;
import business.CompraProducto;
import business.DescuentoProducto;
import business.PagoContado;
import business.Producto;

public class main {

	public static void main(String[] args) {

		Producto leche = new Producto(40, 1);
		
		List<CompraProducto> comprasProducto = new ArrayList<CompraProducto>();
		
		DescuentoProducto descuentoParaLasLeches = new DescuentoProducto(leche, 2);
		
		
		CompraProducto compraDeLeches = new CompraProducto(leche, 5, descuentoParaLasLeches);
		
		comprasProducto.add(compraDeLeches);
		
		PagoContado tipoDePagoDeLasLeches = new PagoContado();
		
		
		
		Compra unaCompra = new Compra(1, comprasProducto, tipoDePagoDeLasLeches);
		
		System.out.println(unaCompra.calcularMontoTotal());
		
	}

}

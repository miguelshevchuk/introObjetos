package business;

import java.util.ArrayList;
import java.util.List;

public class Producto {
	private float precio;
	private List<Impuesto> impuestos = new ArrayList<Impuesto>();
	private int idProducto;
	
	public Producto(float precio, int idProducto) {
		super();
		this.precio = precio;
		this.idProducto = idProducto;
	}

	public float getPrecio()	{
		float precioFinal = precio;
		for (Impuesto impuesto: impuestos) {
			precioFinal = precioFinal + impuesto.calcularImpuesto(precio);
			
		}
		return precioFinal;
		
	}

	public List<Impuesto> getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(List<Impuesto> impuestos) {
		this.impuestos = impuestos;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
}

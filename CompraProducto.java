package business;

public class CompraProducto {
	private Producto producto;
	private int cantidad;
	private DescuentoProducto descuento;
	
	
	public CompraProducto(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public CompraProducto(Producto producto, int cantidad, DescuentoProducto descuento) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}

	public float calcularSubTotal() {
		float subTotal = cantidad * producto.getPrecio();
		
		return (this.descuento == null) ? subTotal : descuento.aplicarDescuento(subTotal, cantidad, producto);
				
		
	}

}

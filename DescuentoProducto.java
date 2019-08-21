package business;

public class DescuentoProducto {
	private Producto productoEnOferta;
	private int cantidadNecesaria;
	
	public DescuentoProducto(Producto productoEnOferta, int cantidadNecesaria) {
		super();
		this.productoEnOferta = productoEnOferta;
		this.cantidadNecesaria = cantidadNecesaria;
	}

	public float aplicarDescuento(float precio, int cantidad, Producto producto) {
		
		if(productoEnOferta.getIdProducto() == producto.getIdProducto()) {
		
			int productosConDescuento = cantidad / this.cantidadNecesaria ;
			
			return precio - (productosConDescuento*(producto.getPrecio()/2));
		
		}else {
			return precio;
		}
	}

}

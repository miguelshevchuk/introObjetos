package business;

import java.util.List;

public class Compra {
	private int idCompra;
	private List<CompraProducto> compraPorProducto;
	private TipoPago tipoDePago;
	private String estado = "Pendiente";
	
	public Compra(int idCompra, List<CompraProducto> compraPorProducto, TipoPago tipoDePago) {
		this.idCompra = idCompra;
		this.compraPorProducto = compraPorProducto;
		this.tipoDePago = tipoDePago;
	}
	
	public float calcularMontoTotal() {
		float montoTotal=0;
		for(CompraProducto compraProducto: compraPorProducto) {
			montoTotal = montoTotal + compraProducto.calcularSubTotal();
			
		}
		return 	tipoDePago.calcularPagoFinal(montoTotal);
		
	}
	public void facturar() {
		this.calcularMontoTotal();
		//Algun metodo que haga el debito
		
		this.estado = "Pagado";
				
	}
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public List<CompraProducto> getCompraPorProducto() {
		return compraPorProducto;
	}
	public void setCompraPorProducto(List<CompraProducto> compraPorProducto) {
		this.compraPorProducto = compraPorProducto;
	}
	public TipoPago getTipoDePago() {
		return tipoDePago;
	}
	public void setTipoDePago(TipoPago tipoDePago) {
		this.tipoDePago = tipoDePago;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}

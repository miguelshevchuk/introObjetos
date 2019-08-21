package business;

public class PagoContado extends TipoPago{
	
	private double porcentajeDescuento = 0.1;
	
	@Override
	public float calcularPagoFinal (float monto) {
		return (float) (monto - (porcentajeDescuento*monto));
	}

}

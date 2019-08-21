package business;

public class Impuesto {
	
	private int porcentajeImpuesto;
	
	public Impuesto(int porcentajeImpuesto) {
		this.porcentajeImpuesto = porcentajeImpuesto;
	}



	public float calcularImpuesto(float monto){
		
		return monto*this.porcentajeImpuesto;
		
	}
	
}

package udb.modulo1.spring.model;

public class FacturaConIva extends Factura {

	public FacturaConIva() {
		// TODO Auto-generated constructor stub
	}

	public FacturaConIva(Integer numero, String concepto, Double importe, Cliente cliente) {
		super(numero, concepto, importe, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getImporteTotal() {
		// TODO Auto-generated method stub
		return getImporte()*1.13;
	}

	@Override
	public String toString() {		
		return String.format("********\nNumero: %d\nConcepto: %s\nImporte: %.2f\nTotal: %.2f\n", 
				getNumero(),getConcepto(),getImporte(),getImporteTotal());
	}

}

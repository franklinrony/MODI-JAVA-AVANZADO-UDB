package udb.modulo1.sesion3;

public class FacturaSinIvaProxy extends Factura {

	private Factura factura;
	
	public FacturaSinIvaProxy(FacturaSinIva factura) {
		super();
		this.factura=factura;
		// TODO Auto-generated constructor stub
	}

	public FacturaSinIvaProxy(Integer numero, String concepto, Double importe, Factura factura) {
		super(numero, concepto, importe);
		//this.factura = factura;
	}

	public FacturaSinIvaProxy() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public Double getImporte() {
		// TODO Auto-generated method stub
		return super.getImporte();
	}

	public String toString() {
		System.out.println("");
		return factura.toString();
	}

	public Integer getNumero() {
		return factura.getNumero();
	}

	public void setNumero(Integer numero) {
		factura.setNumero(numero);
	}

	public String getConcepto() {
		return factura.getConcepto();
	}

	public void setConcepto(String concepto) {
		factura.setConcepto(concepto);
	}

	public void setImporte(Double importe) {
		factura.setImporte(importe);
	}

	public boolean equals(Object obj) {
		return factura.equals(obj);
	}

}

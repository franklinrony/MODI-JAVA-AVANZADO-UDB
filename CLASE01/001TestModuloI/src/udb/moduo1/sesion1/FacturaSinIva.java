package udb.moduo1.sesion1;

public class FacturaSinIva extends Factura {

	public FacturaSinIva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacturaSinIva(Integer numero, String concepto, Double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getImporte() {
		// TODO Auto-generated method stub
		return super.getImporte();	
	}
	
	@Override
	public String toString() {
		return "Factura [numero=" + getNumero() + ", concepto=" + getConcepto() + ", importe= $" + this.getImporte() +  "]";
	}
	

}

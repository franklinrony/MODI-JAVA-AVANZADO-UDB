package udb.moduo1.sesion1;

public class FacturaConIva extends Factura {

	public FacturaConIva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacturaConIva(Integer numero, String concepto, Double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getImporte() {
		// TODO Auto-generated method stub
		return super.getImporte()*1.13;	
	}
	
	@Override
	public String toString() {
		return "Factura [numero=" + getNumero() + ", concepto=" + getConcepto() + ", importe= $" + this.getImporte() +  "]";
	}

}

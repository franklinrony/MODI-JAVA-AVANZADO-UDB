package udb.modulo1.sesion3;

public abstract class Factura {
	private Integer numero;
	private String concepto;
	private Double importe;

	public Factura(Integer numero, String concepto, Double importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}

	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

}

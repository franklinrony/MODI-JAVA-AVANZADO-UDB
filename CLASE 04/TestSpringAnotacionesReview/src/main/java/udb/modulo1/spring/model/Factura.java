package udb.modulo1.spring.model;

public abstract class Factura {
	private Integer numero;
	private String concepto;
	private Double importe;
	private Cliente cliente;
	
	public abstract Double getImporteTotal();
	
	public Factura() {
		// TODO Auto-generated constructor stub
	}

	public Factura(Integer numero, String concepto, Double importe, Cliente cliente) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
		this.cliente = cliente;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}

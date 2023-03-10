package udb.net.mod1.di.spring;

public class DetalleFactura {

	private String concepto;
	private Integer cantidad;
	private Double montoUnitario;
	
	public DetalleFactura() {
		// TODO Auto-generated constructor stub
		super();
	}

	public DetalleFactura(String concepto, Integer cantidad, Double montoUnitario) {
		super();
		this.concepto = concepto;
		this.cantidad = cantidad;
		this.montoUnitario = montoUnitario;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getMontoUnitario() {
		return montoUnitario;
	}

	public void setMontoUnitario(Double montoUnitario) {
		this.montoUnitario = montoUnitario;
	}
	
	

}

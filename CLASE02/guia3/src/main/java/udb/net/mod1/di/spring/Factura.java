package udb.net.mod1.di.spring;

import java.util.List;

public class Factura {
	private Integer numero;
	private Double monto;
	private List<DetalleFactura> detalleFactura;
	
	public Factura() {	
	super();
	}

	
	public Factura(Integer numero, Double monto) {
		super();
		this.numero = numero;
		this.monto = monto;
	}


	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getMonto() {
		double valor=0d;
		if(detalleFactura!=null) {
			for(DetalleFactura d: detalleFactura) {
				valor+=d.getCantidad()*d.getMontoUnitario();
				setMonto(valor);
			}
		}
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}


	public List<DetalleFactura> getDetalleFactura() {
		return detalleFactura;
	}


	public void setDetalleFactura(List<DetalleFactura> detalleFactura) {
		this.detalleFactura = detalleFactura;
	}

}

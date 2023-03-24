package udb.modulo1.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Factura {
	@Id
	private Integer numero;
	private String concepto;
	private Double importe;
	
	public Factura() {
		// TODO Auto-generated constructor stub
	}

	public Factura(Integer numero, String concepto, Double importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
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

	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", concepto=" + concepto + ", importe=" + importe + "]";
	}	
	
	
	
	
	
}

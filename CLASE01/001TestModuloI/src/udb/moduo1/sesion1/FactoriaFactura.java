package udb.moduo1.sesion1;

public class FactoriaFactura {

	public static Factura getInstancia(FacturaType tipoFactura) {
		Factura instancia = null;
		
		switch (tipoFactura) {
		case FACTURA_CON_IVA:
			instancia = new FacturaConIva();
			break;
		case FACTURA_SIN_IVA:
			instancia = new FacturaSinIva();
			break;
		}

		return instancia;

	}

}

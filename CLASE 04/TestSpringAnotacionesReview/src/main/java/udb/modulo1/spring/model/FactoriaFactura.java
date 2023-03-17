package udb.modulo1.spring.model;

public class FactoriaFactura {
	public static Factura getInstance(FacturaType factura) {
		Factura instanciaRetorno=null;
		switch (factura) {
		case FACTURA_CON_IVA:
			instanciaRetorno= new FacturaConIva();
			break;			
		case FACTURA_SIN_IVA:
			instanciaRetorno= new FacturaSinIva();		
			break;	
		}
		return instanciaRetorno;
	}

}

package udb.moduo1.sesion1;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura f1=FactoriaFactura.getInstancia(FacturaType.FACTURA_CON_IVA);	
		f1.setNumero(1);
		f1.setConcepto("COMPUTADOR");
		f1.setImporte(1000.00);
		
		Factura f2=FactoriaFactura.getInstancia(FacturaType.FACTURA_SIN_IVA);	
		f2.setNumero(1);
		f2.setConcepto("PS4");
		f2.setImporte(1000.00);
		
		System.out.println("PRINCIPAL 2");		
		System.out.println("*********");
		System.out.println(f1.toString());
		System.out.println("*********");
		System.out.println(f2.toString());		

	}

}		

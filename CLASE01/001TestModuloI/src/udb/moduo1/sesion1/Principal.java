package udb.moduo1.sesion1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacturaConIva f1=new FacturaConIva(1, "COMPUTADOR", 1000.00);
		FacturaSinIva f2=new FacturaSinIva(2, "PS4", 1000.00);
		
		System.out.println("PRINCIPAL 1");	
		System.out.println("*********");
		System.out.println(f1.getImporte());
		System.out.println("*********");
		System.out.println(f2.getImporte());
		

	}

}		

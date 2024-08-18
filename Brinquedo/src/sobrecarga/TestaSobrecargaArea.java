package sobrecarga;

public class TestaSobrecargaArea {

	public static void main(String arg[]) {
		
		SobrecargaArea qd = new SobrecargaArea();
		SobrecargaArea ls = new SobrecargaArea();
		SobrecargaArea plelo = new SobrecargaArea();
		

	
		System.out.println("Área de um quadrado: " + qd.area(5));
		System.out.println("Área de um losangulo: " + ls.area(10, 10)/2);
		System.out.println("Área de um paraleogramo: " + ls.area(10, 10));
	}	
}

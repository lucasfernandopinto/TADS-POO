package aulaEncapsulamento;

public class TestaTelevisorConstrutor {

	public static void main(String[] args) {
		TelevisorConstrutor tv1 = new TelevisorConstrutor();
		TelevisorConstrutor tv2 = new TelevisorConstrutor(10);
		TelevisorConstrutor tv3 = new TelevisorConstrutor(15, 20);
		
		tv1.mostrar();
		tv2.mostrar();
		tv3.mostrar();
		
		
	}

}

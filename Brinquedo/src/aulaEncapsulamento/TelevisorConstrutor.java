package aulaEncapsulamento;

public class TelevisorConstrutor {
	
	private int volume;
	private int canal;
	
	public TelevisorConstrutor() {
	}
	
	public TelevisorConstrutor(int volume) {
		this.volume = volume;
	}
	
	public TelevisorConstrutor(int volume, int canal) {
		this.volume = volume;
		this.canal = canal;
	}
	
	public void mostrar() {
		System.out.println("Canal: " + canal + 
			"\nVolume: " + volume);
	}
	
}

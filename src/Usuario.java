
public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV Ligada? " + smartTv.ligada);
		System.out.println("Canal Atual? " + smartTv.canal);
		System.out.println("Volume Atual? " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("TV Ligada? " + smartTv.ligada);
		
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("Volume Atual? " + smartTv.volume);
		
		smartTv.mudarCanal(13);
		System.out.println("Novo Canal? " + smartTv.canal);
		
		smartTv.aumentarCanal();
		System.out.println("Novo Canal? " + smartTv.canal);	
		
		smartTv.mudarCanal(27);
		System.out.println("Novo Canal? " + smartTv.canal);	
	}
}

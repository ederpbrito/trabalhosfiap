package Atividade2;

public class MainCachorro {

	public static void main(String[] args) {
		ChowChow chowChow = new ChowChow();      
		Boolean valor = chowChow instanceof Cachorro;   
		System.out.println("Verdadeiro ou Falso: "+valor);
	}
}

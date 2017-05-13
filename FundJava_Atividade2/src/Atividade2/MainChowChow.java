package Atividade2;

public class MainChowChow {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();     
		Boolean valor = cachorro instanceof ChowChow;   
		System.out.println("Verdadeiro ou Falso: "+valor); 

	}

}

import java.util.Scanner;

public class Fatorial {
	
	@SuppressWarnings("resource")
	public static void main (String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um numero para calcular o seu fatorial\t");
		System.out.println("Numero: \t" );
		int valor = Integer.parseInt(s.next());
		System.out.println(String.format("\rFatorial de %d = %d", valor ,fatorial(valor)));
		
	}
	public static int fatorial(int num) {
		int soma = 1;
		
		for (int i = num; 1 <= i; i--) {
			soma *= i;			
			formatarSaida(i);
		}
		
		return soma;		
	}
	
	private static void formatarSaida(int i){
		if(i == 1)
			System.out.print(i);
		else
			System.out.print(i + ".");
	}
}
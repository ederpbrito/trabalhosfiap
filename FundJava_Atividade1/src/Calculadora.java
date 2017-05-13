import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) throws Exception {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("********************Calculadora**********************");
		System.out.println("Escolha a operacao: ");
		System.out.println("1 = Soma");
		System.out.println("2 = Subtração");
		System.out.println("3 = Divisão");
		System.out.println("4 = Multiplicação");
		
		int operacao = s.nextInt();
		System.out.println("Digite o primeiro valor: ");
		int valor1 = s.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = s.nextInt();
				
		System.out.println(String.format("O reusltado da operação: %.2f", calcular(operacao,valor1,valor2)));		
	}
	
	public static double calcular(Integer operacao, double valor1, double valor2) throws Exception{
		double total = 0;
		 switch (operacao){
		 	case 1: 
		 		total = valor1 + valor2;
		 		return total;
		 	case 2:
		 		total = valor1 - valor2;
		 		return total;
		 	case 3:
		 		if(valor2 <= 0){
		 			throw new Exception("Não é possivel realizar divisão por zero!");
		 		}		 				
		 		total = valor1/valor2;
		 		break;
		 	case 4:
		 		total = valor1 * valor2;
		 		return total;
		 	default:
		 		
		 		return 0.0;		 		
		 }
		return total;
	}
}

import java.util.Scanner;

public class VetorInvertido {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o tamanho do Array: \t");
		int tamanhoArray = s.nextInt();
		
		int[] arrA = new int[tamanhoArray];
		int[] arrB = new int[tamanhoArray];
		
		System.out.println("Digite os valores do vetor.\t");
		for(int i=0, x = tamanhoArray - 1; i < tamanhoArray; i++, x--){
			System.out.println(String.format("Digite a posição %1$d: \t",i));			
			arrA[i] = s.nextInt();
			arrB[x] = arrA[i];
		}
		
		System.out.println("Vetor invetido.\t");
		for(int i = 0;i < tamanhoArray;i++){
			System.out.println(arrB[i]);
		}
	}

}

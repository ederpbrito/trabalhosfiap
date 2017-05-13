package Atividade2;
import javax.swing.JOptionPane;

public class MainCalculadora {

	public static void main(String[] args) throws DivisaoPorZeroException, Exception {
		
		Calculadora calc = new Calculadora();
		
		float valor1 = 0;
		float valor2 = 0;

		String input = null;
		
		for (int i = 0; i < 2; i++) {
			input = JOptionPane.showInputDialog(String.format("Digite %1d valor: \t",i+1));
			
			while(!isEntradaValida(input)){
				input = JOptionPane.showInputDialog(String.format("Digite %1d valor: \t",i+1));				
			}

			if(i == 0)
				valor1 = Float.parseFloat(input);
			else
				valor2 = Float.parseFloat(input);				
		}
		System.out.println(String.format("Valor1: %.2f  Valor2: %.2f", valor1, valor2));
		System.out.println(String.format("Resultado da opera��o de soma: %.2f", calc.somar(valor1,valor2)));
		System.out.println(String.format("Resultado da opera��o de subtra��o: %.2f", calc.subrair(valor1,valor2)));
		System.out.println(String.format("Resultado da opera��o multiplica��o: %.2f", calc.multiplicar(valor1,valor2)));
		
		try{
			System.out.println(String.format("Resultado da opera��o divis�o: %.2f", calc.dividir(valor1,valor2)));
		}catch(DivisaoPorZeroException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
	}
	
	public static boolean isEntradaValida(String input){
				 
		 try {			 
            @SuppressWarnings("unused")
			Float valor = Float.parseFloat(input);
            return true;
         }catch(NumberFormatException e){
        	 JOptionPane.showMessageDialog(null, "Informe apenas n�meros");
        	 return false;
         }
	}

}

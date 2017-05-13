import javax.swing.JOptionPane;

public class SalariosFuncionarios {

	 public static void main(String[] args) {   
		 
		 String input = JOptionPane.showInputDialog("Entre com a quantidade de Funcionarios");
		 
		 int qtdFuncionarios = Integer.parseInt(input);
		 double[] salarios =  new double[qtdFuncionarios];
		 double totalSalarios = 0;
		 
		 for(int i = 0; i < qtdFuncionarios; i++){				
			input = JOptionPane.showInputDialog(String.format("Digite o salário do %1$d funcionário: \t",i+1));
			salarios[i] = Double.parseDouble(input);
			totalSalarios = totalSalarios + salarios[i];
		 }
		
		 System.out.println(String.format("Média Salarial: R$ %.2f\t",totalSalarios/qtdFuncionarios));
		 
	 }
}

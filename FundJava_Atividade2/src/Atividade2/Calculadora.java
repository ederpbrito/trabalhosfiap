package Atividade2;

public class Calculadora implements CalculadoraBasica {
	
	@Override
	public float somar(float op1, float op2) {
		return op1 + op2;
	}

	@Override
	public float subrair(float op1, float op2) {		
		return op1 - op2;
	}

	@Override
	public float dividir(float op1, float op2) throws DivisaoPorZeroException {		
		if(op2 == 0)
			throw new DivisaoPorZeroException("Não é possivel realizar divisão por zero.");
		
		return op1 / op2;
	}

	@Override
	public float multiplicar(float op1, float op2) {
		return op1 * op2;
	}

}

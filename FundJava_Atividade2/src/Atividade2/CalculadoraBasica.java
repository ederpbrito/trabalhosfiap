package Atividade2;

public interface CalculadoraBasica {
	public float somar(float op1, float op2);
	public float subrair(float op1, float op2);
	public float dividir(float op1, float op2) throws DivisaoPorZeroException;
	public float multiplicar(float op1, float op2);
}

package Atividade2;

public class MainEquipamento {

	public static void main(String[] args) {
		Object objeto = new Object();
		Tablet tablet = new Tablet();
		Tablet tablet2 = new Tablet();
		Smartphone smartphone = new Smartphone();
		Smartphone smartphone2 = new Smartphone();
		Movel movel = new Movel();
		Equipamento equipamento = new Equipamento();
		
		objeto = equipamento; //R: Convers�o impl�cita, equipamento extende objeto.
		objeto = movel; //Convers�o impl�cita, movel extende objeto.
		equipamento=tablet2; //Convers�o impl�cita, equipamento extende objeto.
		equipamento=smartphone2; //Convers�o impl�cita, smartphone2 extende equipamento.
		smartphone=tablet;  //Convers�o imposs�vel, smartphone2 est� no mesmo n�vel que tablet
		smartphone2=tablet2; ////Convers�o imposs�vel, smartphone2 est� no mesmo n�vel que tablet2
		equipamento = (Equipamento) tablet; //Convers�o Explicita, tablet extend que equipamento
		movel = (Movel) tablet; //Convers�o Explicita, tablet extende movel
		tablet = (EquipamentoEletronico) equipamento; //Convers�o Imposs�vel, tablet e equipamento n�o implementa EquipamentoEletronico
		

	}

}

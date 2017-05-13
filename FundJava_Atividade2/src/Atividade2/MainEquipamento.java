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
		
		objeto = equipamento; //R: Conversão implícita, equipamento extende objeto.
		objeto = movel; //Conversão implícita, movel extende objeto.
		equipamento=tablet2; //Conversão implícita, equipamento extende objeto.
		equipamento=smartphone2; //Conversão implícita, smartphone2 extende equipamento.
		smartphone=tablet;  //Conversão impossível, smartphone2 está no mesmo nível que tablet
		smartphone2=tablet2; ////Conversão impossível, smartphone2 está no mesmo nível que tablet2
		equipamento = (Equipamento) tablet; //Conversão Explicita, tablet extend que equipamento
		movel = (Movel) tablet; //Conversão Explicita, tablet extende movel
		tablet = (EquipamentoEletronico) equipamento; //Conversão Impossível, tablet e equipamento não implementa EquipamentoEletronico
		

	}

}

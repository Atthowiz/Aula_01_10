package aula01_10;

public class Principal2 {

	public static void main(String[] args) {
		
		Carros ferrari = new Carros ("00000", "F1", "Vermelho", 2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		System.out.println("---------------------");
		
		Onibus marcopolo = new Onibus ("11111", "XB1", "Prata", 2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();

	}

}

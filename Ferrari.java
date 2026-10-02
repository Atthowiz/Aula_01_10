package aula01_10;

public class Ferrari implements Carro {

	@Override
	public void ligar() {
		System.out.println("A ferrari liga");

	}

	@Override
	public void desligar() {
		System.out.println("A ferrari desliga");

	}

	@Override
	public void manobrar() {
		System.out.println("A ferrari é manobrada");

	}

	@Override
	public void engatar() {
		System.out.println("A ferrari engata marcha");

	}

	@Override
	public void acelerar() {
		System.out.println("A ferrari acelera");

	}

	@Override
	public void frear() {
		System.out.println("A ferrari freia");

	}

}

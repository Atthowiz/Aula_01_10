package aula01_10;

public class Principal {

	public static void main(String[] args) {
		
		Lobo geraldo = new Lobo();
		Gato pretume = new Gato();
		
		geraldo.dormir();
		geraldo.caminhar();
		geraldo.correr();
		geraldo.emitirSom();
		
		pretume.dormir();
		pretume.caminhar();
		pretume.correr();
		pretume.emitirSom();

	}

}

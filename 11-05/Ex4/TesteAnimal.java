package Ex4;

public class TesteAnimal {
	
	public static void main (String args[]) {
	Cachorro cachorro = new Cachorro("Sophie", 2);
	Cavalo cavalo = new Cavalo("Bojack", 40);	
	Pregui�a preg = new Pregui�a("Monark", 30);
	
	
	cachorro.correndo();
	cachorro.latindo();
	cavalo.relincha();
	cavalo.trotando();
	preg.arvore();
	preg.grunhido();
	
	
	}
	
}

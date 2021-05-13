package Ex6;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro sophie = new Cachorro("Sophie", 2,"Latindo", "Correndo");
		Cavalo bojack = new Cavalo("Bojack", 40,"Relinchando", "Trotando");
		Preguiça monark = new Preguiça("Monark", 30,"Grunhindo", "Subindo na arvore");
		
		int n = (int)(Math.random()*3.0);
		System.out.println("Sorteando animal aleatorio...");
		switch(n)
		{
		case 0: 
			sophie.imprime();
			break;
		case 1:
			bojack.imprime();
			break;
		case 2:
			monark.imprime();
			break;
		default:
			System.out.println("Erro inesperado.");
		}
		
		
	}

}

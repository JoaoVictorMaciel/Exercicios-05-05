package Ex2;

public class TesteAviao {

	public static void main(String[] args) {
		Aviao pouso = new Aviao();
		pouso.empresa = "GOL";
		pouso.aeroporto = "Congonhas";
		pouso.horacheg = 15;
		pouso.velocidade = 76;
		
		pouso.chegada();
		System.out.println("\n***************");
		pouso.alerta();
		System.out.println("\n***************");
		pouso.horario();
		System.out.println("\n***************");
	}

}

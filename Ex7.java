package PackExer;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		int idade,somaidade21=0,somaidade50=0;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite sua idade:");
		idade = entrada.nextInt();
		
		while(idade != -99)
		{
			if(idade <= 21)
			{
				somaidade21++;
			}
			else if(idade >= 50)
			{
				somaidade50++;
			}
			System.out.println("\nDigite sua idade:");
			idade = entrada.nextInt();
		}
		System.out.printf("\nNumero de pessoas com menos de 21 anos: %d", somaidade21);
		System.out.printf("\nNumero de pessoas com mais de 50 anos: %d", somaidade50);
		
		
	}

}

package PackExer;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
		double res;
		int num;
		System.out.printf("Digite um numero ");
		num = ler.nextInt();
		
		if(num != 0)
		{
			if(num % 2 == 0)
			{
				res = Math.sqrt(num);
				System.out.print("A Raiz quadrada do seu valor é de "+res);
			}
			else if(num % 2 == 1)
			{
				res = Math.pow(num, 2);
				System.out.print("A potencia ao quadrado do seu valor é de "+res);
			}
		}
		else
		{
			System.out.print("Seu numero é 0");
		}

	}

}

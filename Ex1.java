package PackExer;

import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int num1,num2,num3;
		
		System.out.printf("Entre com o primeiro numero: ");
		num1 = ler.nextInt();
		
		System.out.printf("Entre com o segundo numero: ");
		num2 = ler.nextInt();
		
		System.out.printf("Entre com o terceiro numero: ");
		num3 = ler.nextInt();
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.printf("O numero maior é o %d",num1);
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.printf("O numero maior é o %d",num2);
		}
		else 
		{
			System.out.printf("O numero maior é o %d",num3);
		}

	}

}

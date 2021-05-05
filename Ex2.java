package PackExer;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
	
	Scanner ler = new Scanner (System.in);
	float num1,num2,num3;
	
	System.out.printf("Entre com o primeiro numero: ");
	num1 = ler.nextFloat();
	
	System.out.printf("Entre com o segundo numero: ");
	num2 = ler.nextFloat();
	
	System.out.printf("Entre com o terceiro numero: ");
	num3 = ler.nextFloat();
	
	if(num1 <= num2 && num1 <= num3)
	{
		System.out.println(num1);
		if(num2 <= num3)
		{
			System.out.println(num2);	
			System.out.println(num3);
		}
		else if(num3 <= num2)
		{
			System.out.println(num3);	
			System.out.println(num2);
		}
	}
	else if(num2 <= num3 && num2 <= num3)
	{
		System.out.println(num2);
		if(num1 <= num3)
		{
			System.out.println(num1);	
			System.out.println(num3);
		}
		else if(num3 <= num1)
		{
			System.out.println(num3);	
			System.out.println(num1);
		}
	}
	else
	{
		System.out.println(num3);
		if(num1 <= num2)
		{
			System.out.println(num1);	
			System.out.println(num2);
		}
		else if(num2 <= num1)
		{
			System.out.println(num2);	
			System.out.println(num1);
		}
	}
	}

}

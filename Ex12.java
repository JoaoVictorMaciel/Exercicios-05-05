package PackExer;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		int[] a = new int[6];
		int somapar=0,quantimp=0,x;
		
		Scanner leia = new Scanner(System.in);
		for(x=0;x<6;x++)
		{
			System.out.println("Entre com um número: ");
			a[x] = leia.nextInt();
			
			if(a[x]%2==0)
			{
				somapar = somapar + a[x];
			}
			else
			{
				System.out.println("\n"+a[x]+" é um numero ímpar!!!");
				quantimp++;
			}
		}
		System.out.println("Soma dos numeros pares digitados: "+somapar);
		System.out.println("Soma dos numeros impares digitados: "+quantimp);
		
	}

}

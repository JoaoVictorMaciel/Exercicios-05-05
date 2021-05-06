package PackExer;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		int num,somanum=0;
		
		do
		{
			Scanner leia = new Scanner (System.in);
			System.out.println("\nDigite um numero:");
			num = leia.nextInt();
			somanum = somanum + num;
			
		}while(num != 0);
		System.out.printf("\nSoma dos numeros digitados: %d",somanum);
			

	}

}

package PackExer;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
	int num,somanum=0,mednum=0,multi;
		
		do
		{
			Scanner leia = new Scanner (System.in);
			System.out.println("\nDigite um numero (Para sair digite 0):");
			num = leia.nextInt();
			
			
			if(num % 3 == 0 )
			{
			somanum = somanum + num;	
			}
			mednum++;
			
		}while(num != 0);
		multi = somanum/mednum;
		System.out.printf("\nSoma dos numeros digitados multiplos de 3: %d",somanum);

	}

}

package PackExer;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		float[][] a = new float[3][3];
		int cont=0,l,c;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.printf("Entre com o valor [%d][%d]: ",l+1,c+1);
				a[l][c] = leia.nextFloat();
				
				if(a[l][c]>10)
				{
				cont++;
				}
			}
		}
		System.out.println("A Matriz ficou: \n");
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.printf("\t %2.0f \t",a[l][c]);	
			}
			System.out.println("\n");
		}
		
		System.out.println("\nQuantidade de numeros maiores que 10: "+cont);
	}
}

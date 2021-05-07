package PackExer;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		float[][] a = new float[2][2], b = new float[2][2], c = new float[2][2];
		int lin,col,menu;
		final float consta;
		
		Scanner leia = new Scanner(System.in);
		
		for(lin=0;lin<2;lin++)
		{
			for(col=0;col<2;col++)
			{
				System.out.printf("Entre com o valor da Matriz A [%d][%d]: ",lin+1,col+1);
				a[lin][col] = leia.nextFloat();
				System.out.printf("Entre com o valor da Matriz B [%d][%d]: ",lin+1,col+1);
				b[lin][col] = leia.nextFloat();
			}
		}
		System.out.println("Escolha uma das opções: \n1- Somar as matrizes \n2- Subtrair a primeira matriz da segunda \n3- Adicionar uma constante entre as duas matrizes \n4- Ver as matrizes ");
		menu = leia.nextInt();
		switch(menu)
		{
		 case 1:
			 for(lin=0;lin<2;lin++)
				{
					for(col=0;col<2;col++)
					{
						c[lin][col] = a[lin][col] + b[lin][col];
						System.out.printf("\t %2.0f \t",c[lin][col]);
					}
					System.out.println();
				}
			 System.out.println();
             break;        
             
         case 2:
        	 for(lin=0;lin<2;lin++)
				{
					for(col=0;col<2;col++)
					{
						c[lin][col] = a[lin][col] - b[lin][col];
						System.out.printf("\t %2.0f \t",c[lin][col]);
					}
					System.out.println();
				}
        	 
	
             break;
             
         case 3:
             System.out.printf("Digite o valor da constante: ");
             consta = leia.nextFloat();
             for(lin=0;lin<2;lin++)
				{
					for(col=0;col<2;col++)
					{
						a[lin][col] = a[lin][col] + consta;  
						b[lin][col] = b[lin][col] + consta;
					}
				}
             System.out.printf("\nSoma da Constante na Matriz A: \n");
        	 for(lin=0;lin<2;lin++)
				{		
					for(col=0;col<2;col++)
					{
						System.out.printf("\t %2.0f \t",a[lin][col]);	
					}
					System.out.println();
				}
			System.out.printf("\nSoma da Constante na Matriz B: \n");
			for(lin=0;lin<2;lin++)
			{		
				for(col=0;col<2;col++)
				{
					System.out.printf("\t %2.0f \t",b[lin][col]);	
				}
				System.out.println();
			}
             break;
             
         case 4:
        	 System.out.printf("\n Matriz A: \n");
        	 for(lin=0;lin<2;lin++)
				{		
					for(col=0;col<2;col++)
					{
						System.out.printf("\t %2.0f \t",a[lin][col]);	
					}
					System.out.println();
				}
			System.out.printf("\n Matriz B: \n");
			for(lin=0;lin<2;lin++)
			{		
				for(col=0;col<2;col++)
				{
						
				}
				System.out.println();
			}
             break;
         
         default:
             System.out.printf("Você digitou uma operação inválida.");     
		}
		
	}

}

package PackExer;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		int idade,somaidade1,somaidade2,sexo,humor,x=0,somacalmo=0,mnerv=0,hagr=0,inerv=0,jcalm=0,ocalm=0;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		System.out.println("Sendo \n1 para Masc. \n2 para Fem. e \n3 para Outros \nDigite o numero correspondente a sua orientação sexual: ");
		sexo = leia.nextInt();
		System.out.println("Sendo \n1 para Calmo \n2 para Nervoso e \n3 para Agressivo \nDigite o numero correspondente a sua personalidade: ");
		humor = leia.nextInt();
		
		while(x<4)
		{
			if(humor == 1)
			{
			somacalmo++;	
			}
			if(sexo == 2 && humor == 2)
			{
			mnerv++;
			}
			if(sexo == 1 && humor == 3)
			{
			hagr++;
			}
			if(sexo == 3 && humor == 1)
			{
			ocalm++;	
			}
			if(idade>=40 && humor == 2)
			{
			inerv++;
			}
			if(idade<=18 && humor == 1)
			{
			jcalm++;
			}
			x++;
			System.out.println("\nDigite sua idade:");
			idade = leia.nextInt();
			System.out.println("\nSendo \n1 para Masc. \n2 para Fem. e \n3 para Outros \nDigite o numero correspondente a sua orientação sexual: ");
			sexo = leia.nextInt();
			System.out.println("\nSendo \n1 para Calmo \n2 para Nervoso e \n3 para Agressivo \nDigite o numero correspondente a sua personalidade: ");
			humor = leia.nextInt();
		}
		System.out.printf("\nNumero de pessoas calmas: %d",somacalmo);
		System.out.printf("\nNumero de Mulheres Nervosas: %d",mnerv);
		System.out.printf("\nNumero de Homens Agressivos: %d",hagr);
		System.out.printf("\nNumero de Outros calmos: %d",ocalm);
		System.out.printf("\nNumero de Pessoas acima dos 40 anos nervosos: %d",inerv);
		System.out.printf("\nNumero de pessoas menores de idade calmos: %d",jcalm);
	}

}

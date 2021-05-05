package PackExer;

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
	
	Scanner ler = new Scanner (System.in);
	int idade;
	String nome;
	
		System.out.printf("Qual o seu nome: ");
		nome = ler.nextLine();
		System.out.printf("Qual sua idade: ");
		idade = ler.nextInt();

		if(idade>=10 && idade<=14)
		{
			System.out.printf("\nOlá, "+nome);
			System.out.printf("\nVocê está na catergoria infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.printf("\nOlá, "+nome);
			System.out.printf("\nVocê está na catergoria juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.printf("\nOlá, "+nome);
			System.out.printf("\nVocê está na catergoria adulta");
		}
		else
		{
			System.out.printf("\nOlá, "+nome);
			System.out.printf("\nVocê não tem uma idade adequada para matricula.");
		}
	}

}

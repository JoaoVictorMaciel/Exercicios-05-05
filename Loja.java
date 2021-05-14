package Ex5;

import java.util.ArrayList;
import java.util.Scanner;

//import java.util.*;


public class Loja {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		estoque.add("Chelsea 20-21");
		estoque.add("Chelsea 19-20");
		estoque.add("Arsenal 20-21");
		estoque.add("Arsenal 19-20");
		estoque.add("Manchester United 20-21");
		estoque.add("Manchester United 19-20");

		do
		{
			System.out.println("\nSeja Bem vindo ao estoque da Maciel's Soccer Store!");
			System.out.println("\nO que deseja fazer hoje?");
			System.out.println("\n-------------------------------");
			System.out.println("\n1- Adicionar produtos do estoque");
			System.out.println("\n2- Remover produtos do estoque");
			System.out.println("\n3- Atualizar produtos do estoque");
			System.out.println("\n4- Mostrar todos os produtos do estoque");
			System.out.println("\n0- Encerrar o programa");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1))
				{
					estoque.remove(produto1);
				}
				else
				{
					System.out.println("\nProduto não existe no estoque");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar de "+verifica+": ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe no estoque");
				}
				break;
			case 4:
				System.out.println("\nEstoque:");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nPrograma Finalizado.");
				
			}
		}while(op!=0);
	}


}

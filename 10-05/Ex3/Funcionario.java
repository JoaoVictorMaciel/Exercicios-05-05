package Ex3;

public class Funcionario {
	private String nome;
	private int codigo;
	private int idade;
	private String funcao;
	private double salario;
	private int tempoempresa;
	
	public Funcionario (String n, int c, int i, String fun, double sal, int tempoemp)
	{
		nome = n;
		codigo = c;
		idade = i;
		funcao = fun;
		salario = sal;
		tempoempresa = tempoemp;
		
	}
	void StatusFunc()
	{
		System.out.println("Nome: "+nome+"\nFun��o: "+funcao+"\nIdade: "+idade+"\nCodigo: "+codigo+ "\nSal�rio: R$ "+salario);
	}
	void AumentoSal(double aumentosal)
	{
		if (tempoempresa==5)
		{
		aumentosal = salario + (15 * salario)/100;
		System.out.println("Sal�rio do Funcion�rio "+nome+" aumentou 15% ap�s ele ficar 5 anos na empresa. Agora seu sal�rio � de R$ "+aumentosal);
		}
	}
}

package Ex6;

public class Pregui�a extends BaseAnimal implements Animal {
	
	public Pregui�a (String nome, int idade, String som, String acao)
	{
		super(nome,idade,som,acao);
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	
	public void setNome() {
		this.nome = nome;
		
	}

	
	public void setIdade() {
		this.idade = idade;
		
	}
	
}

package Ex6;

public class BaseAnimal {
	protected String nome;
	protected int idade;
	protected String acao;
	protected String som;
	
	public BaseAnimal (String nome, int idade, String acao, String som)
	{
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.acao = acao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	void imprime()
	{
		System.out.println(getNome()+" está "+getAcao()+" e "+getSom());
	}
	
}

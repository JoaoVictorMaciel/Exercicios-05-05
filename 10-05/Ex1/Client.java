package Ex1;

public class Client {
	private String nome;
	private String plano;
	private Double saldo;
	
	public Client (String n, String p, Double s)
	{
		nome = n;
		plano = p;
		saldo = s;
	}
	public void getStatus() {
		System.out.printf(nome+" é um membro do plano "+plano+" e seu saldo é de R$ "+saldo);
	}
}
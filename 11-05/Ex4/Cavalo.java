package Ex4;

public class Cavalo extends Animal{

	public Cavalo (String n, int i)
	{
		super(n,i);
	}
	
	
	void trotando()
	{
		System.out.println(getNome()+" est� trotando!");
	}
	void relincha()
	{
		System.out.println(getNome()+" est� relinchando!");
		
	}
}
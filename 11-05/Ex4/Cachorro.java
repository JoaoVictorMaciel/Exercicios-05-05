package Ex4;

public class Cachorro extends Animal {
	
	
	
	public Cachorro (String n, int i)
	{
		super(n,i);
		
	}
	

	public void correndo()
	{
		System.out.println(getNome()+" est� correndo!");
	}
	public void latindo()
	{
		System.out.println(getNome()+" est� latindo!");
		
	}
	}



package Ex4;

public class Preguiça extends Animal {

	public Preguiça (String n, int i)
	{
		super(n,i);
	}
	
	
	void arvore()
	{
		System.out.println(getNome()+" está subindo em uma arvore!");
	}
	void grunhido()
	{
		System.out.println(getNome()+" está grunhindo!");	
	}
}

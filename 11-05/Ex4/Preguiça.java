package Ex4;

public class Pregui�a extends Animal {

	public Pregui�a (String n, int i)
	{
		super(n,i);
	}
	
	
	void arvore()
	{
		System.out.println(getNome()+" est� subindo em uma arvore!");
	}
	void grunhido()
	{
		System.out.println(getNome()+" est� grunhindo!");	
	}
}

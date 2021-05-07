package PackExer;

public class Ex11 {

	public static void main(String[] args) {
		int[] a = {1,0,5,-2,-5,7};
		int soma=0,x;
		
		System.out.println("Vetor: ");
		
		for(x=0;x<6;x++)
		{
			System.out.println(a[x]);
			if(x==0)
			{
				soma = soma + a[x];
			}
			if(x==1)
			{
				soma = soma + a[x];
			}
			if(x==5)
			{
				soma = soma + a[x];
			}
			if(x==4)
			{
				a[x] = 100;
			}
			
		}
		System.out.println("Soma entre as Posições 0,1 e 5: "+soma);
		System.out.println("Valor alterado da posição 4: "+a[4]);
		
		

	}

}

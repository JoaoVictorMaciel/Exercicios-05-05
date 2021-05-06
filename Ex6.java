package PackExer;



public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,somapar=0,somaimpar=0;
		
		for(num=1;num<=10;num++)
		{
			System.out.printf("\n %d",num);
			if(num % 2 == 0)
			{
				somapar++;
			}
			else if(num % 2 == 1)
			{
				somaimpar++;
			}	
		}
		System.out.printf("\nQuantidade de numeros impares: %d", somaimpar);
		System.out.printf("\nQuantidade de numeros pares: %d",somapar);	
	}

}

package Ex2;

public class Aviao {
	String empresa;
	String aeroporto;
	double horacheg;
	double velocidade;
	double atraso;
	
	void chegada()
	{
		System.out.println("Um avião da "+empresa+" acaba de pousar no Aeroporto de "+aeroporto+" as "+horacheg+"h.");
	}
	void alerta()
	{
		if (velocidade<=80)
		{
			System.out.println("Pouso executado dentro da velocidade permitida.");
		}
		else
		{
			System.out.println("*ALERTA* \nPouso executado acima da velocidade permitida.");
		}
	}
	void horario()
	{
		if (horacheg==14)
		{
			
			
			System.out.println("Pouso executado dentro do horário previsto");
		}
		else if (horacheg<14)
		{
			atraso = 14 - horacheg;
			System.out.println("Pouso com adiantamento de "+atraso+" horas.");
		}
		else 
		{
			atraso = horacheg - 14;
			System.out.println("Pouso com atraso de "+atraso+" horas.");
		}
	}
}

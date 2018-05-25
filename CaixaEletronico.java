package caixaEletronico;
import java.util.Scanner;

public class CaixaEletronico
{
	public static void main(String[] args)
	{		
		double valor;
		int n100 = 0;
		int n50 = 0;
		int n20 = 0;
		int n10 = 0;
		
		Bandeja band100 = new Bandeja(100, 300);
		Bandeja band50 = new Bandeja(50, 500);
		Bandeja band20 = new Bandeja(20,250);
		Bandeja band10 = new Bandeja (10,400);
  
		Scanner in = new Scanner(System.in);
		
		Print imprimir = new Print();

		ATM caixa = new ATM ("DG123","Rua: Venezuela","800","Valinhos", "Rio de Janeiro", band100, band50, band20, band10);
				
		System.out.println("Este caixa disponibiliza apenas notas de 100,00; 50,00; 20,00 e 10,00");
		
		imprimir.painel(caixa);
		
		imprimir.notas(caixa);
		
		System.out.println("Digite o valor a ser sacado: ");
		valor = in.nextDouble();

		while(valor >= caixa.getBand100().getValorFace())
		{
			if(valor % caixa.getBand100().getValorFace() == 0 && caixa.getBand100().getQuantidade() > 0)
			{
				valor = valor - caixa.getBand100().getValorFace();
				caixa.getBand100().setQuantidade((caixa.getBand100().getQuantidade()-1));
				n100 = n100+1;
			}				

				while(valor >= caixa.getBand50().getValorFace())
				{
						if(valor % caixa.getBand50().getValorFace() == 0 && caixa.getBand50().getQuantidade() > 0)
						{
							valor = valor - caixa.getBand50().getValorFace();
							caixa.getBand50().setQuantidade((caixa.getBand50().getQuantidade()-1));
							n50 = n50+1;
						}
		
							while(valor >= caixa.getBand20().getValorFace())
							{
								if(valor % caixa.getBand20().getValorFace() == 0 && caixa.getBand20().getQuantidade() > 0)
								{
									valor = valor - caixa.getBand20().getValorFace();
									caixa.getBand20().setQuantidade((caixa.getBand20().getQuantidade()-1));
									n20 = n20+1;
								}
		
									while(valor >= caixa.getBand10().getValorFace())
									{
										if(valor % caixa.getBand10().getValorFace() == 0 && caixa.getBand10().getQuantidade() > 0)
										{
											valor = valor - caixa.getBand10().getValorFace();
											caixa.getBand10().setQuantidade((caixa.getBand10().getQuantidade()-1));
											n10 = n10+1;
										}
							
									}
							}
				}
		}
		
		System.out.println("******************************");
		System.out.println("Voce sacou:");
		System.out.println(n100+" Notas de 100");
		System.out.println(n50+" Notas de 50");
		System.out.println(n20+" Notas de 20");
		System.out.println(n10+" Notas de 10");
		System.out.println("******************************");
		
		imprimir.notas(caixa);
		
		imprimir.saldo(caixa);
	}
}
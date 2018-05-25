package caixaEletronico;
public class Print
{
	public double n100;
	public double n50;
	public double n20;
	public double n10;
	public double total;

	public double nota100(ATM caixa)
	{
		return this.n100 = caixa.getBand100().getValorFace()*caixa.getBand100().getQuantidade();
	}

	public double nota50(ATM caixa)
	{
		return this.n50 = caixa.getBand50().getValorFace()*caixa.getBand50().getQuantidade();
	}

	public double nota20(ATM caixa)
	{
		return this.n20 = caixa.getBand20().getValorFace()*caixa.getBand20().getQuantidade();
	}

	public double nota10(ATM caixa)
	{
		 return this.n10 = caixa.getBand10().getValorFace()*caixa.getBand10().getQuantidade();
	}

	public double totalNota()
	{
		 return this.total = this.n100 + this.n50 + this.n20 + this.n10;
	}

	public void painel (ATM caixa)
	{
		System.out.println("******************************"); 
		System.out.println("Codigo do Caixa: "+caixa.getCodigo());
		System.out.println("Endereco: "+caixa.getCasa()+" - "+caixa.getNumero());
		System.out.println("Cidade: "+caixa.getCidade());
		System.out.println("Estado: "+caixa.getEstado());
		System.out.println("******************************");
	}

	public void notas (ATM caixa)
	{
		System.out.println("=============================="); 
		System.out.println("Notas de 100,00: "+caixa.getBand100().getQuantidade());
		System.out.println("Notas de 50,00: "+caixa.getBand50().getQuantidade());
		System.out.println("Notas de 20,00: "+caixa.getBand20().getQuantidade());
		System.out.println("Notas de 10,00: "+caixa.getBand10().getQuantidade());
		System.out.println("Notas totais: "+(caixa.getBand100().getQuantidade()+caixa.getBand50().getQuantidade()+caixa.getBand20().getQuantidade()+caixa.getBand10().getQuantidade()));
		System.out.println("==============================");
	}

	public void saldo (ATM caixa)
	{
		System.out.println("------------------------------"); 
		System.out.println("Notas de 100,00: "+caixa.getBand100().getValorFace()*caixa.getBand100().getQuantidade());
		System.out.println("Notas de 50,00: "+caixa.getBand50().getValorFace()*caixa.getBand50().getQuantidade());
		System.out.println("Notas de 20,00: "+caixa.getBand20().getValorFace()*caixa.getBand20().getQuantidade());
		System.out.println("Notas de 10,00: "+caixa.getBand10().getValorFace()*caixa.getBand10().getQuantidade());
		System.out.println("Saldo total de notas: "+(caixa.getBand100().getValorFace()*caixa.getBand100().getQuantidade()+caixa.getBand50().getValorFace()*caixa.getBand50().getQuantidade()+caixa.getBand20().getValorFace()*caixa.getBand20().getQuantidade()+caixa.getBand10().getValorFace()*caixa.getBand10().getQuantidade()));
		System.out.println("------------------------------");
	}
}
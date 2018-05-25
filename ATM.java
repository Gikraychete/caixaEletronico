package caixaEletronico;
public class ATM
{
	private String codigo;
	private String log; 
	private String numero;
	private String cidade; 
	private String estado; 
	private Bandeja band100;
	private Bandeja band50;
	private Bandeja band20;
	private Bandeja band10;
	
	public ATM(String cod, String log, String num, String cid, String uf, Bandeja band100,	Bandeja band50, Bandeja band20, Bandeja band10) 
	{		
		this.codigo = cod;
		this.log = log;
		this.numero = num;
		this.cidade = cid;
		this.estado = uf;
		this.band100 = band100;
		this.band50 = band50;
		this.band20 = band20;
		this.band10 = band10;
	}		
	  
	public String getCodigo()
	{
		return codigo;
    }

	public String getCasa()
	{
		return log;
	}

    public String getNumero()
    {
       	return numero;
    }
        
    public String getCidade()
    {
       	return cidade;
    }
        
    public String getEstado()
    {
       	return estado;
    }
            
	public Bandeja getBand100()
	{
		return band100;
	}
	
	public Bandeja getBand50()
	{
		return band50;
	}
	
	public Bandeja getBand20()
	{
		return band20;
	}
	
	public Bandeja getBand10()
	{
		return band10;
	}

	public void setBand100(Bandeja band100)
	{
		this.band100 = band100;
	}
	
	public void setBand50(Bandeja band50)
	{
		this.band50 = band50;
	}
	
	public void setBand20(Bandeja band20)
	{
		this.band20 = band20;
	}
	
	public void setBand10(Bandeja band10)
	{
		this.band10 = band10;
	}		
}
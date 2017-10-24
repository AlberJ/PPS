package hotel;

import java.util.ArrayList;
import reuso.Endereco;
import quarto.*;


public class Hotel {
	private String nome = null;
	private Endereco endereco = null;
	private ArrayList<IQuarto> quartos = new ArrayList<IQuarto>();
	private Recomendacao nota = new Recomendacao();
	private float precoSingle = 0;
	private float precoDuplo = 0;
	private float precoTriplo = 0;
	private float precoPresidencial = 0;
	

	public Hotel (String h, String c, String bairro, String rua, String numero, float d){
		nome = h;
		endereco = new Endereco(c, bairro, rua, numero, d);
	}
	
//	NOME
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String n){
		this.nome = n;
	}
	
//	ENDEREÇO
	public Endereco getEndereco(){
		return this.endereco;
	}
	
	public void setEndereco(String bairro, String rua, String n, float d){
		this.endereco.setBairro(bairro);
		this.endereco.setRua(rua);
		this.endereco.setNumero(n);
		this.endereco.setDistanciaCentro(d);
	}
	
	
//	RECOMENDAÇÃO
	public float getRecomendacao(){
		return this.nota.getNota();
	}

	public void setRecomendacao(float n){
		this.nota.setNota(n);
	}

//	PREÇOS
	
	public void setPrecoSingle(float np){
		this.precoSingle = np;
	}
	
	public float getPrecoSingle(){
		return this.precoSingle;
	}
	
	public void setPrecoDuplo(float np){
		this.precoSingle = np;
	}
	
	public float getPrecoDuplo(){
		return this.precoSingle;
	}
	
	public void setPrecoTriplo(float np){
		this.precoSingle = np;
	}
	
	public float getPrecoTriplo(){
		return this.precoSingle;
	}
	
	public void setPrecoPresidencial(float np){
		this.precoSingle = np;
	}
	
	public float getPrecoPresidencial(){
		return this.precoSingle;
	}
	
	public float valorReserva(IQuarto q){
		if(q instanceof QuartoSingle)
			return (float) this.precoSingle * q.diasReserva();
		else if(q instanceof QuartoDuplo)
			return (float) this.precoDuplo * q.diasReserva();
		else if(q instanceof QuartoTriplo)
			return (float) this.precoTriplo * q.diasReserva();
		else if(q instanceof QuartoPresidencial )
			return (float) this.precoPresidencial * q.diasReserva();
		else return (Float) null;
	}
	
//	QUARTOS 
	
	public void addQuartoSingle(int vezes){
		int qtd = 0;
		for (int i=0; i< vezes; i++){
			qtd = quartos.size();
			this.quartos.add(new QuartoSingle(qtd));
			
		}
	}
	
	public void addQuartoDuplo(int vezes){
		int qtd = 0;
		for (int i=0; i< vezes; i++){
			qtd = quartos.size();
			this.quartos.add(new QuartoDuplo(qtd));
			
		}
	}
	
	
	public IQuarto buscarQuartoNumero(int numero){
		for(IQuarto q : quartos){
			if (q.getNumero() == numero)
				return q;
		}
		
		return null;
	}
		
	@Override
	public String toString(){
		String t = "Nome: "+nome;
		t += "\nEndereco: "+ this.endereco.toString()+"\n";
		t += "Quantidade de quartos: "+quartos.size()+"\n";
		t+= "Recomendação: "+this.nota;
		
		return t;
	}
	
	
}

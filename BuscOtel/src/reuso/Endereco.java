package reuso;

public class Endereco {
	public String bairro, rua, numero, cidade;
	public float distanciaCentro;
	
	public Endereco (String cidade, String bairro, String rua, String numero, float distancia){
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.distanciaCentro = distancia;
	}
	
	public Endereco getEndereco(){
		return this;
	}
	
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	
	public String getCidade(){
		return this.cidade;
	}
	
	public void setBairro(String b){
		this.bairro = b;
	}
	
	public String getBairro(){
		return this.bairro;
	}
	
	public String getRua(){
		return this.rua;
	}
	
	public void setRua(String r){
		this.rua = r;
	}
	
	public String getNumero(){
		return this.numero;
	}
	
	public void setNumero(String n){
		this.numero = n;
	}
	
	public void setDistanciaCentro(float d){
		this.distanciaCentro = d;
	}
	
	public float getDistanciaCentro(){
		return this.distanciaCentro;
	}
	
	@Override
	public String toString(){
		String retorno = "Cidade: "+cidade+", Bairro: "+bairro+" - Rua: "+rua+", "+numero+ ", "+distanciaCentro+"km de distancia do centro";
		return retorno;
	}
}

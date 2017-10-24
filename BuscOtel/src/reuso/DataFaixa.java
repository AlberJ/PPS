package reuso;

import java.time.LocalDate;
import java.time.Period;

public class DataFaixa  {
	private LocalDate entrada;
	private LocalDate saida;
	
	public DataFaixa(int a, int m, int d){
		this.entrada = LocalDate.of(a, m, d);		
	}
	
//	ENTRADA	
	
	public void setEntrada (int a, int m, int d) {
		this.entrada = LocalDate.of(a, m, d);
	}
	
	public String getEntrada(){
		return entrada.toString();
	}
	
//	SAIDA
	
	public void setSaida (int a, int m, int d) {
		this.saida = LocalDate.of(a, m, d);
	}
	
	public String getSaida(){
		return this.saida.toString();
	}
	
	public int getPeriodo(){
		return Period.between(entrada, saida).getDays();
	}
	
}

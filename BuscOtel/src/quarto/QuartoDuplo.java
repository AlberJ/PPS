package quarto;

import java.text.ParseException;

import reuso.DataFaixa;

public class QuartoDuplo implements IQuarto{
	private int numero = 0;
	private DataFaixa dataReserva; //, dataOcupado;
	
	public QuartoDuplo(int n){
		numero = n+1;
		dataReserva = null;
	}
	
//	RESERVA ENTRADA
	
	public void setReservaEntrada(int a, int m, int d){
		if(dataReserva == null)
			this.dataReserva = new DataFaixa(a, m, d);
		else 
			this.dataReserva.setEntrada(a, m, d);
	}
	
	public String getReservaEntrada(){
		return this.dataReserva.getEntrada();
	}
	
//	RESERVA SAIDA
	public void setReservaSaida(int a, int m, int d){
		this.dataReserva.setSaida(a,m,d);
	}
	
	public String getReservaSaida(){
		return this.dataReserva.getSaida();
	}
	
//	RESERVA
	
	public void excluirReserva(){
		this.dataReserva = null;
	}
	
	public int diasReserva (){
		return this.dataReserva.getPeriodo();
	}
	
//	NUMERO DO QUARTO
	
	public void setNumero(int n){
		this.numero = n;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	@Override
	public String toString(){
		String t = //"Tipo: "+this+
				" - Numero: "+ numero;
			
			if(this.dataReserva != null)
				t+= ". Com reserva: Data de entrada: "+
			dataReserva.getEntrada();
			
			if(this.dataReserva.getSaida() != null)
				t+= " e data de saida: "+dataReserva.getSaida();
			else
				t+= " e sem data de saida.";
			
			return t;
	}
}

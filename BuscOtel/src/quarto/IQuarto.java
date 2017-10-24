package quarto;

import java.text.ParseException;

public interface IQuarto {
	
//	RESERVA ENTRADA
	public void setReservaEntrada(int a, int m, int d);
	public String getReservaEntrada();
	
//	RESERVA SAIDA
	public void setReservaSaida(int a, int m, int d);
	public String getReservaSaida();
	
//	RESERVA
	public void excluirReserva();
	public int diasReserva ();
	
//	NUMERO DO QUARTO
	public void setNumero(int n);
	public int getNumero();
}

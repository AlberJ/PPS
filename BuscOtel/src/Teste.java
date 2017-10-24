import java.text.ParseException;
import java.util.ArrayList;

import controllers.ControllerHotel;
import hotel.Hotel;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControllerHotel ch = new ControllerHotel();
		

		Hotel h1 = ch.cadastrarHotel("Caju", "Jampa", "Intermares", "Coqueirais",
				"1080", (float) 33.4);
		Hotel h2 = ch.cadastrarHotel("Dunas do Paraiso", "Pipa", "Rio Pequeno", "Grãozinho",
				"71", (float) 21.6);
		Hotel h3 = ch.cadastrarHotel("Litoral Sol", "Ponta do estado", 
				"Litoraneo", "Praia 2",
				"415", (float) 11.2);
		
		
		h1.addQuartoSingle(4);
		h1.setPrecoSingle(270);
//		h1.buscarQuartoNumero(1).diasReserva();
		h1.buscarQuartoNumero(1).setReservaEntrada(2017, 7, 1);
		h1.buscarQuartoNumero(1).setReservaSaida(2017, 7, 22);
		System.out.println(h1.buscarQuartoNumero(1).diasReserva());
		System.out.println(h1.valorReserva(h1.buscarQuartoNumero(1)) );
		
		System.out.println(ch.buscarCidade("Pipa") );
		
		
		
		
	}

}

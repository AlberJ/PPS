package controllers;

import java.util.ArrayList;
import hotel.Hotel;

public class ControllerHotel 
{
	private ArrayList<Hotel> hoteis = new ArrayList<Hotel>();
	
//	CADASTROS
	public Hotel cadastrarHotel(String nome, String c, 
			String b,  
			String r, String numero, float d)
	{
		Hotel h =new Hotel (nome, c, b, r, numero, d); 
		hoteis.add(h);
		return h;		
	}
	
//	BUSCAS
	public Hotel buscarNome(String nome){
		for(Hotel h: hoteis)
			if (h.getNome().equals(nome))
				return h;
			
		return null;
	}
	
	public ArrayList<Hotel> buscarCidade(String cidade){
		ArrayList <Hotel> lista = new ArrayList<Hotel>();

		for (Hotel h : hoteis){
			if (h.getEndereco().getCidade().equals(cidade))
				lista.add(h);
		}
		return lista;
	}
	
	
	
	public ArrayList<Hotel> getHoteis(){
		return hoteis;
	}
	
//	PREÇOS
	public void AlterarPreçoSingle(Hotel h, float novopreco){
		h.setPrecoSingle(novopreco);
	}
	
	
}

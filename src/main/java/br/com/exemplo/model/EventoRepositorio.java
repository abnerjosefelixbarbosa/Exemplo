package br.com.exemplo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EventoRepositorio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Evento> eventos = new ArrayList<>();
	
	public void adicionarEvento(Evento evento) {
		this.eventos.add(evento);
	}
	
	public List<Evento> listarEvento() {
		return this.eventos;
	}

}

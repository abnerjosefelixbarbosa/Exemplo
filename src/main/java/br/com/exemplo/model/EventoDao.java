package br.com.exemplo.model;

import java.io.Serializable;
import java.util.List;

public class EventoDao implements Serializable {

	private static final long serialVersionUID = 1L;

	private EventoRepositorio eventoRepositorio = new EventoRepositorio();
	private EventoValidar eventoValidar = new EventoValidar();
	private String resultado = "";

	public String adicinarEvento(Evento evento) {
		this.resultado = this.eventoValidar.verificar(evento);
		
		if (this.resultado.isEmpty()) {
			this.eventoRepositorio.adicionarEvento(evento);
			this.resultado = "Evento adicionado!";
		}
		
		return this.resultado;
	}

	public List<Evento> listarEventos() {
		return this.eventoRepositorio.listarEvento();
	}
}

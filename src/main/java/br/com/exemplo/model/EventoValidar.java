package br.com.exemplo.model;

import java.io.Serializable;

public class EventoValidar implements Serializable {

	private static final long serialVersionUID = 1L;

	private String resultado = "";

	public String verificar(Evento evento) {
		int i = 0;
		
		do {
			if (evento.getNome().isEmpty()) {
				this.resultado = "Nome obrigatório!";
				break;
			} 
			if (evento.getOrganizacao().isEmpty()) {
				this.resultado = "Organização obrigatória!";
				break;
			} 
			if (evento.getLocal().isEmpty()) {
				this.resultado = "Local obrigatório!";
				break;
			} 
			if (evento.getData().isEmpty()) {
				this.resultado = "Data obrigatória!";
				break;
			} 
			if (evento.getHorario().isEmpty()) {
				this.resultado = "Horário obrigatório!";		
				break;
			}
			i++;
		} while (i == 0);

		return resultado;
	}

}

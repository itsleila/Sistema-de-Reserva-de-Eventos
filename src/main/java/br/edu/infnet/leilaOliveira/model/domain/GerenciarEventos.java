package br.edu.infnet.leilaOliveira.model.domain;
import java.util.List;

public class GerenciarEventos {


	
	private List<CadastroEventos> eventos;
	
	public GerenciarEventos() {
		
	}


	public List<CadastroEventos> getEventos() {
		return eventos;
	}

	public void setEventos(List<CadastroEventos> eventos) {
		this.eventos = eventos;
	}
}

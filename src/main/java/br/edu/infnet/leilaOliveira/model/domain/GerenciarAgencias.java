package br.edu.infnet.leilaOliveira.model.domain;
import java.util.List;


public class GerenciarAgencias  {


	
	private List<AgenciaEventos> agencias;
	
	public GerenciarAgencias() {
		
	}


	public List<AgenciaEventos> getAgencias() {
		return agencias;
	}

	public void setAgencias(List<AgenciaEventos> agencias) {
		this.agencias = agencias;
	}
}
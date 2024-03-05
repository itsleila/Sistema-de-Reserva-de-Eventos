package br.edu.infnet.leilaOliveira.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.leilaOliveira.model.domain.CadastroEventos;

public class GerenciarEventosService {

	private Map<Integer, CadastroEventos> eventos = new HashMap<Integer, CadastroEventos>();

	public void incluirEvento(CadastroEventos evento) {
		eventos.put(evento.getId(), evento);
	}

	public void excluirEvento(int id) {
		eventos.remove(id);
	}

	public Collection<CadastroEventos> obterLista() {
		return eventos.values();
	}

	public CadastroEventos obterEvento(int id) {
		return eventos.get(id);
	}

}

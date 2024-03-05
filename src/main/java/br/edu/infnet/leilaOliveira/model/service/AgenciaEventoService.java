package br.edu.infnet.leilaOliveira.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.leilaOliveira.model.domain.AgenciaEventos;

public class AgenciaEventoService {
	
	private Map<String, AgenciaEventos> agencias = new HashMap<String, AgenciaEventos>();
	
	  public void incluirAgencia(AgenciaEventos agencia) {
	        agencias.put(agencia.getCnpj(), agencia);
	    }

	    public void excluirAgencia(String cnpj) {
	    	agencias.remove(cnpj);
	    }
	    
	    public Collection<AgenciaEventos> obterListaAgencia() {
	        return agencias.values();
	    }

	    public AgenciaEventos obterAgencia(String cnpj) {
	        return agencias.get(cnpj);
	    }
	    
	    

}



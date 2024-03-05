package br.edu.infnet.leilaOliveira;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.leilaOliveira.model.domain.CadastroEventos;
import br.edu.infnet.leilaOliveira.model.service.GerenciarEventosService;

@SpringBootTest
public class GerenciarEventosTest {
	
		GerenciarEventosService  gerenciarEventos;
		CadastroEventos evento = new CadastroEventos();
				
	@BeforeEach
	void setUp() 
	{
		gerenciarEventos = new GerenciarEventosService();
		CadastroEventos evento = new CadastroEventos(1, "Evento de moda");
        gerenciarEventos.incluirEvento(evento);
	}
	
	@Test
	void testeIncluir() 
	{
		evento = new CadastroEventos(2,"festa aniversario");
		gerenciarEventos.incluirEvento(evento);
		assertEquals(evento, gerenciarEventos.obterEvento(2));
	}
	
	@Test
	void testeExcluir() 
	{
		gerenciarEventos.excluirEvento(1);
		assertNull(gerenciarEventos.obterEvento(1));
		
	}
	
	@Test
	void testeObterLista() 
	{
		Collection<CadastroEventos> listaEventos = gerenciarEventos.obterLista();
        assertEquals(1, listaEventos.size());
	}
	
	@Test
	void testeObterEvento() 
	{
		CadastroEventos evento = gerenciarEventos.obterEvento(1);
	    assertNotNull(evento);
	    assertEquals("Evento de moda", evento.getNomeEvento());
		   
	}

}

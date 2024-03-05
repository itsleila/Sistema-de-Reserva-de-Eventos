package br.edu.infnet.leilaOliveira;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.leilaOliveira.model.domain.AgenciaEventos;
import br.edu.infnet.leilaOliveira.model.service.AgenciaEventoService;

@SpringBootTest
public class AgenciaEventosTests {             
	
	AgenciaEventoService agenciaEventoService;
	AgenciaEventos agencia;

	@BeforeEach
	void setUp() 
	{
		agenciaEventoService = new AgenciaEventoService();
		agencia = new AgenciaEventos();
		agencia.setNome("Jazzy");
		agencia.setEmail("J@gmail.com");
		agencia.setCnpj("5555-55555");
	}
	
	@Test
	void incluirAgencia() {
		
		agenciaEventoService.incluirAgencia(agencia);
		assertEquals(agencia, agenciaEventoService.obterAgencia(agencia.getCnpj()));
	}
	
	@Test
	void excluirAgencia() 
	{
		agenciaEventoService.excluirAgencia(agencia.getCnpj());
		assertNull(agenciaEventoService.obterAgencia(agencia.getCnpj()));
		
	}
	
	@Test
	void obterListaAgencia() 
	{
		  agenciaEventoService.incluirAgencia(agencia);
		  Collection<AgenciaEventos> listaAgencia = agenciaEventoService.obterListaAgencia();
		  assertEquals(1, listaAgencia.size());
		  assertTrue(listaAgencia.contains(agencia));
		
	}
	@Test
	void testeObterEvento() {
	    agenciaEventoService.incluirAgencia(agencia);
	    AgenciaEventos agenciaRetornada = agenciaEventoService.obterAgencia("5555-55555");
	    assertNotNull(agenciaRetornada);
	    assertEquals(agencia.getNome(), agenciaRetornada.getNome());
	    assertEquals(agencia.getEmail(), agenciaRetornada.getEmail());
	    assertEquals(agencia.getCnpj(), agenciaRetornada.getCnpj());
	}
	@Test
    void validarGetSet() {
    	
    	String nome = "OITNB";
    	String email = "OITNB@gmail.com";
    	String cnpj = "666-777";

    	AgenciaEventos agenciaTest = new AgenciaEventos (nome,email, cnpj );
        assertEquals(nome, agenciaTest.getNome());
        assertEquals(email, agenciaTest.getEmail());
        assertEquals(cnpj, agenciaTest.getCnpj());;
    }
}

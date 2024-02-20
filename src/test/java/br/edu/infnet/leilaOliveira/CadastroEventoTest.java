package br.edu.infnet.leilaOliveira;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.leilaOliveira.model.domain.CadastroEventos;

@SpringBootTest
public class CadastroEventoTest {

	 @Test
	    void testCalcularReceitaEvento() {
	        CadastroEventos ev1 = new CadastroEventos();
	        ev1.setNomeEvento("PoolParty !! ");
	        ev1.setQtdConvidados(50);
	        ev1.setPrecoIngresso(25.0);
	        assertEquals(1250.0, ev1.calcularReceitaEvento());
	     }
	 
	 void testPrecoIngressoNaoDefinido() {
	        CadastroEventos ev2 = new CadastroEventos();
	        ev2.setNomeEvento("Lançamento nova melissa");
	        ev2.setMaxCapacidade(60);
	        ev2.setQtdConvidados(50);
	        assertEquals(0.0, ev2.calcularReceitaEvento());
	    }
	 
	 @Test
	    void testMaxCapacidade() {
	        CadastroEventos ev3= new CadastroEventos();
	        ev3.setNomeEvento("Bienal do livro.");
	        ev3.setMaxCapacidade(100);
	        ev3.setPrecoIngresso(50.0);
	        ev3.setQtdConvidados(110);  
	        assertThrows(IllegalStateException.class, () -> ev3.calcularReceitaEvento());
	    }
	 
	 @Test
	    void testPrecoIngressoZero() {
	        CadastroEventos ev4 = new CadastroEventos();
	        ev4.setNomeEvento("Aniversario da Alice!");
	        ev4.setMaxCapacidade(120);
	        ev4.setQtdConvidados(50);
	        ev4.setPrecoIngresso(0.0);
	        assertEquals(0.0, ev4.calcularReceitaEvento());
	    }

	    @Test
	    void testPrecoIngressoNegativo() {
	        CadastroEventos ev5= new CadastroEventos();
	        ev5.setNomeEvento("La Revolution");
	        ev5.setMaxCapacidade(100);
	        ev5.setPrecoIngresso(-10.0);
	        ev5.setQtdConvidados(50);
	        assertEquals(0.0, ev5.calcularReceitaEvento());
	    }

	 
}
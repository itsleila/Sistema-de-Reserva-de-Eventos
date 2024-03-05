package br.edu.infnet.leilaOliveira;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.leilaOliveira.model.domain.CadastroEventos;

@Component
public class CadastroEventoMain implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	CadastroEventos evento1 = new CadastroEventos();	
		
		  evento1.setId(123456);
		  evento1.setNomeEvento("Ano do Dragão!!");
	      evento1.setLocal("Bairro Chinatown , Nº 398");
	      evento1.setDescricao("Comemoração do ano novo chines");
	      evento1.setQtdConvidados(70);
	      evento1.setMaxCapacidade(120);
	      evento1.setPrecoIngresso(50.0);
	      evento1.setData(LocalDate.of(2024, 2, 29));
	      evento1.setHorario(LocalTime.of(16, 00, 00));

	      System.out.println(evento1);
	      System.out.println("Receita total do evento: R$" + evento1.calcularReceitaEvento());
		
	}
}

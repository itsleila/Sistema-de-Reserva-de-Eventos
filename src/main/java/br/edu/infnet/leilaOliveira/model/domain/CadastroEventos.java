package br.edu.infnet.leilaOliveira.model.domain;

import java.time.LocalTime;
import java.time.LocalDate;

public class CadastroEventos {

	private String nomeEvento;
	private String descricao;
	private String local;
	private int qtdConvidados;
	private int maxCapacidade;
	private double precoIngresso;
	private LocalDate data;
    private LocalTime horario;
	
	
	public CadastroEventos() {
		
	}
	
	 public CadastroEventos(String nomeEvento, String local, String descricao, int qtdConvidados, int maxCapacidade, double precoIngresso, LocalDate data, LocalTime horario) {
	        this.nomeEvento = nomeEvento;
	        this.local = local;
	        this.descricao = descricao;
	        this.qtdConvidados = qtdConvidados;
	        this.maxCapacidade = maxCapacidade;
	        this.precoIngresso = precoIngresso;
	        this.data = data;
	        this.horario = horario;
	    }
	 
	 public double calcularReceitaEvento() {
		 if (qtdConvidados > maxCapacidade && maxCapacidade > 0) {
		        throw new IllegalStateException("Capacidade máxima do evento excedida");
		    }if (precoIngresso <= 0.0) {
		        return 0.0; 
		    }
	        return qtdConvidados * precoIngresso;
	        
	    }

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getQtdConvidados() {
		return qtdConvidados;
	}

	public void setQtdConvidados(int qtdConvidados) {
		this.qtdConvidados = qtdConvidados;
	}

	public int getMaxCapacidade() {
		return maxCapacidade;
	}

	public void setMaxCapacidade(int maxCapacidade) {
		this.maxCapacidade = maxCapacidade;
	}
	
	public double getPrecoIngresso() {
		return precoIngresso;
	}

	public void setPrecoIngresso(double precoIngresso) {
		this.precoIngresso = precoIngresso;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
        return "Nome do Evento: " + nomeEvento + "\nDescrição: " + descricao+ "\nPreço do ingresso: " + precoIngresso + "\nLocal: " + local + "\nData: "
                + data + "\nHorário: " + horario;
	}
	 
	 
	 
}
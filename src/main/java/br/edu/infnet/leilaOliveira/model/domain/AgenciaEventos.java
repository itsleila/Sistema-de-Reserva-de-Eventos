package br.edu.infnet.leilaOliveira.model.domain;



public class AgenciaEventos {
	
	private String nome;
	private String email;
	private String cnpj;
	
	
	public AgenciaEventos() {
		
	} 
	

public AgenciaEventos(String nome, String email, String cnpj) {
    this.setNome(nome);
    this.setEmail(email);
    this.setCnpj(cnpj);
}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	

	
}



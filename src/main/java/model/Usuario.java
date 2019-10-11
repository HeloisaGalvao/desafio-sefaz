package model;

import java.util.List;

public class Usuario {

	private Integer id;
	private String nome;
	private String email;
	private String senha;
	private List<Telefone> telefone;
	
	public Usuario() {
	}

	public Usuario(Integer id, String nome, String email, String senha, List<Telefone> telefone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public List<Telefone> getTelefone() {
		return telefone;
	}
	
	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}
	
}
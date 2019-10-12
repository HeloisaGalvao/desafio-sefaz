package controler;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import dao.UsuarioDAOImpl;
import model.Telefone;
import model.Usuario;

@ManagedBean
public class UsuarioMB implements Serializable {
	
	UsuarioDAOImpl dao = new UsuarioDAOImpl();
	
	private Usuario usuario = new Usuario();;
	
	public UsuarioMB() {
		// TODO Auto-generated constructor stub
	}
	
	
/*	@PostConstruct
	public void init() {
		usuario = new Usuario();
	}
	*/
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void salvar() {
		
		usuario  = createUserStatico();
		
		dao.incluir(usuario);
		
	}
	
	public Usuario createUserStatico() {
		Usuario u = new Usuario();
		Telefone t = new Telefone();
		t.setDdd("87");
		t.setNumero("998106737");
		t.setTipo("movel");
		
		List<Telefone> lista = new ArrayList<Telefone>();
		
		lista.add(t);
		u.setEmail("teste@gamil.com");
		u.setSenha("1234");
		u.setNome("Teste");
		u.setTelefone(lista);
		return u;
	}
	
}

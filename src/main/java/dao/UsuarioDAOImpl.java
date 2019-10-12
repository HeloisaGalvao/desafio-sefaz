package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Usuario;

@Stateless
public class UsuarioDAOImpl {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void incluir(Usuario usuario) {
		
		entityManager.persist(usuario);
		
	}


	public void alterar(Usuario usuario) {
		
		entityManager.merge(usuario);
		
	}


	public void excluir(Integer idUsuario) {
		
		Usuario usuario = new Usuario();
		
		usuario = entityManager.find(Usuario.class, idUsuario);
		
		entityManager.remove(usuario);
		
	}


	public List<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}


	public Usuario consultarPorId(Integer idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}


	public Usuario consultarPorEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

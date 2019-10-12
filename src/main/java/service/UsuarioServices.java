package service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.UsuarioDAOImpl;
import model.Usuario;

@Stateless
public class UsuarioServices {

	@EJB
	private UsuarioDAOImpl dao = new UsuarioDAOImpl();
	
	public boolean validarCampos(Usuario usuario) {
		if(usuario.getNome() == null || usuario.getNome().isEmpty()) {
			
			
		}else {
		}
		return true;
		
	}
	
	public void verificarDuplicidade() {
		
	}
	
	public void cadastrar(Usuario usuario) {
		dao.incluir(usuario);
	}
	
	public void alterar(Usuario usuario) {
		dao.alterar(usuario);
	}
	
	public void excluir(Integer idUsuario) {
		dao.excluir(idUsuario);
	}
}

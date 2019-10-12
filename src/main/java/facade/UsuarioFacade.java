package facade;

import model.Usuario;
import service.UsuarioServices;

public class UsuarioFacade {
	
	private UsuarioServices service = new UsuarioServices();
	
	public void cadastrar(Usuario usuario) {
		service.validarCampos(usuario);
		service.verificarDuplicidade();
		service.cadastrar(usuario);
	}
	
	public void alterar(Usuario usuario) {
		service.validarCampos(usuario);
		service.alterar(usuario);
	}
	
	

}

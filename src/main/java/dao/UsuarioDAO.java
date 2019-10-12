package dao;

import java.util.List;

import model.Usuario;

public interface UsuarioDAO {


	public void incluir(Usuario usuario);
	public void alterar(Usuario usuario);
	public void excluir(Integer idUsuario);
	public Usuario consultarPorId(Integer idUsuario);
	public Usuario consultarPorEmail(String email);
	public List<Usuario> listarTodos();
}

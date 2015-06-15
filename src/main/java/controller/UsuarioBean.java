package controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import DAO.DAO;

@ManagedBean(name="userbean")
@RequestScoped
public class UsuarioBean implements Serializable {

	private Usuario user = new Usuario();
	private List<Usuario> usuarios;
	
	
	public List<Usuario> getUsuarios() {
		if(usuarios == null){
			usuarios = new DAO<Usuario>(Usuario.class).listaTodos();
		}
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void adiciona(){
		DAO<Usuario> dao = new DAO<Usuario>(Usuario.class);
		dao.adiciona(user);
		this.user = new Usuario();
	}
	

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
}

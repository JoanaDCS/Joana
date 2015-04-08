package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import DAO.DAO;
import Model.Usuario;

@ManagedBean(name="userbean")
@RequestScoped
public class UsuarioBean {

	private Usuario user = new Usuario();
	
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

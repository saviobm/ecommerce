package br.com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.modelo.Usuario;
import br.com.ecommerce.properties.AppProperties;
import br.com.ecommerce.repository.UsuarioDAO;
import br.com.ecommerce.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private AppProperties properties;
	
	@Autowired
	private UsuarioDAO<Usuario> usuarioDAO;

	@Override
	public Usuario login(Usuario usuario) {
		String url = properties.getUrl();
		return getUsuarioDAO().findByUsuario(usuario);
	}

	/**
	 * @return the usuarioDAO
	 */
	public UsuarioDAO<Usuario> getUsuarioDAO() {
		return usuarioDAO;
	}

	/**
	 * @param usuarioDAO the usuarioDAO to set
	 */
	public void setUsuarioDAO(UsuarioDAO<Usuario> usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
}

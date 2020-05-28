package br.com.ecommerce.repository;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.ecommerce.modelo.Ecommerce;
import br.com.ecommerce.modelo.Usuario;

@Transactional
@Repository
public class UsuarioDAO<T extends Ecommerce> extends EcommerceDAO<T> {
	
	@SuppressWarnings("unchecked")
	public Usuario findByUsuario(Usuario usuario) {
		if (usuario != null) {
			StringBuilder sb = new StringBuilder();
			sb.append("from Usuario where 1 = 1");
			sb.append(" from Usuario where 1 = 1");	
			sb.append(" username = :username");
			sb.append(" password = :password");
			Query query = getEntityManager().createQuery(sb.toString());
			query.setParameter("username", usuario.getUsername());
			query.setParameter("password", usuario.getPassword());
			List<Usuario> listaRetorno = query.getResultList();
			if (listaRetorno.isEmpty()) {
				return listaRetorno.get(0);
			}
		}
		return null;
	}

}
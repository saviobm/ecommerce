package br.com.ecommerce.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.ecommerce.modelo.Ecommerce;

@Transactional
@Repository
public class EcommerceDAO<T extends Ecommerce> implements EcommerceRepository<T>  {
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	@Override
	public <S extends T> S save(S entity) {
		return entityManager.merge(entity);
	}

	@Override
	public <S extends T> Iterable<S> saveAll(Iterable<S> entities) {
		List<S> iterable = new ArrayList<>();
		if (entities != null) {
			for (S item : entities) {
				S itemPersistido = entityManager.merge(item);
				iterable.add(itemPersistido);
			}
		}
		return iterable;
	}

	@Override
	public Optional<T> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<T> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends T> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
	}

	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * @param entityManager the entityManager to set
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}

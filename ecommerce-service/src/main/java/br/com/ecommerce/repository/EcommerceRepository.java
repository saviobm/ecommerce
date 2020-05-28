package br.com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.ecommerce.modelo.Ecommerce;

public interface EcommerceRepository<T extends Ecommerce> extends CrudRepository<T, Long> {
	
}	
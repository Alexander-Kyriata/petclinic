package org.springframework.samples.petclinic.vet;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface UserRepository extends Repository<User, Integer> {
	@Transactional(readOnly = true)
//	@Cacheable("users")
	Collection<User> findAll() throws DataAccessException;

	@Transactional(readOnly = true)
//	@Cacheable("users")
	Page<User> findAll(Pageable pageable) throws DataAccessException;
}

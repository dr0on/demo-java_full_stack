package com.thoughtscript.javafullstack.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.thoughtscript.javafullstack.domain.User;

@Repository
@Transactional(readOnly = false)
public class UserDao {

	@PersistenceContext
	EntityManager entityManager;

	public User fetchUserByEmail(String email) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
		Root<User> root = criteriaQuery.from(User.class);
		criteriaQuery.select(root);
		criteriaQuery.where(criteriaBuilder.equal(root.get("email"), email));
		List<User> result = this.entityManager.createQuery(criteriaQuery).getResultList();
		if (!result.isEmpty())
			return result.get(0);
		else
			return null;
	}
	
	public boolean authenticate(String email, String password) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
		Root<User> root = criteriaQuery.from(User.class);
		criteriaQuery.select(root);
		criteriaQuery.where(criteriaBuilder.equal(root.get("email"), email));
		criteriaQuery.where(criteriaBuilder.equal(root.get("password"), password));
		List<User> result = this.entityManager.createQuery(criteriaQuery).getResultList();
		if (!result.isEmpty())
			return true;
		else
			return false;
	}
}
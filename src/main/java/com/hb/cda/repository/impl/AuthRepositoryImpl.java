package com.hb.cda.repository.impl;

import com.hb.cda.repository.AuthRepository;
import com.hb.cda.utils.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceException;

public class AuthRepositoryImpl<T> implements AuthRepository<T> {

  private Class<T> entityClass;

  public AuthRepositoryImpl(Class<T> entityClass) {
    this.entityClass = entityClass;
  }

  @Override
  public T findByEmailAndPassword(String email, String password) {
    try {
      EntityManager eM = JpaUtil.getEntityManager();
      T entity = eM
          .createQuery(
              "SELECT e FROM " + entityClass.getName() + " e WHERE e.email = :email AND e.password = :password",
              entityClass)
          .setParameter("email", email)
          .setParameter("password", password)
          .getSingleResult();
      eM.close();
      return entity;
    } catch (PersistenceException e) {
      e.printStackTrace();
    }
    return null;
  }
}

package com.hb.cda.repository;

public interface AuthRepository<T> {

  T findByEmailAndPassword(String email, String password);

}

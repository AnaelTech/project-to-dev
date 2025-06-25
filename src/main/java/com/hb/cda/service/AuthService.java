package com.hb.cda.service;

public interface AuthService<T> {

  T findByEmailAndPassword(String email, String password);

}

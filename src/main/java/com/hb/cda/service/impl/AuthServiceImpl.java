package com.hb.cda.service.impl;

import com.hb.cda.repository.AuthRepository;
import com.hb.cda.service.AuthService;

public class AuthServiceImpl<T> implements AuthService<T> {

  private AuthRepository<T> repository;

  public AuthServiceImpl(AuthRepository<T> repository) {
    this.repository = repository;
  }

  @Override
  public T findByEmailAndPassword(String email, String password) {
    return repository.findByEmailAndPassword(email, password);
  }

}

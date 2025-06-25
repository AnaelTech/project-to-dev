package com.hb.cda.service;

import java.util.List;

public interface GeneriqueService<T, K> {

  List<T> findAll();

  T findById(K id);

  void save(T entity);

  void delete(T entity);

  void update(T entity);
}

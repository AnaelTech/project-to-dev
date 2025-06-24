package com.hb.cda.repository;

import java.util.List;

public interface GeneriqueRepository<T, K> {

  List<T> findAll();

  T findById(K id);

  void save(T entity);

  void delete(T entity);

  void update(T entity);
}

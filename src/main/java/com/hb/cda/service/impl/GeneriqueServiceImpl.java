package com.hb.cda.service.impl;

import java.util.List;

import com.hb.cda.repository.GeneriqueRepository;
import com.hb.cda.service.GeneriqueService;

public class GeneriqueServiceImpl<T, K> implements GeneriqueService<T, K> {

  protected final Class<T> entityClass;
  private GeneriqueRepository<T, K> repository;

  public GeneriqueServiceImpl(Class<T> entityClass, GeneriqueRepository<T, K> repository) {
    this.entityClass = entityClass;
    this.repository = repository;
  }

  @Override
  public List<T> findAll() {
    return repository.findAll();
  }

  @Override
  public T findById(K id) {
    return repository.findById(id);
  }

  @Override
  public void save(T entity) {
    repository.save(entity);
  }

  @Override
  public void delete(T entity) {
    repository.delete(entity);
  }

  @Override
  public void update(T entity) {
    repository.update(entity);
  }

}

package com.hb.cda.repository.impl;

import java.util.List;

import com.hb.cda.repository.GeneriqueRepository;
import com.hb.cda.utils.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceException;

public abstract class GeneriqueRepositoryImpl<T, K> implements GeneriqueRepository<T, K> {

  protected final Class<T> entityClass;

  public GeneriqueRepositoryImpl(Class<T> entityClass) {
    this.entityClass = entityClass;
  }

  /**
   * Recherche tous les éléments dans la base de données.
   * 
   * @return La liste des éléments trouvés.
   */
  @Override
  public List<T> findAll() {
    try {

      EntityManager eM = JpaUtil.getEntityManager();
      List<T> entities = eM.createQuery("SELECT e FROM " + entityClass.getName() + " e", entityClass).getResultList();
      eM.close();
      return entities;
    } catch (PersistenceException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * Recherche un élément dans la base de données en fonction de son identifiant.
   * 
   * @param id L'identifiant de l'élément à rechercher.
   * @return L'élément trouvé ou null si aucun élément n'a été trouvé.
   */
  @Override
  public T findById(K id) {
    try {
      EntityManager eM = JpaUtil.getEntityManager();
      T entity = eM.find(entityClass, id);
      eM.close();
      return entity;
    } catch (PersistenceException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * Enregistre un élément dans la base de données.
   * 
   * @param entity L'élément à enregistrer.
   */
  @Override
  public void save(T entity) {
    try {
      EntityManager eM = JpaUtil.getEntityManager();
      eM.persist(entity);
      eM.flush();
      eM.close();
    } catch (PersistenceException e) {
      e.printStackTrace();
    }
  }

  /**
   * Supprime un élément de la base de données.
   * 
   * @param entity L'élément à supprimer.
   */
  @Override
  public void delete(T entity) {
    try {
      EntityManager eM = JpaUtil.getEntityManager();
      eM.remove(entity);
      eM.flush();
      eM.close();
    } catch (PersistenceException e) {
      e.printStackTrace();
    }
  }

  /**
   * Met à jour un élément dans la base de données.
   * 
   * @param entity L'élément à mettre à jour.
   */
  @Override
  public void update(T entity) {
    try {
      EntityManager eM = JpaUtil.getEntityManager();
      eM.merge(entity);
      eM.flush();
      eM.close();
    } catch (PersistenceException e) {
      e.printStackTrace();
    }
  }
}

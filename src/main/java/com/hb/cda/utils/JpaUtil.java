package com.hb.cda.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Utility class for managing JPA EntityManagerFactory and EntityManager
 * instances.
 * Provides methods to obtain and close EntityManager resources.
 */
public class JpaUtil {

  /**
   * Singleton EntityManagerFactory instance for the application.
   */
  private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("main");

  /**
   * Method to get a new EntityManager.
   * 
   *
   * @return the EntityManager
   */
  public static EntityManager getEntityManager() {
    return emf.createEntityManager();
  }

  /**
   * Method to close the EntityManagerFactory.
   * Should be called when the application is shutting down
   */
  public static void close() {
    emf.close();
  }
}

package com.hb.cda.repository.impl;

import java.time.LocalDate;
import java.util.List;

import com.hb.cda.model.Project;
import com.hb.cda.repository.ProjectRepository;
import com.hb.cda.utils.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceException;

public class ProjectRepositoryImpl extends GeneriqueRepositoryImpl<Project, Long> implements ProjectRepository {

  public ProjectRepositoryImpl() {
    super(Project.class);
  }

  /**
   * Recherche les projets ayant une date de livraison donnée.
   * 
   * @param dateLivraison La date de livraison du projet.
   * @return La liste des projets ayant une date de livraison donnée.
   */
  @Override
  public List<Project> findByDateLivraison(LocalDate dateLivraison) {
    try {
      EntityManager eM = JpaUtil.getEntityManager();
      eM.getTransaction().begin();
      List<Project> projects = eM
          .createQuery("SELECT p FROM Project p WHERE p.dateLivraison = :dateLivraison", Project.class)
          .setParameter("dateLivraison", dateLivraison).getResultList();
      eM.getTransaction().commit();
      eM.close();
      return projects;
    } catch (PersistenceException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * Recherche les projets ayant une thématique donnée.
   * 
   * 
   *
   * 
   * @param thematique La thématique du projet.
   * @return La liste des projets ayant une thématique donnée.
   */
  @Override
  public List<Project> findByThematique(String thematique) {
    try {
      EntityManager eM = JpaUtil.getEntityManager();
      eM.getTransaction().begin();
      List<Project> projects = eM.createQuery("SELECT p FROM Project p WHERE p.thematique = :thematique", Project.class)
          .setParameter("thematique", thematique).getResultList();
      eM.getTransaction().commit();
      eM.close();
      return projects;
    } catch (PersistenceException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * Recherche les projets ayant un budget donné.
   * 
   * @param budget Le budget du projet.
   * @return La liste des projets ayant un budget donné.
   */
  @Override
  public List<Project> findByBudget(double budget) {
    try {
      EntityManager eM = JpaUtil.getEntityManager();
      eM.getTransaction().begin();
      List<Project> projects = eM.createQuery("SELECT p FROM Project p WHERE p.budget = :budget", Project.class)
          .setParameter("budget", budget).getResultList();
      eM.getTransaction().commit();
      eM.close();
      return projects;
    } catch (PersistenceException e) {
      e.printStackTrace();
    }
    return null;
  }

}

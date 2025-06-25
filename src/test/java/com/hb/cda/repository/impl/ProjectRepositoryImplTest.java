package com.hb.cda.repository.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hb.cda.model.Project;
import com.hb.cda.model.enums.Thematique;
import com.hb.cda.utils.JpaUtil;

import jakarta.persistence.EntityManager;

public class ProjectRepositoryImplTest {

  List<Project> projets;

  @BeforeEach
  void setUp() {
    Project project1 = new Project("BURGER", "Projet Burger", LocalDate.of(2025, 12, 24), 16000.0, Thematique.AUTRE,
        null);
    Project project2 = new Project("GAME", "Projet Game", LocalDate.of(2025, 4, 12), 15000.0, Thematique.GAME, null);
    Project project3 = new Project("MOBILE", "Projet Mobile", LocalDate.of(2025, 1, 1), 10000.0, Thematique.MOBILE,
        null);
    Project project4 = new Project("WEB", "Projet Web", LocalDate.of(2025, 6, 10), 20000.0, Thematique.WEB, null);
    Project project5 = new Project("WEB", "Projet Web", LocalDate.of(2025, 5, 05), 20000.0, Thematique.WEB, null);
    Project project6 = new Project("WEB", "Projet Web", LocalDate.of(2025, 6, 12), 20000.0, Thematique.WEB, null);
    projets = List.of(project1, project2, project3);
    EntityManager em = JpaUtil.getEntityManager();
    em.getTransaction().begin();
    em.persist(project1);
    em.persist(project2);
    em.persist(project3);
    em.persist(project4);
    em.persist(project5);
    em.persist(project6);
    em.getTransaction().commit();
  }

  @AfterEach
  void cleanUp() {
    EntityManager em = JpaUtil.getEntityManager();
    em.getTransaction().begin();
    em.createQuery("DELETE FROM Project").executeUpdate();
    em.getTransaction().commit();
  }

  @Test
  void shouldReturnProjectByDateLivraison() {
    ProjectRepositoryImpl projectRepository = new ProjectRepositoryImpl();
    projets = projectRepository.findByDateLivraison(LocalDate.of(2025, 12, 24));
    assertEquals(1, projets.size());
  }

  @Test
  void shouldReturnProjectByThematique() {
    ProjectRepositoryImpl projectRepository = new ProjectRepositoryImpl();
    projets = projectRepository.findByThematique(Thematique.WEB);
    assertEquals(3, projets.size());
  }

  @Test
  void shouldReturnProjectByBudget() {
    ProjectRepositoryImpl projectRepository = new ProjectRepositoryImpl();
    projets = projectRepository.findByBudget(20000.0);
    assertEquals(3, projets.size());
  }

}

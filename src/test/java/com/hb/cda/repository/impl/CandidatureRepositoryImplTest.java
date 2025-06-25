package com.hb.cda.repository.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hb.cda.model.Candidature;
import com.hb.cda.model.Dev;
import com.hb.cda.model.PorteurDeProjet;
import com.hb.cda.model.Project;
import com.hb.cda.model.enums.StatusCandidature;
import com.hb.cda.utils.JpaUtil;

import jakarta.persistence.EntityManager;

public class CandidatureRepositoryImplTest {

  Project project;

  @BeforeEach
  void setUp() {
    PorteurDeProjet porteurDeProjet = new PorteurDeProjet("john@john.com", "password", "john", "desc");
    Dev dev = new Dev("anael@anael.com", "password", "anael", "desc");
    project = new Project("BURGER", "Projet Burger", LocalDate.of(2025, 6, 30), 10000.0, null, null);
    project.setPorteurDeProjet(porteurDeProjet);

    Candidature candidature1 = new Candidature(LocalDate.of(2025, 6, 25), dev, project, StatusCandidature.EN_COURS);
    Candidature candidature2 = new Candidature(LocalDate.of(2025, 6, 12), dev, project, StatusCandidature.EN_COURS);
    Candidature candidature3 = new Candidature(LocalDate.of(2025, 6, 15), dev, project, StatusCandidature.EN_COURS);

    EntityManager em = JpaUtil.getEntityManager();
    em.getTransaction().begin();
    em.persist(porteurDeProjet);
    em.persist(dev);
    em.persist(project);
    em.persist(candidature1);
    em.persist(candidature2);
    em.persist(candidature3);
    em.getTransaction().commit();
    em.close();
  }

  @Test
  void shouldPassAssertion() {
    int result = 1 + 1;
    assertEquals(2, result);
  }

  @Test
  void shouldGetCandidaturesProject() {
    CandidatureRepositoryImpl candidatureRepository = new CandidatureRepositoryImpl();

    assertEquals(3, candidatureRepository.getCandidaturesProject(project).size());
  }

}

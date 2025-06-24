package com.hb.cda.repository.impl;

import java.util.List;

import com.hb.cda.model.Candidature;
import com.hb.cda.model.Project;
import com.hb.cda.repository.CandidatureRepository;
import com.hb.cda.utils.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceException;

public class CandidatureRepositoryImpl implements CandidatureRepository {

  @Override
  public List<Candidature> getCandidaturesProject(Project projet) {
    try {
      EntityManager eM = JpaUtil.getEntityManager();
      eM.getTransaction().begin();
      List<Candidature> candidatures = eM
          .createQuery("SELECT c FROM Candidature c WHERE c.project = :projet", Candidature.class)
          .setParameter("projet", projet).getResultList();
      eM.getTransaction().commit();
      eM.close();
      return candidatures;
    } catch (PersistenceException e) {
      e.printStackTrace();
    }
    return null;
  }

}

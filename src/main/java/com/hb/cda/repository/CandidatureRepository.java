package com.hb.cda.repository;

import java.util.List;

import com.hb.cda.model.Candidature;
import com.hb.cda.model.Project;

public interface CandidatureRepository extends GeneriqueRepository<Candidature, Long> {

  List<Candidature> getCandidaturesProject(Project projet);
}

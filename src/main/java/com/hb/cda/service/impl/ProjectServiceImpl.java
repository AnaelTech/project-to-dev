package com.hb.cda.service.impl;

import java.time.LocalDate;
import java.util.List;

import com.hb.cda.model.Project;
import com.hb.cda.model.enums.Thematique;
import com.hb.cda.service.ProjectService;
import com.hb.cda.repository.impl.ProjectRepositoryImpl;

public class ProjectServiceImpl extends GeneriqueServiceImpl<Project, Long> implements ProjectService {

  private ProjectRepositoryImpl repository;

  public ProjectServiceImpl() {
    super(Project.class, new ProjectRepositoryImpl());
  }

  @Override
  public List<Project> findByDateLivraison(LocalDate dateLivraison) {
    return repository.findByDateLivraison(dateLivraison);
  }

  @Override
  public List<Project> findByBudget(double budget) {
    return repository.findByBudget(budget);
  }

  @Override
  public List<Project> findByThematique(Thematique thematique) {
    return repository.findByThematique(thematique);
  }

}

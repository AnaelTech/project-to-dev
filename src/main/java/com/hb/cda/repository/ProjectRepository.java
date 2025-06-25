package com.hb.cda.repository;

import java.time.LocalDate;
import java.util.List;

import com.hb.cda.model.Project;
import com.hb.cda.model.enums.Thematique;

public interface ProjectRepository extends GeneriqueRepository<Project, Long> {

  List<Project> findByDateLivraison(LocalDate dateLivraison);

  List<Project> findByThematique(Thematique thematique);

  List<Project> findByBudget(double budget);

}

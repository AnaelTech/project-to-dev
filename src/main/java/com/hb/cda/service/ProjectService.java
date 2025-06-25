package com.hb.cda.service;

import java.time.LocalDate;
import java.util.List;

import com.hb.cda.model.Project;
import com.hb.cda.model.enums.Thematique;

public interface ProjectService extends GeneriqueService<Project, Long> {

  List<Project> findByDateLivraison(LocalDate dateLivraison);

  List<Project> findByBudget(double budget);

  List<Project> findByThematique(Thematique thematique);

}

package com.hb.cda.controller;

import java.time.LocalDate;

import com.hb.cda.model.Candidature;
import com.hb.cda.model.Project;
import com.hb.cda.model.enums.Thematique;
import com.hb.cda.service.CandidatureService;
import com.hb.cda.service.ProjectService;
import com.hb.cda.utils.InputOutput;

public class DevController {

  private CandidatureService candidatureService;
  private ProjectService projectService;
  private Project project;
  private Candidature candidature;
  private static InputOutput io;

  // TODO:Le Dev peut afficher les candidatures qui lui sont associées, voir la
  // liste de projets et les filtrer, Il peut candidater a un projet

  public DevController(InputOutput io) {
    this.io = io;
  }

  public Integer afficherMenuDev() {
    io.afficher("Menu Dev");
    io.afficher("1. Afficher les candidatures");
    io.afficher("2. Candidature");
    io.afficher("3. Afficher les projets");
    io.afficher("4. Filtrer les projets");
    io.afficher("5. Quitter");
    return io.lireInt();
  }

  public void choixMenuDev() {
    Integer choix = io.lireInt();
    switch (choix) {
      case 1:
        afficherCandidatures();
        break;
      case 2:
        Candidature();
        break;
      case 3:
        afficherProjets();
        break;
      case 4:
        choixMenuFiltrerProjets();
        break;
      case 5:
        io.afficher("Au revoir !");
        break;
      default:
        io.afficher("Choix non valide");
        break;
    }
  }

  private Integer choixMenuFiltrerProjets() {
    io.afficher("Filtrer les projets");
    io.afficher("1. Filtrer par date");
    io.afficher("2. Filtrer par budget");
    io.afficher("3. Filtrer par thème");
    return io.lireInt();
  }

  private void filtrerProjets() {
    Integer choix = io.lireInt();
    switch (choix) {
      case 1:
        io.afficher("Entrez la date de livraison (format: YYYY-MM-DD):");
        LocalDate dateLivraison = io.lireDate();
        projectService.findByDateLivraison(dateLivraison);
        break;
      case 2:
        projectService.findByBudget(io.lireDouble());
        break;
      case 3:
        projectService.findByThematique(Thematique.valueOf(io.lireString().toUpperCase()));
        break;
      default:
        io.afficher("Choix non valide");
        break;
    }
  }

  private void Candidature() {
    throw new UnsupportedOperationException("Unimplemented method 'Candidature'");
  }

  public void afficherCandidatures() {
    io.afficher("Affichage des candidatures...");
  }

  public void afficherProjets() {
    io.afficher("Affichage des projets...");
    io.afficher(projectService.findAll().toString());
  }

}

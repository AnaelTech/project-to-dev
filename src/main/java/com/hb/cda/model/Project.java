package com.hb.cda.model;

import java.time.LocalDate;
import java.util.List;

import com.hb.cda.model.enums.StatusProject;
import com.hb.cda.model.enums.Thematique;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "project")
public class Project {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String description;
  private LocalDate dateLivraison;
  private double budget;

  @Enumerated(EnumType.STRING)
  private Thematique thematique;

  @Enumerated(EnumType.STRING)
  private StatusProject statusProject;

  @OneToMany(mappedBy = "project")
  private List<Candidature> candidatures;

  @ManyToOne
  private PorteurDeProjet porteurDeProjet;

  public Project() {
  }

  public Project(String title, String description, LocalDate dateLivraison, double budget, Thematique thematique,
      StatusProject statusProject) {
    this.title = title;
    this.description = description;
    this.dateLivraison = dateLivraison;
    this.budget = budget;
    this.thematique = thematique;
    this.statusProject = statusProject;
  }

  public Project(Long id, String title, String description, LocalDate dateLivraison, double budget,
      Thematique thematique, StatusProject statusProject) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.dateLivraison = dateLivraison;
    this.budget = budget;
    this.thematique = thematique;
    this.statusProject = statusProject;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getDateLivraison() {
    return dateLivraison;
  }

  public void setDateLivraison(LocalDate dateLivraison) {
    this.dateLivraison = dateLivraison;
  }

  public double getBudget() {
    return budget;
  }

  public void setBudget(double budget) {
    this.budget = budget;
  }

  public Thematique getThematique() {
    return thematique;
  }

  public void setThematique(Thematique thematique) {
    this.thematique = thematique;
  }

  public StatusProject getStatusProject() {
    return statusProject;
  }

  public void setStatusProject(StatusProject statusProject) {
    this.statusProject = statusProject;
  }

  public List<Candidature> getCandidatures() {
    return candidatures;
  }

  public void setCandidatures(List<Candidature> candidatures) {
    this.candidatures = candidatures;
  }

  public PorteurDeProjet getPorteurDeProjet() {
    return porteurDeProjet;
  }

  public void setPorteurDeProjet(PorteurDeProjet porteurDeProjet) {
    this.porteurDeProjet = porteurDeProjet;
  }
}

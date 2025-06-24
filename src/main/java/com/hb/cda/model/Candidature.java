package com.hb.cda.model;

import java.time.LocalDate;

import com.hb.cda.model.enums.StatusCandidature;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidature")
public class Candidature {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private LocalDate dateDepot;

  @ManyToOne
  private Dev dev;

  @ManyToOne
  private Project project;

  @Enumerated(EnumType.STRING)
  private StatusCandidature statusCandidature;

  public Candidature() {
  }

  public Candidature(Long id, LocalDate dateDepot, Dev dev, Project project, StatusCandidature statusCandidature) {
    this.id = id;
    this.dateDepot = dateDepot;
    this.dev = dev;
    this.project = project;
    this.statusCandidature = statusCandidature;
  }

  public Candidature(LocalDate dateDepot, Dev dev, Project project, StatusCandidature statusCandidature) {
    this.dateDepot = dateDepot;
    this.dev = dev;
    this.project = project;
    this.statusCandidature = statusCandidature;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getDateDepot() {
    return dateDepot;
  }

  public void setDateDepot(LocalDate dateDepot) {
    this.dateDepot = dateDepot;
  }

  public Dev getDev() {
    return dev;
  }

  public void setDev(Dev dev) {
    this.dev = dev;
  }

  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public StatusCandidature getStatusCandidature() {
    return statusCandidature;
  }

  public void setStatusCandidature(StatusCandidature statusCandidature) {
    this.statusCandidature = statusCandidature;
  }

}

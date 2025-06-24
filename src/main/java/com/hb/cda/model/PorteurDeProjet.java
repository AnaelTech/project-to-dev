package com.hb.cda.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "porteur_de_projet")
public class PorteurDeProjet extends User {

  @OneToMany(mappedBy = "porteurDeProjet")
  private List<Project> projets;

  public PorteurDeProjet() {
  }

  public PorteurDeProjet(String email, String password, String nom, String description) {
    super(email, password, nom, description);
  }

  public PorteurDeProjet(Long id, String email, String password, String nom, String description) {
    super(id, email, password, nom, description);
  }

  public List<Project> getProjets() {
    return projets;
  }

  public void setProjets(List<Project> projets) {
    this.projets = projets;
  }
}

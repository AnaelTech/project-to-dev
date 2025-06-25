package com.hb.cda.model;

import java.util.List;

import com.hb.cda.model.enums.Technologies;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "dev")
public class Dev extends User {

  @Enumerated(EnumType.STRING)
  @Column(nullable = true)
  private Technologies technologies;

  @OneToMany(mappedBy = "dev")
  private List<Candidature> candidature;

  public Dev() {
    super();
  }

  public Dev(String email, String password, String nom, String description) {
    super(email, password, nom, description);
  }

  public Technologies getTechnologies() {
    return technologies;
  }

  public void setTechnologies(Technologies technologies) {
    this.technologies = technologies;
  }

  public List<Candidature> getCandidatures() {
    return candidature;
  }

  public void setCandidatures(List<Candidature> candidatures) {
    this.candidature = candidatures;
  }
}

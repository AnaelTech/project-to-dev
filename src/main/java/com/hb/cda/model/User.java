package com.hb.cda.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  protected Long id;
  protected String email;
  protected String password;
  protected String nom;

  @Column(nullable = true)
  protected String description;

  public User() {
  }

  public User(String email, String password, String nom, String description) {
    this.email = email;
    this.password = password;
    this.nom = nom;
    this.description = description;
  }

  public User(Long id, String email, String password, String nom, String description) {
    this.id = id;
    this.email = email;
    this.password = password;
    this.nom = nom;
    this.description = description;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}

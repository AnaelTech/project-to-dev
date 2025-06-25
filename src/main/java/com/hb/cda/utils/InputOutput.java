package com.hb.cda.utils;

import java.time.LocalDate;

public interface InputOutput {
  /**
   * Affiche un message
   * 
   * @param message message à afficher
   */
  void afficher(String message);

  /**
   * Affiche un message sans retour à la ligne
   * 
   * @param message message à afficher
   */
  void afficherSansRetour(String message);

  /**
   * retourne un message en String
   * 
   * @return message
   */
  String lireString();

  /**
   * retourne un message en Int
   *
   */
  Integer lireInt();

  /**
   * retourne un message en Date
   *
   */
  LocalDate lireDate();

  /**
   * retourne un message en Double
   *
   */
  Double lireDouble();
}

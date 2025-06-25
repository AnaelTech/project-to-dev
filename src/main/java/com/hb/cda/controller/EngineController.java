package com.hb.cda.controller;

import com.hb.cda.model.Dev;
import com.hb.cda.repository.impl.AuthRepositoryImpl;
import com.hb.cda.service.AuthService;
import com.hb.cda.service.impl.AuthServiceImpl;
import com.hb.cda.utils.InputOutput;
import com.hb.cda.utils.JpaUtil;
import com.hb.cda.utils.impl.InputOutputImpl;

import jakarta.persistence.EntityManager;

public class EngineController {

  private static Dev currentDev = null;
  private static InputOutput io;

  static EntityManager eM;

  public EngineController() {
    io = new InputOutputImpl();
    boolean connected = false;
    AuthService<Dev> devService = new AuthServiceImpl<>(new AuthRepositoryImpl<>(Dev.class));

    while (!connected) {
      io.afficher("=== Connexion Dev ===");
      io.afficher("Entrez votre identifiant : ");
      String email = io.lireString();
      io.afficher("Entrez votre mot de passe : ");
      String password = io.lireString();

      Dev dev = devService.findByEmailAndPassword(email, password);
      if (dev != null) {
        connected = true;
        currentDev = dev;
        io.afficher("Bienvenue " + dev.getNom() + " !");
      } else {
        io.afficher("Dev non trouvé.");
        io.afficher("Création d'un nouveau Dev");
        eM = JpaUtil.getEntityManager();
        eM.getTransaction().begin();
        dev = new Dev("tech@gmail.com", "password", "anaeltech", "DevOps junior");
        eM.persist(dev);
        eM.flush();
        eM.getTransaction().commit();
        eM.close();
        System.out.println(dev);

      }
    }

  }
}

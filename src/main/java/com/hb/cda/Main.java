package com.hb.cda;

import com.hb.cda.controller.EngineController;
import com.hb.cda.model.Dev;
import com.hb.cda.utils.JpaUtil;

import jakarta.persistence.EntityManager;

public class Main {

  static EntityManager eM;
  static EngineController engineController;

  public static void main(String[] args) {

    eM = JpaUtil.getEntityManager();
    engineController = new EngineController();
  }
}

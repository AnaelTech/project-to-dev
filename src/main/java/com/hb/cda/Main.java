package com.hb.cda;

import com.hb.cda.utils.JpaUtil;

import jakarta.persistence.EntityManager;

public class Main {

  static EntityManager eM;

  public static void main(String[] args) {

    eM = JpaUtil.getEntityManager();

  }
}

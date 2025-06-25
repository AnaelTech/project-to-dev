package com.hb.cda.utils.impl;

import com.hb.cda.utils.InputOutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputImpl implements InputOutput {

  @Override
  public void afficher(String message) {
    System.out.println(message);
  }

  @Override
  public void afficherSansRetour(String message) {
    System.out.print(message);
  }

  @Override
  public String lireString() {
    String message = null;
    try {
      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
      message = buffer.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return message;
  }

  @Override
  public Integer lireInt() {
    Integer message = null;
    try {
      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
      message = Integer.parseInt(buffer.readLine());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return message;
  }
}

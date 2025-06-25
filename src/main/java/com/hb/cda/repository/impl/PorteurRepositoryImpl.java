package com.hb.cda.repository.impl;

import com.hb.cda.model.PorteurDeProjet;
import com.hb.cda.repository.PorteurRepository;

public class PorteurRepositoryImpl extends GeneriqueRepositoryImpl<PorteurDeProjet, Long>
    implements PorteurRepository {

  public PorteurRepositoryImpl() {
    super(PorteurDeProjet.class);
  }

}

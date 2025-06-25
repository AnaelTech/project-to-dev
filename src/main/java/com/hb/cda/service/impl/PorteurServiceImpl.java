package com.hb.cda.service.impl;

import com.hb.cda.model.PorteurDeProjet;
import com.hb.cda.service.PorteurService;
import com.hb.cda.repository.impl.PorteurRepositoryImpl;

public class PorteurServiceImpl extends GeneriqueServiceImpl<PorteurDeProjet, Long> implements PorteurService {

  public PorteurServiceImpl() {
    super(PorteurDeProjet.class, new PorteurRepositoryImpl());
  }

}

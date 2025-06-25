package com.hb.cda.service.impl;

import com.hb.cda.model.Candidature;
import com.hb.cda.service.CandidatureService;
import com.hb.cda.repository.impl.CandidatureRepositoryImpl;

public class CandidatureServiceImpl extends GeneriqueServiceImpl<Candidature, Long> implements CandidatureService {

  public CandidatureServiceImpl() {
    super(Candidature.class, new CandidatureRepositoryImpl());
  }

}

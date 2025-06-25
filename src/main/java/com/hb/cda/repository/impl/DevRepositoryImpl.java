package com.hb.cda.repository.impl;

import com.hb.cda.model.Dev;
import com.hb.cda.repository.DevRepository;

public class DevRepositoryImpl extends GeneriqueRepositoryImpl<Dev, Long> implements DevRepository {

  public DevRepositoryImpl() {
    super(Dev.class);
  }

}

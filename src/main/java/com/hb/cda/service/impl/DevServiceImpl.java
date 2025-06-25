package com.hb.cda.service.impl;

import com.hb.cda.model.Dev;
import com.hb.cda.repository.impl.DevRepositoryImpl;
import com.hb.cda.service.DevService;

public class DevServiceImpl extends GeneriqueServiceImpl<Dev, Long> implements DevService {

  public DevServiceImpl() {
    super(Dev.class, new DevRepositoryImpl());
  }

}

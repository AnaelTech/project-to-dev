package com.hb.cda.service.impl;

import com.hb.cda.model.Project;
import com.hb.cda.service.ProjectService;
import com.hb.cda.repository.impl.ProjectRepositoryImpl;

public class ProjectServiceImpl extends GeneriqueServiceImpl<Project, Long> implements ProjectService {

  public ProjectServiceImpl() {
    super(Project.class, new ProjectRepositoryImpl());
  }
}

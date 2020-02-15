package io.jovi.swalot.service.impl;

import io.jovi.ditto.core.domain.repository.BaseRepository;
import io.jovi.ditto.core.service.impl.BaseServiceImpl;
import io.jovi.swalot.entity.ProjectDO;
import io.jovi.swalot.repository.ProjectRepository;
import io.jovi.swalot.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Title:
 * </p >
 * <p>
 * Description:
 * </p >
 * <p>
 * Copyright: Copyright (c) 2019
 * All rights reserved. 2020-02-15.
 * </p >
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@Service
public class ProjectServiceImpl extends BaseServiceImpl<ProjectDO> implements ProjectService {
    @Autowired
    private ProjectRepository repository;
    @Override
    public BaseRepository getJpaRepository() {
        return repository;
    }
}

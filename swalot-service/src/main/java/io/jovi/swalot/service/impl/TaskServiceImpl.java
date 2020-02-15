package io.jovi.swalot.service.impl;

import io.jovi.ditto.core.domain.repository.BaseRepository;
import io.jovi.ditto.core.service.impl.BaseServiceImpl;
import io.jovi.swalot.entity.TagDO;
import io.jovi.swalot.entity.TaskDO;
import io.jovi.swalot.repository.TagRepository;
import io.jovi.swalot.repository.TaskRepository;
import io.jovi.swalot.service.TagService;
import io.jovi.swalot.service.TaskService;
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
public class TaskServiceImpl extends BaseServiceImpl<TaskDO> implements TaskService {
    @Autowired
    private TaskRepository repository;
    @Override
    public BaseRepository getJpaRepository() {
        return repository;
    }
}

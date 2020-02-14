package io.jovi.swalot.entity;

import io.jovi.ditto.core.domain.entity.AbstractVersionDO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * <p>
 * Title:
 * </p >
 * <p>
 * Description:
 * </p >
 * <p>
 * Copyright: Copyright (c) 2019
 * All rights reserved. 2020-02-14.
 * </p >
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "swalot_task")
public class TaskDO extends AbstractVersionDO {
    /**
     * 任务名称
     */
    @Column(name = "name")
    private String name;
    /**
     * 任务状态
     */
    @Column(name = "status")
    private Integer status;
    /**
     * 任务类型
     */
    @Column(name = "type")
    private Integer type;
    /**
     * 标签ID
     */
    @Column(name = "tag_id")
    private Long tagId;
    /**
     * 项目ID
     */
    @Column(name = "project_id")
    private Long projectId;

}

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
 * Title: 项目
 * </p >
 * <p>
 * Description: 项目，用于整理所有的子项目
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
@Table(name = "swalot_project")
public class ProjectDO  extends AbstractVersionDO {
    /**
     * 项目名称
     */
    @Column(name = "name")
    private String name;
    /**
     * 项目介绍
     */
    @Column(name = "intro")
    private String intro;
}

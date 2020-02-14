package io.jovi.swalot.entity;

import io.jovi.ditto.core.domain.entity.AbstractVersionDO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * <p>
 * Title: 标签
 * </p >
 * <p>
 * Description: 标签名称，
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
@Table(name = "swalot_tag")
public class TagDO extends AbstractVersionDO {
    /**
     * 标签名称
     */
    private String name;
}

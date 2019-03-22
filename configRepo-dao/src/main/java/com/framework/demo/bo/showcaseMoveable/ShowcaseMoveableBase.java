/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.showcaseMoveable;


import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `showcase_moveable`
 */
public abstract class ShowcaseMoveableBase extends FieldAccessVo {
    /**
     * This field corresponds to the database column `showcase_moveable`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `showcase_moveable`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `showcase_moveable`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `showcase_moveable`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `showcase_moveable`.name
     */
    private static final String PROPERTY_REMARK_NAME = "";

    /**
     * This field corresponds to the database column `showcase_moveable`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `showcase_moveable`.weight
     */
    private static final String PROPERTY_WEIGHT = "weight";

    /**
     * This field corresponds to the database column `showcase_moveable`.weight
     */
    private static final String PROPERTY_REMARK_WEIGHT = "";

    /**
     * This field corresponds to the database column `showcase_moveable`.weight
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WEIGHT)
    private Integer weight;

    /**
     * This field corresponds to the database column `showcase_moveable`.is_show
     */
    private static final String PROPERTY_ISSHOW = "isShow";

    /**
     * This field corresponds to the database column `showcase_moveable`.is_show
     */
    private static final String PROPERTY_REMARK_ISSHOW = "";

    /**
     * This field corresponds to the database column `showcase_moveable`.is_show
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISSHOW)
    private Boolean isShow;

    /**
     * This method returns the value of the database column `showcase_moveable`.id
     *
     * @return the value of `showcase_moveable`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `showcase_moveable`.id
     *
     * @param id the value for `showcase_moveable`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `showcase_moveable`.name
     *
     * @return the value of `showcase_moveable`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `showcase_moveable`.name
     *
     * @param name the value for `showcase_moveable`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `showcase_moveable`.weight
     *
     * @return the value of `showcase_moveable`.weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * This method sets the value of the database column `showcase_moveable`.weight
     *
     * @param weight the value for `showcase_moveable`.weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * This method returns the value of the database column `showcase_moveable`.is_show
     *
     * @return the value of `showcase_moveable`.is_show
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method sets the value of the database column `showcase_moveable`.is_show
     *
     * @param isShow the value for `showcase_moveable`.is_show
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }
}
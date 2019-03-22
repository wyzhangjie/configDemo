/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.showcaseSample;

import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

import java.util.Date;

/**
 * This class corresponds to the database table `showcase_sample`
 */
public abstract class ShowcaseSampleBase extends FieldAccessVo{
    /**
     * This field corresponds to the database column `showcase_sample`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `showcase_sample`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `showcase_sample`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `showcase_sample`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `showcase_sample`.name
     */
    private static final String PROPERTY_REMARK_NAME = "";

    /**
     * This field corresponds to the database column `showcase_sample`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `showcase_sample`.age
     */
    private static final String PROPERTY_AGE = "age";

    /**
     * This field corresponds to the database column `showcase_sample`.age
     */
    private static final String PROPERTY_REMARK_AGE = "";

    /**
     * This field corresponds to the database column `showcase_sample`.age
     */
    @ColumnDescription(desc = PROPERTY_REMARK_AGE)
    private Short age;

    /**
     * This field corresponds to the database column `showcase_sample`.birthday
     */
    private static final String PROPERTY_BIRTHDAY = "birthday";

    /**
     * This field corresponds to the database column `showcase_sample`.birthday
     */
    private static final String PROPERTY_REMARK_BIRTHDAY = "";

    /**
     * This field corresponds to the database column `showcase_sample`.birthday
     */
    @ColumnDescription(desc = PROPERTY_REMARK_BIRTHDAY)
    private Date birthday;

    /**
     * This field corresponds to the database column `showcase_sample`.sex
     */
    private static final String PROPERTY_SEX = "sex";

    /**
     * This field corresponds to the database column `showcase_sample`.sex
     */
    private static final String PROPERTY_REMARK_SEX = "";

    /**
     * This field corresponds to the database column `showcase_sample`.sex
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SEX)
    private String sex;

    /**
     * This field corresponds to the database column `showcase_sample`.is_show
     */
    private static final String PROPERTY_ISSHOW = "isShow";

    /**
     * This field corresponds to the database column `showcase_sample`.is_show
     */
    private static final String PROPERTY_REMARK_ISSHOW = "";

    /**
     * This field corresponds to the database column `showcase_sample`.is_show
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISSHOW)
    private Boolean isShow;

    /**
     * This field corresponds to the database column `showcase_sample`.deleted
     */
    private static final String PROPERTY_DELETED = "deleted";

    /**
     * This field corresponds to the database column `showcase_sample`.deleted
     */
    private static final String PROPERTY_REMARK_DELETED = "";

    /**
     * This field corresponds to the database column `showcase_sample`.deleted
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DELETED)
    private Boolean deleted;

    /**
     * This method returns the value of the database column `showcase_sample`.id
     *
     * @return the value of `showcase_sample`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `showcase_sample`.id
     *
     * @param id the value for `showcase_sample`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `showcase_sample`.name
     *
     * @return the value of `showcase_sample`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `showcase_sample`.name
     *
     * @param name the value for `showcase_sample`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `showcase_sample`.age
     *
     * @return the value of `showcase_sample`.age
     */
    public Short getAge() {
        return age;
    }

    /**
     * This method sets the value of the database column `showcase_sample`.age
     *
     * @param age the value for `showcase_sample`.age
     */
    public void setAge(Short age) {
        this.age = age;
    }

    /**
     * This method returns the value of the database column `showcase_sample`.birthday
     *
     * @return the value of `showcase_sample`.birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method sets the value of the database column `showcase_sample`.birthday
     *
     * @param birthday the value for `showcase_sample`.birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method returns the value of the database column `showcase_sample`.sex
     *
     * @return the value of `showcase_sample`.sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method sets the value of the database column `showcase_sample`.sex
     *
     * @param sex the value for `showcase_sample`.sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method returns the value of the database column `showcase_sample`.is_show
     *
     * @return the value of `showcase_sample`.is_show
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method sets the value of the database column `showcase_sample`.is_show
     *
     * @param isShow the value for `showcase_sample`.is_show
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * This method returns the value of the database column `showcase_sample`.deleted
     *
     * @return the value of `showcase_sample`.deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method sets the value of the database column `showcase_sample`.deleted
     *
     * @param deleted the value for `showcase_sample`.deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
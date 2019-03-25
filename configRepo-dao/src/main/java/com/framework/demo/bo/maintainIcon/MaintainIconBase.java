/*
 * Copyright (C) 2018 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.maintainIcon;


import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `maintain_icon`
 */
public abstract class MaintainIconBase extends FieldAccessVo {
    /**
     * This field corresponds to the database column `maintain_icon`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `maintain_icon`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `maintain_icon`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `maintain_icon`.identity
     */
    private static final String PROPERTY_IDENTITY = "identity";

    /**
     * This field corresponds to the database column `maintain_icon`.identity
     */
    private static final String PROPERTY_REMARK_IDENTITY = "";

    /**
     * This field corresponds to the database column `maintain_icon`.identity
     */
    @ColumnDescription(desc = PROPERTY_REMARK_IDENTITY)
    private String identity;

    /**
     * This field corresponds to the database column `maintain_icon`.css_class
     */
    private static final String PROPERTY_CSSCLASS = "cssClass";

    /**
     * This field corresponds to the database column `maintain_icon`.css_class
     */
    private static final String PROPERTY_REMARK_CSSCLASS = "";

    /**
     * This field corresponds to the database column `maintain_icon`.css_class
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CSSCLASS)
    private String cssClass;

    /**
     * This field corresponds to the database column `maintain_icon`.img_src
     */
    private static final String PROPERTY_IMGSRC = "imgSrc";

    /**
     * This field corresponds to the database column `maintain_icon`.img_src
     */
    private static final String PROPERTY_REMARK_IMGSRC = "";

    /**
     * This field corresponds to the database column `maintain_icon`.img_src
     */
    @ColumnDescription(desc = PROPERTY_REMARK_IMGSRC)
    private String imgSrc;

    /**
     * This field corresponds to the database column `maintain_icon`.width
     */
    private static final String PROPERTY_WIDTH = "width";

    /**
     * This field corresponds to the database column `maintain_icon`.width
     */
    private static final String PROPERTY_REMARK_WIDTH = "";

    /**
     * This field corresponds to the database column `maintain_icon`.width
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WIDTH)
    private Short width;

    /**
     * This field corresponds to the database column `maintain_icon`.height
     */
    private static final String PROPERTY_HEIGHT = "height";

    /**
     * This field corresponds to the database column `maintain_icon`.height
     */
    private static final String PROPERTY_REMARK_HEIGHT = "";

    /**
     * This field corresponds to the database column `maintain_icon`.height
     */
    @ColumnDescription(desc = PROPERTY_REMARK_HEIGHT)
    private Short height;

    /**
     * This field corresponds to the database column `maintain_icon`.sprite_src
     */
    private static final String PROPERTY_SPRITESRC = "spriteSrc";

    /**
     * This field corresponds to the database column `maintain_icon`.sprite_src
     */
    private static final String PROPERTY_REMARK_SPRITESRC = "";

    /**
     * This field corresponds to the database column `maintain_icon`.sprite_src
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SPRITESRC)
    private String spriteSrc;

    /**
     * This field corresponds to the database column `maintain_icon`.left
     */
    private static final String PROPERTY_LEFT = "left";

    /**
     * This field corresponds to the database column `maintain_icon`.left
     */
    private static final String PROPERTY_REMARK_LEFT = "";

    /**
     * This field corresponds to the database column `maintain_icon`.left
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LEFT)
    private Short left;

    /**
     * This field corresponds to the database column `maintain_icon`.top
     */
    private static final String PROPERTY_TOP = "top";

    /**
     * This field corresponds to the database column `maintain_icon`.top
     */
    private static final String PROPERTY_REMARK_TOP = "";

    /**
     * This field corresponds to the database column `maintain_icon`.top
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TOP)
    private Short top;

    /**
     * This field corresponds to the database column `maintain_icon`.style
     */
    private static final String PROPERTY_STYLE = "style";

    /**
     * This field corresponds to the database column `maintain_icon`.style
     */
    private static final String PROPERTY_REMARK_STYLE = "";

    /**
     * This field corresponds to the database column `maintain_icon`.style
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STYLE)
    private String style;

    /**
     * This field corresponds to the database column `maintain_icon`.type
     */
    private static final String PROPERTY_TYPE = "type";

    /**
     * This field corresponds to the database column `maintain_icon`.type
     */
    private static final String PROPERTY_REMARK_TYPE = "";

    /**
     * This field corresponds to the database column `maintain_icon`.type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TYPE)
    private String type;

    /**
     * This field corresponds to the database column `maintain_icon`.description
     */
    private static final String PROPERTY_DESCRIPTION = "description";

    /**
     * This field corresponds to the database column `maintain_icon`.description
     */
    private static final String PROPERTY_REMARK_DESCRIPTION = "";

    /**
     * This field corresponds to the database column `maintain_icon`.description
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DESCRIPTION)
    private String description;

    /**
     * This method returns the value of the database column `maintain_icon`.id
     *
     * @return the value of `maintain_icon`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `maintain_icon`.id
     *
     * @param id the value for `maintain_icon`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `maintain_icon`.identity
     *
     * @return the value of `maintain_icon`.identity
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * This method sets the value of the database column `maintain_icon`.identity
     *
     * @param identity the value for `maintain_icon`.identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * This method returns the value of the database column `maintain_icon`.css_class
     *
     * @return the value of `maintain_icon`.css_class
     */
    public String getCssClass() {
        return cssClass;
    }

    /**
     * This method sets the value of the database column `maintain_icon`.css_class
     *
     * @param cssClass the value for `maintain_icon`.css_class
     */
    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    /**
     * This method returns the value of the database column `maintain_icon`.img_src
     *
     * @return the value of `maintain_icon`.img_src
     */
    public String getImgSrc() {
        return imgSrc;
    }

    /**
     * This method sets the value of the database column `maintain_icon`.img_src
     *
     * @param imgSrc the value for `maintain_icon`.img_src
     */
    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    /**
     * This method returns the value of the database column `maintain_icon`.width
     *
     * @return the value of `maintain_icon`.width
     */
    public Short getWidth() {
        return width;
    }

    /**
     * This method sets the value of the database column `maintain_icon`.width
     *
     * @param width the value for `maintain_icon`.width
     */
    public void setWidth(Short width) {
        this.width = width;
    }

    /**
     * This method returns the value of the database column `maintain_icon`.height
     *
     * @return the value of `maintain_icon`.height
     */
    public Short getHeight() {
        return height;
    }

    /**
     * This method sets the value of the database column `maintain_icon`.height
     *
     * @param height the value for `maintain_icon`.height
     */
    public void setHeight(Short height) {
        this.height = height;
    }

    /**
     * This method returns the value of the database column `maintain_icon`.sprite_src
     *
     * @return the value of `maintain_icon`.sprite_src
     */
    public String getSpriteSrc() {
        return spriteSrc;
    }

    /**
     * This method sets the value of the database column `maintain_icon`.sprite_src
     *
     * @param spriteSrc the value for `maintain_icon`.sprite_src
     */
    public void setSpriteSrc(String spriteSrc) {
        this.spriteSrc = spriteSrc;
    }

    /**
     * This method returns the value of the database column `maintain_icon`.left
     *
     * @return the value of `maintain_icon`.left
     */
    public Short getLeft() {
        return left;
    }

    /**
     * This method sets the value of the database column `maintain_icon`.left
     *
     * @param left the value for `maintain_icon`.left
     */
    public void setLeft(Short left) {
        this.left = left;
    }

    /**
     * This method returns the value of the database column `maintain_icon`.top
     *
     * @return the value of `maintain_icon`.top
     */
    public Short getTop() {
        return top;
    }

    /**
     * This method sets the value of the database column `maintain_icon`.top
     *
     * @param top the value for `maintain_icon`.top
     */
    public void setTop(Short top) {
        this.top = top;
    }

    /**
     * This method returns the value of the database column `maintain_icon`.style
     *
     * @return the value of `maintain_icon`.style
     */
    public String getStyle() {
        return style;
    }

    /**
     * This method sets the value of the database column `maintain_icon`.style
     *
     * @param style the value for `maintain_icon`.style
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * This method returns the value of the database column `maintain_icon`.type
     *
     * @return the value of `maintain_icon`.type
     */
    public String getType() {
        return type;
    }

    /**
     * This method sets the value of the database column `maintain_icon`.type
     *
     * @param type the value for `maintain_icon`.type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method returns the value of the database column `maintain_icon`.description
     *
     * @return the value of `maintain_icon`.description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method sets the value of the database column `maintain_icon`.description
     *
     * @param description the value for `maintain_icon`.description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
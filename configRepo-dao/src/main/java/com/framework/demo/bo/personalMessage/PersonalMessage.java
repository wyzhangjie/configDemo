/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.personalMessage;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * This class corresponds to the database table `personal_message`
 */
public class PersonalMessage extends PersonalMessageBase {
    public String makeSelfAsParentIds() {
        return (getParentIds() != null ? getParentIds() : "") + getId() + "/";
    }



}
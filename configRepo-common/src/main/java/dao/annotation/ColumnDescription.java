/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package dao.annotation;

import java.lang.annotation.*;


@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface ColumnDescription {
    /**
     * description string
     */
    String desc();
}

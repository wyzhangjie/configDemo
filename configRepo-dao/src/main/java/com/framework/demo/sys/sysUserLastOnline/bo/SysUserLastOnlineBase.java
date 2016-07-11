/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserLastOnline.bo;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;
import java.util.Date;

/**
 * This class corresponds to the database table `sys_user_last_online`
 */
public abstract class SysUserLastOnlineBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `sys_user_last_online`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_user_last_online`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_user_last_online`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `sys_user_last_online`.user_id
     */
    private static final String PROPERTY_USERID = "userId";

    /**
     * This field corresponds to the database column `sys_user_last_online`.user_id
     */
    private static final String PROPERTY_REMARK_USERID = "";

    /**
     * This field corresponds to the database column `sys_user_last_online`.user_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERID)
    private Long userId;

    /**
     * This field corresponds to the database column `sys_user_last_online`.username
     */
    private static final String PROPERTY_USERNAME = "username";

    /**
     * This field corresponds to the database column `sys_user_last_online`.username
     */
    private static final String PROPERTY_REMARK_USERNAME = "";

    /**
     * This field corresponds to the database column `sys_user_last_online`.username
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERNAME)
    private String username;

    /**
     * This field corresponds to the database column `sys_user_last_online`.uid
     */
    private static final String PROPERTY_UID = "uid";

    /**
     * This field corresponds to the database column `sys_user_last_online`.uid
     */
    private static final String PROPERTY_REMARK_UID = "";

    /**
     * This field corresponds to the database column `sys_user_last_online`.uid
     */
    @ColumnDescription(desc = PROPERTY_REMARK_UID)
    private String uid;

    /**
     * This field corresponds to the database column `sys_user_last_online`.host
     */
    private static final String PROPERTY_HOST = "host";

    /**
     * This field corresponds to the database column `sys_user_last_online`.host
     */
    private static final String PROPERTY_REMARK_HOST = "";

    /**
     * This field corresponds to the database column `sys_user_last_online`.host
     */
    @ColumnDescription(desc = PROPERTY_REMARK_HOST)
    private String host;

    /**
     * This field corresponds to the database column `sys_user_last_online`.user_agent
     */
    private static final String PROPERTY_USERAGENT = "userAgent";

    /**
     * This field corresponds to the database column `sys_user_last_online`.user_agent
     */
    private static final String PROPERTY_REMARK_USERAGENT = "";

    /**
     * This field corresponds to the database column `sys_user_last_online`.user_agent
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERAGENT)
    private String userAgent;

    /**
     * This field corresponds to the database column `sys_user_last_online`.system_host
     */
    private static final String PROPERTY_SYSTEMHOST = "systemHost";

    /**
     * This field corresponds to the database column `sys_user_last_online`.system_host
     */
    private static final String PROPERTY_REMARK_SYSTEMHOST = "";

    /**
     * This field corresponds to the database column `sys_user_last_online`.system_host
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SYSTEMHOST)
    private String systemHost;

    /**
     * This field corresponds to the database column `sys_user_last_online`.last_login_timestamp
     */
    private static final String PROPERTY_LASTLOGINTIMESTAMP = "lastLoginTimestamp";

    /**
     * This field corresponds to the database column `sys_user_last_online`.last_login_timestamp
     */
    private static final String PROPERTY_REMARK_LASTLOGINTIMESTAMP = "";

    /**
     * This field corresponds to the database column `sys_user_last_online`.last_login_timestamp
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LASTLOGINTIMESTAMP)
    private Date lastLoginTimestamp;

    /**
     * This field corresponds to the database column `sys_user_last_online`.last_stop_timestamp
     */
    private static final String PROPERTY_LASTSTOPTIMESTAMP = "lastStopTimestamp";

    /**
     * This field corresponds to the database column `sys_user_last_online`.last_stop_timestamp
     */
    private static final String PROPERTY_REMARK_LASTSTOPTIMESTAMP = "";

    /**
     * This field corresponds to the database column `sys_user_last_online`.last_stop_timestamp
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LASTSTOPTIMESTAMP)
    private Date lastStopTimestamp;

    /**
     * This field corresponds to the database column `sys_user_last_online`.login_count
     */
    private static final String PROPERTY_LOGINCOUNT = "loginCount";

    /**
     * This field corresponds to the database column `sys_user_last_online`.login_count
     */
    private static final String PROPERTY_REMARK_LOGINCOUNT = "";

    /**
     * This field corresponds to the database column `sys_user_last_online`.login_count
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LOGINCOUNT)
    private Long loginCount;

    /**
     * This field corresponds to the database column `sys_user_last_online`.total_online_time
     */
    private static final String PROPERTY_TOTALONLINETIME = "totalOnlineTime";

    /**
     * This field corresponds to the database column `sys_user_last_online`.total_online_time
     */
    private static final String PROPERTY_REMARK_TOTALONLINETIME = "";

    /**
     * This field corresponds to the database column `sys_user_last_online`.total_online_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TOTALONLINETIME)
    private Long totalOnlineTime;

    /**
     * This method returns the value of the database column `sys_user_last_online`.id
     *
     * @return the value of `sys_user_last_online`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_user_last_online`.id
     *
     * @param id the value for `sys_user_last_online`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_user_last_online`.user_id
     *
     * @return the value of `sys_user_last_online`.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column `sys_user_last_online`.user_id
     *
     * @param userId the value for `sys_user_last_online`.user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column `sys_user_last_online`.username
     *
     * @return the value of `sys_user_last_online`.username
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method sets the value of the database column `sys_user_last_online`.username
     *
     * @param username the value for `sys_user_last_online`.username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method returns the value of the database column `sys_user_last_online`.uid
     *
     * @return the value of `sys_user_last_online`.uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method sets the value of the database column `sys_user_last_online`.uid
     *
     * @param uid the value for `sys_user_last_online`.uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * This method returns the value of the database column `sys_user_last_online`.host
     *
     * @return the value of `sys_user_last_online`.host
     */
    public String getHost() {
        return host;
    }

    /**
     * This method sets the value of the database column `sys_user_last_online`.host
     *
     * @param host the value for `sys_user_last_online`.host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * This method returns the value of the database column `sys_user_last_online`.user_agent
     *
     * @return the value of `sys_user_last_online`.user_agent
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This method sets the value of the database column `sys_user_last_online`.user_agent
     *
     * @param userAgent the value for `sys_user_last_online`.user_agent
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * This method returns the value of the database column `sys_user_last_online`.system_host
     *
     * @return the value of `sys_user_last_online`.system_host
     */
    public String getSystemHost() {
        return systemHost;
    }

    /**
     * This method sets the value of the database column `sys_user_last_online`.system_host
     *
     * @param systemHost the value for `sys_user_last_online`.system_host
     */
    public void setSystemHost(String systemHost) {
        this.systemHost = systemHost;
    }

    /**
     * This method returns the value of the database column `sys_user_last_online`.last_login_timestamp
     *
     * @return the value of `sys_user_last_online`.last_login_timestamp
     */
    public Date getLastLoginTimestamp() {
        return lastLoginTimestamp;
    }

    /**
     * This method sets the value of the database column `sys_user_last_online`.last_login_timestamp
     *
     * @param lastLoginTimestamp the value for `sys_user_last_online`.last_login_timestamp
     */
    public void setLastLoginTimestamp(Date lastLoginTimestamp) {
        this.lastLoginTimestamp = lastLoginTimestamp;
    }

    /**
     * This method returns the value of the database column `sys_user_last_online`.last_stop_timestamp
     *
     * @return the value of `sys_user_last_online`.last_stop_timestamp
     */
    public Date getLastStopTimestamp() {
        return lastStopTimestamp;
    }

    /**
     * This method sets the value of the database column `sys_user_last_online`.last_stop_timestamp
     *
     * @param lastStopTimestamp the value for `sys_user_last_online`.last_stop_timestamp
     */
    public void setLastStopTimestamp(Date lastStopTimestamp) {
        this.lastStopTimestamp = lastStopTimestamp;
    }

    /**
     * This method returns the value of the database column `sys_user_last_online`.login_count
     *
     * @return the value of `sys_user_last_online`.login_count
     */
    public Long getLoginCount() {
        return loginCount;
    }

    /**
     * This method sets the value of the database column `sys_user_last_online`.login_count
     *
     * @param loginCount the value for `sys_user_last_online`.login_count
     */
    public void setLoginCount(Long loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * This method returns the value of the database column `sys_user_last_online`.total_online_time
     *
     * @return the value of `sys_user_last_online`.total_online_time
     */
    public Long getTotalOnlineTime() {
        return totalOnlineTime;
    }

    /**
     * This method sets the value of the database column `sys_user_last_online`.total_online_time
     *
     * @param totalOnlineTime the value for `sys_user_last_online`.total_online_time
     */
    public void setTotalOnlineTime(Long totalOnlineTime) {
        this.totalOnlineTime = totalOnlineTime;
    }
}
/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserOnline.bo;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;
import org.apache.shiro.session.mgt.OnlineSession;

import java.util.Date;

/**
 * This class corresponds to the database table `sys_user_online`
 */
public abstract class SysUserOnlineBase extends FieldAccessVo  {
    /**
     * This field corresponds to the database column `sys_user_online`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_user_online`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_user_online`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private String id;

    /**
     * This field corresponds to the database column `sys_user_online`.user_id
     */
    private static final String PROPERTY_USERID = "userId";

    /**
     * This field corresponds to the database column `sys_user_online`.user_id
     */
    private static final String PROPERTY_REMARK_USERID = "";

    /**
     * This field corresponds to the database column `sys_user_online`.user_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERID)
    private Long userId;

    /**
     * This field corresponds to the database column `sys_user_online`.username
     */
    private static final String PROPERTY_USERNAME = "username";

    /**
     * This field corresponds to the database column `sys_user_online`.username
     */
    private static final String PROPERTY_REMARK_USERNAME = "";

    /**
     * This field corresponds to the database column `sys_user_online`.username
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERNAME)
    private String username;

    /**
     * This field corresponds to the database column `sys_user_online`.host
     */
    private static final String PROPERTY_HOST = "host";

    /**
     * This field corresponds to the database column `sys_user_online`.host
     */
    private static final String PROPERTY_REMARK_HOST = "";

    /**
     * This field corresponds to the database column `sys_user_online`.host
     */
    @ColumnDescription(desc = PROPERTY_REMARK_HOST)
    private String host;

    /**
     * This field corresponds to the database column `sys_user_online`.system_host
     */
    private static final String PROPERTY_SYSTEMHOST = "systemHost";

    /**
     * This field corresponds to the database column `sys_user_online`.system_host
     */
    private static final String PROPERTY_REMARK_SYSTEMHOST = "";

    /**
     * This field corresponds to the database column `sys_user_online`.system_host
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SYSTEMHOST)
    private String systemHost;

    /**
     * This field corresponds to the database column `sys_user_online`.user_agent
     */
    private static final String PROPERTY_USERAGENT = "userAgent";

    /**
     * This field corresponds to the database column `sys_user_online`.user_agent
     */
    private static final String PROPERTY_REMARK_USERAGENT = "";

    /**
     * This field corresponds to the database column `sys_user_online`.user_agent
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERAGENT)
    private String userAgent;

    /**
     * This field corresponds to the database column `sys_user_online`.status
     */
    private static final String PROPERTY_STATUS = "status";

    /**
     * This field corresponds to the database column `sys_user_online`.status
     */
    private static final String PROPERTY_REMARK_STATUS = "";

    /**
     * This field corresponds to the database column `sys_user_online`.status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STATUS)
    private String status;

    /**
     * This field corresponds to the database column `sys_user_online`.start_timestsamp
     */
    private static final String PROPERTY_STARTTIMESTSAMP = "startTimestsamp";

    /**
     * This field corresponds to the database column `sys_user_online`.start_timestsamp
     */
    private static final String PROPERTY_REMARK_STARTTIMESTSAMP = "";

    /**
     * This field corresponds to the database column `sys_user_online`.start_timestsamp
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STARTTIMESTSAMP)
    private Date startTimestsamp;

    /**
     * This field corresponds to the database column `sys_user_online`.last_access_time
     */
    private static final String PROPERTY_LASTACCESSTIME = "lastAccessTime";

    /**
     * This field corresponds to the database column `sys_user_online`.last_access_time
     */
    private static final String PROPERTY_REMARK_LASTACCESSTIME = "";

    /**
     * This field corresponds to the database column `sys_user_online`.last_access_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LASTACCESSTIME)
    private Date lastAccessTime;

    /**
     * This field corresponds to the database column `sys_user_online`.timeout
     */
    private static final String PROPERTY_TIMEOUT = "timeout";

    /**
     * This field corresponds to the database column `sys_user_online`.timeout
     */
    private static final String PROPERTY_REMARK_TIMEOUT = "";

    /**
     * This field corresponds to the database column `sys_user_online`.timeout
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TIMEOUT)
    private Long timeout;

    /**
     * This field corresponds to the database column `sys_user_online`.session
     */
    private static final String PROPERTY_SESSION = "session";

    /**
     * This field corresponds to the database column `sys_user_online`.session
     */
    private static final String PROPERTY_REMARK_SESSION = "";

    /**
     * This field corresponds to the database column `sys_user_online`.session
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SESSION)
    private String session;

    /**
     * This method returns the value of the database column `sys_user_online`.id
     *
     * @return the value of `sys_user_online`.id
     */
    public String getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_user_online`.id
     *
     * @param id the value for `sys_user_online`.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_user_online`.user_id
     *
     * @return the value of `sys_user_online`.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column `sys_user_online`.user_id
     *
     * @param userId the value for `sys_user_online`.user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column `sys_user_online`.username
     *
     * @return the value of `sys_user_online`.username
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method sets the value of the database column `sys_user_online`.username
     *
     * @param username the value for `sys_user_online`.username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method returns the value of the database column `sys_user_online`.host
     *
     * @return the value of `sys_user_online`.host
     */
    public String getHost() {
        return host;
    }

    /**
     * This method sets the value of the database column `sys_user_online`.host
     *
     * @param host the value for `sys_user_online`.host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * This method returns the value of the database column `sys_user_online`.system_host
     *
     * @return the value of `sys_user_online`.system_host
     */
    public String getSystemHost() {
        return systemHost;
    }

    /**
     * This method sets the value of the database column `sys_user_online`.system_host
     *
     * @param systemHost the value for `sys_user_online`.system_host
     */
    public void setSystemHost(String systemHost) {
        this.systemHost = systemHost;
    }

    /**
     * This method returns the value of the database column `sys_user_online`.user_agent
     *
     * @return the value of `sys_user_online`.user_agent
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This method sets the value of the database column `sys_user_online`.user_agent
     *
     * @param userAgent the value for `sys_user_online`.user_agent
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * This method returns the value of the database column `sys_user_online`.status
     *
     * @return the value of `sys_user_online`.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column `sys_user_online`.status
     *
     * @param status the value for `sys_user_online`.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column `sys_user_online`.start_timestsamp
     *
     * @return the value of `sys_user_online`.start_timestsamp
     */
    public Date getStartTimestsamp() {
        return startTimestsamp;
    }

    /**
     * This method sets the value of the database column `sys_user_online`.start_timestsamp
     *
     * @param startTimestsamp the value for `sys_user_online`.start_timestsamp
     */
    public void setStartTimestsamp(Date startTimestsamp) {
        this.startTimestsamp = startTimestsamp;
    }

    /**
     * This method returns the value of the database column `sys_user_online`.last_access_time
     *
     * @return the value of `sys_user_online`.last_access_time
     */
    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * This method sets the value of the database column `sys_user_online`.last_access_time
     *
     * @param lastAccessTime the value for `sys_user_online`.last_access_time
     */
    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * This method returns the value of the database column `sys_user_online`.timeout
     *
     * @return the value of `sys_user_online`.timeout
     */
    public Long getTimeout() {
        return timeout;
    }

    /**
     * This method sets the value of the database column `sys_user_online`.timeout
     *
     * @param timeout the value for `sys_user_online`.timeout
     */
    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    /**
     * This method returns the value of the database column `sys_user_online`.session
     *
     * @return the value of `sys_user_online`.session
     */
    public String getSession() {
        return session;
    }

    /**
     * This method sets the value of the database column `sys_user_online`.session
     *
     * @param session the value for `sys_user_online`.session
     */
    public void setSession(String session) {
        this.session = session;
    }
}
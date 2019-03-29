package com.framework.demo.vo.user;

import com.framework.demo.dto.user.UserDto;
import com.github.fartherp.framework.database.mybatis.plugin.page.BaseVo;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/12
 */
public class UserPageVo extends BaseVo<UserDto> {
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}

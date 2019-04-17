package com.framework.demo.utils;

import com.google.common.base.Preconditions;

/**
 * Created by zhjie.zhang on 2019/4/6.
 */
public class RedisGlobalIdGenerator {

    private static final int PREFFIX_LENGTH = 5;

   /* private String getGlobalId(String preffix, String suffixKey) {
        Preconditions.checkNotNull(preffix);
        Preconditions.checkArgument(preffix.length() == PREFFIX_LENGTH);

        Long incr = redisService.incr(suffixKey);
        if (incr >= SUFFIX_MAX_LIMIT) {
            redisService.set(suffixKey, "0");
        }
        return String.format("%s%s%03x", preffix,
                DateTimeUtils.formatCurrentDate("yyMMddHHmmss"),
                incr);
    }*/

}

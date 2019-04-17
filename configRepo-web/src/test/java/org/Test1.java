package org;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hassop
 * @Description
 * @date 2016/8/15 0015
 * To change this template use File | Settings | File Templates.
 */
public class Test1 {
//完全同步
    public static void main(String[] args) throws Exception{
        RpcService rpcService = new RpcService();
        HttpService httpService = new HttpService();
        rpcService.getRpcResult();
        httpService.getHttpResult();

    }

    static class RpcService{
        Map<String,String> getRpcResult() throws Exception{
            Thread.sleep(1000 * 10);
            Map<String ,String> map = new HashMap<String,String>();
            map.put("1","结果信息");
            return map;
        }
    }
    static class HttpService{
        Map<String,String> getHttpResult() throws Exception{
            Thread.sleep(20 * 10);
            Map<String ,String> map = new HashMap<String,String>();
            map.put("1","结果信息");
            return map;
        }
    }
}

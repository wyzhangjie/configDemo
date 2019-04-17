package org;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @author hassop
 * @Description
 * @date 2016/8/15 0015
 * To change this template use File | Settings | File Templates.
 */
public class Test2 {
    final static ExecutorService executor = Executors.newFixedThreadPool(2);
    public static void main(String[] args) {
      /*  final RpcService rpcService = new RpcService();
        HttpService httpService = new HttpService();
        Future<Map<String,String>> future1;
        Future<Integer> future2;
        future1 = executor.submit(()->rpcService.getRpcResult());
        future2 = executor.submit(()->httpService.getHttpResult());
        try {
            //两个异步取其最长时间。20秒
            Map<String,String> result1= future1.get(300, TimeUnit.MICROSECONDS);
            Integer result2 = future2.get(300,TimeUnit.MICROSECONDS);
        } catch (Exception e) {
            if(future1!=null)
                future1.cancel(true);
            if(future2!=null){
                future2.cancel(true);
            }
           throw  new RuntimeException(e);
        }*/



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
        Integer getHttpResult() throws Exception{
            Thread.sleep(20 * 10);
            Map<String ,String> map = new HashMap<String,String>();
            map.put("1","结果信息");
            return 1;
        }
    }
}

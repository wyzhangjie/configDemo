package java.org;

/**
 * @author hassop
 * @Description
 * @date 2016/8/15 0015
 * To change this template use File | Settings | File Templates.
 */
public class AsyncHttpClientUtil {
    public static void main(String[] args) throws Exception {
        HttpTask task = new HttpTask();
        task.setUrl("http://www.baidu.com");
        Thread t = new Thread(task);
        t.start();
        t.join();
        System.out.println(task.getData());
    }

    public static class HttpTask implements Runnable{
        private String url;
        private String data;

        public void run() {
            System.out.println(url);
            // 模拟请求http返回的结果
            data = "http response " + url;
        }

        public String getData() {
            return data;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}

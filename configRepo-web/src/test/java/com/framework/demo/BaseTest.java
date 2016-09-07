package java.com.framework.demo;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @Title BaseTest.java
 * @Description 测试基本类, 继承便可
 * @author yangdh@qianbao.com
 * @date 2015年10月30日 上午11:39:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/conf/service/applicationContext-test.xml" })
public class BaseTest {

}

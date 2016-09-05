import com.framework.demo.cache.BaseCacheAspect;
import org.junit.Test;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

import java.beans.PropertyDescriptor;

/**
 * @author hassop
 * @Description
 * @date 2016/8/29 0029
 * To change this template use File | Settings | File Templates.
 */
public class BeanWrapperImplTest {

    @Test
    public void getBeanWrapperImpl(){
        BaseCacheAspect baseCacheAspect = new BaseCacheAspect();
        BeanWrapper beanWrapper =  PropertyAccessorFactory.forBeanPropertyAccess(baseCacheAspect);
        PropertyDescriptor[] propertyDescriptors = beanWrapper.getPropertyDescriptors();
        for(PropertyDescriptor propertyDescriptor:propertyDescriptors){
            System.out.println(propertyDescriptor.getPropertyType()+"---------"+propertyDescriptor.attributeNames()+"----------"+propertyDescriptor.getReadMethod());
        }

    }
}

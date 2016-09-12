package dbunit;

import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

import java.lang.reflect.Method;

public class DBUnitExecutionListener extends AbstractTestExecutionListener {
    

    public void beforeTestMethod(TestContext testContext) throws Exception {
        Object testInstance = testContext.getTestInstance();
        Method testMethod = testContext.getTestMethod();
        Class<?> testClass = testContext.getTestClass();
        if (testInstance instanceof BaseBusinessTestCase) {
            UseDbUnit annotation = testMethod.getAnnotation(UseDbUnit.class);
            if (annotation == null) {
                annotation = testClass.getAnnotation(UseDbUnit.class);
            }
            if (annotation != null) {
                String[] tables = annotation.tables();
                String fileType = annotation.fileType();
                ((BaseBusinessTestCase) testInstance).beforeForDBUnit(fileType, tables);
            }
        }
    }
    

    public void afterTestMethod(TestContext testContext) throws Exception {
        Object testInstance = testContext.getTestInstance();
        Method testMethod = testContext.getTestMethod();
        Class<?> testClass = testContext.getTestClass();
        if (testInstance instanceof BaseBusinessTestCase) {
            UseDbUnit annotation = testMethod.getAnnotation(UseDbUnit.class);
            if (annotation == null) {
                annotation = testClass.getAnnotation(UseDbUnit.class);
            }
            if (annotation != null) {
                String[] tables = annotation.tables();
                String fileType = annotation.fileType();
                ((BaseBusinessTestCase) testInstance).afterForDBUnit(fileType, tables);
            }
        }
    }
}

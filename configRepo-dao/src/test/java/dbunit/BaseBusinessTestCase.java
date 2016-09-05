package dbunit;

import org.dbunit.DataSourceDatabaseTester;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.jdbc.JdbcTestUtils;

import javax.sql.DataSource;

@TestExecutionListeners({ DBUnitExecutionListener.class, TransactionalTestExecutionListener.class })
public abstract class BaseBusinessTestCase extends AbstractTestNGSpringContextTests {
    
    protected DataSourceDatabaseTester dataSourceDatabaseTester;
    
    protected int countRowsInTable(String tableName) {
        return JdbcTestUtils.countRowsInTable(getSimpleJdbcTemplate(), tableName);
    }
    
    protected int deleteFromTables(String... names) {
        return JdbcTestUtils.deleteFromTables(getSimpleJdbcTemplate(), names);
    }
    
    public void beforeForDBUnit(String fileType, String[] tableNames) throws Exception {
        try {
            BaseTestCaseDelegate testCaseDelegate = createBaseTestCaseDelegate(fileType, this);
            testCaseDelegate.beforeForDBUnit(tableNames);
        } catch (Exception e) {
            logger.error(e.getStackTrace());
            e.printStackTrace();
        }
    }
    
    public void afterForDBUnit(String fileType, String[] tableNames) throws Exception {
        try {
            BaseTestCaseDelegate testCaseDelegate = createBaseTestCaseDelegate(fileType, this);
            testCaseDelegate.afterForDBUnit(tableNames);
        } catch (Exception e) {
            logger.error(e.getStackTrace());
            e.printStackTrace();
        }
    }
    
    protected abstract DataSource getDataSource();
    
    protected abstract JdbcTemplate getSimpleJdbcTemplate();
    
    public abstract String getDbunitDir();
    
    public abstract String getDbunitFile();
    
    private BaseTestCaseDelegate createBaseTestCaseDelegate(String fileType,
            BaseBusinessTestCase testCase) {
        if (fileType.equals(UseDbUnit.FileType.CSV)) {
            return new CsvBaseTestCaseDelegate(testCase);
        } else if (fileType.equals(UseDbUnit.FileType.XML)) {
            return new XmlBaseTestCaseDelegate(testCase);
        } else {
            throw new RuntimeException("DBUnit错误的文件格式，只支持csv或者xml文件");
        }
    }
}

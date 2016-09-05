/**
 * 
 */
package dbunit;

import org.dbunit.DataSourceDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.operation.DatabaseOperation;

public abstract class BaseTestCaseDelegate {
    
    protected BaseBusinessTestCase testCase;
    
    protected final DatabaseOperation setUpOperation = DatabaseOperation.REFRESH;
    
    protected final DatabaseOperation tearDownOperation = DatabaseOperation.DELETE;
    
    public void beforeForDBUnit(String[] tableNames) throws Exception {
        if (!isUseDBUnit(tableNames)) {
            return;
        }
        init(tableNames);
        testCase.dataSourceDatabaseTester = new DataSourceDatabaseTester(testCase.getDataSource());
        IDataSet dataSet = getDataSet();
        testCase.dataSourceDatabaseTester.setDataSet(dataSet);
        
        testCase.dataSourceDatabaseTester.setSetUpOperation(setUpOperation);
        testCase.dataSourceDatabaseTester.onSetup();
    }
    
    public void afterForDBUnit(String[] tableNames) throws Exception {
        if (!isUseDBUnit(tableNames)) {
            return; // 如果没有数据则什么也不做，兼容不用dbunit的情况
        }
        destory(tableNames);
        testCase.dataSourceDatabaseTester.setTearDownOperation(tearDownOperation);
        testCase.dataSourceDatabaseTester.onTearDown();
    }
    
    protected abstract IDataSet getDataSet() throws Exception;
    
    protected abstract boolean isUseDBUnit(String[] tables);
    
    protected abstract void init(String[] tableNames) throws Exception;
    
    protected abstract void destory(String[] tableNames) throws Exception;
    
}

/**
 * 
 */
package dbunit;

import com.google.common.io.Resources;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.XmlDataSet;

/**
 * 针对Xml文件格式
 */
public class XmlBaseTestCaseDelegate extends BaseTestCaseDelegate {
    
    public XmlBaseTestCaseDelegate(BaseBusinessTestCase testCase) {
        super();
        this.testCase = testCase;
    }
    
    protected IDataSet getDataSet() throws Exception {
        IDataSet dataSet = null;
        dataSet = new XmlDataSet(Resources.getResource(testCase.getDbunitFile()).openStream());
        return dataSet;
    }
    
    protected boolean isUseDBUnit(String[] tables) {
        if (testCase.getDbunitFile() != null && !"".equals(testCase.getDbunitFile().trim())) {
            return true;
        }
        return false;
    }
    
    protected void init(String[] tableNames) throws Exception {
    }
    
    protected void destory(String[] tableNames) throws Exception {
    }
}

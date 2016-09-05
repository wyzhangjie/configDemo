/**
 * 
 */
package dbunit;

import com.google.common.io.Resources;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.csv.CsvDataSet;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 针对Csv文件格式
 */
public class CsvBaseTestCaseDelegate extends BaseTestCaseDelegate {
    public static final String CSV_SUFFIX = ".csv";
    
    public CsvBaseTestCaseDelegate(BaseBusinessTestCase testCase) {
        super();
        this.testCase = testCase;
    }
    
    protected IDataSet getDataSet() throws Exception {
        IDataSet dataSet = null;
        File dir = new File(Resources.getResource(testCase.getDbunitDir()).getPath());
        dataSet = new CsvDataSet(dir);
        return dataSet;
    }
    
    /**
     * 判断是否可采用DBUnit
     * 
     * @param tableNames
     * @return
     */
    protected boolean isUseDBUnit(String[] tableNames) {
        if (tableNames == null || tableNames.length == 0) {
            return false;
        }
        String dirLocal = testCase.getDbunitDir();
        if (StringUtils.isBlank(dirLocal)) {
            return false;
        }
        String dirPath = Resources.getResource("data").getFile();
        File dir = new File(dirPath);
        if (!dir.exists()) {
            return false;
        }
        if (!dir.isDirectory()) {
            return false;
        }
        File[] files = dir.listFiles(new SuffixFilter(CSV_SUFFIX));
        if (files == null || files.length == 0) {
            return false;
        }
        return true;
    }
    
    /**
     * 文件后缀名filter
     */
    private static class SuffixFilter implements FilenameFilter {
        private String suffix;
        
        public SuffixFilter(String suffix) {
            this.suffix = suffix;
        }
        
        public boolean accept(File dir, String name) {
            // TODO Auto-generated method stub
            return name.toLowerCase().endsWith(suffix);
        }
        
    }
    
    /**
     * 重写table_ordering.txt文件，用于加载不同的csv表文件
     * 
     * @param tableNames
     */
    private void initTableOrdering(String[] tableNames) {
        String dirPath = Resources.getResource(testCase.getDbunitDir()).getFile();
        String tableOrderingPath = dirPath + "/" + CsvDataSet.TABLE_ORDERING_FILE;
        File tableOrdering = new File(tableOrderingPath);
        OutputStream os = null;
        try {
            if (!tableOrdering.exists()) {
                tableOrdering.createNewFile();
            }
            List<String> tableList = new ArrayList<String>();
            if (tableNames[0].equals(UseDbUnit.TableType.ALL_TABLES)) {
                File dir = new File(dirPath);
                File[] files = dir.listFiles(new SuffixFilter(CSV_SUFFIX));
                if (files != null && files.length > 0) {
                    for (File file : files) {
                        tableList.add(cutFileNameSuffix(file.getName(), CSV_SUFFIX));
                    }
                }
            } else {
                for (String tableName : tableNames) {
                    tableList.add(tableName);
                }
            }
            os = new FileOutputStream(tableOrdering);
            IOUtils.writeLines(tableList, IOUtils.LINE_SEPARATOR_UNIX, os, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(os);
        }
    }
    
    /**
     * 删除table_ordering文件
     */
    private void deleteTableOrdering() {
        String dirPath = Resources.getResource(testCase.getDbunitDir()).getFile();
        String tableOrderingPath = dirPath + "/" + CsvDataSet.TABLE_ORDERING_FILE;
        File tableOrdering = new File(tableOrderingPath);
        if (tableOrdering.exists()) {
            tableOrdering.delete();
        }
    }
    
    /**
     * 截取文件名
     * 
     * @param fileName
     *            文件名
     * @param suffix
     *            后缀名
     * @return
     */
    private String cutFileNameSuffix(String fileName, String suffix) {
        int endIndex = fileName.lastIndexOf(suffix);
        if (endIndex > 0) {
            fileName = fileName.substring(0, endIndex);
        }
        return fileName;
    }
    
    protected void init(String[] tableNames) throws Exception {
        this.initTableOrdering(tableNames);
    }
    
    protected void destory(String[] tableNames) throws Exception {
        this.deleteTableOrdering();
    }
    
}

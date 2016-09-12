package dbunit;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@ContextConfiguration(locations = { "classpath:/conf/service/applicationContext-test.xml" }, inheritLocations = false)
public abstract class BaseDbTestCase extends BaseBusinessTestCase {
    
    protected JdbcTemplate jdbcTemplate;
    private DataSource dataSource;
    

    protected DataSource getDataSource() {
        return dataSource;
    }
    

    protected JdbcTemplate getSimpleJdbcTemplate() {
        return jdbcTemplate;
    }
    
    @Resource(name = "dataSourceDemo")
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public String getDbunitDir() {
        return "data";
    }
    
    public String getDbunitFile() {
        return "sample_data_cust.xml";
    }
}

package dbunit;

import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UseDbUnit {
    
    String value() default "";
    
    String[] tables() default { TableType.ALL_TABLES };
    
    String fileType() default FileType.CSV;
    
    public static class TableType {
        public static final String ALL_TABLES = "-1";
    }
    
    public static class FileType {
        public static final String XML = "xml";
        public static final String CSV = "csv";
    }
}

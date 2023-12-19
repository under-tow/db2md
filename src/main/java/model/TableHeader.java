package model;

import lombok.Data;

/**
 * markdown表格的列标题信息
 */
@Data
public class TableHeader {
    private int sort;
    private String filedName;
    private String columnName;
    private String tableName;
}

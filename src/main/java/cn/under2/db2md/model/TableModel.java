package cn.under2.db2md.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TableModel {
    private String tableCat;

    private String tableSchem;

    private String tableName;

    private String tableType;

    private String remarks;

    private String typeCat;

    private String typeSchem;

    private String typeName;

    private String selfReferencingColName;

    private String refGeneration;
    private List<ColumnModel> columns = new ArrayList<>();


}

package bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ColumnModel {
    private String tableCat;
    private String tableSchem;
    private String tableName;
    private String columnName;
    private String dataType;
    private String typeName;
    private String columnSize;
    private String decimalDigits;
    private String numPrecRadix;
    private String nullable;
    private String remarks;
    private String columnDef;
    private String sqlDataType;
    private String sqlDatetimeSub;
    private String charOctetLength;
    private String ordinalPosition;
    private String isNullable;
    private String scopeCatalog;
    private String scopeSchema;
    private String scopeTable;
    private String sourceDataType;
    private String isAutoincrement;
    private String isGeneratedcolumn;
}


package bean;

import config.MdColumn;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ColumnModel {
    private String tableCat;

    private String tableSchem;

    private String tableName;

    @MdColumn(name = "columnName", index = 1)
    private String columnName;

    @MdColumn(name = "dataType", index = 2)
    private String dataType;

    @MdColumn(name = "typeName", index = 3)
    private String typeName;

    @MdColumn(name = "columnSize", index = 4)
    private String columnSize;

    private String decimalDigits;

    private String numPrecRadix;

    private String nullable;

    @MdColumn(name = "remarks", index = 7)
    private String remarks;

    @MdColumn(name = "columnDef", index = 6)
    private String columnDef;

    private String sqlDataType;

    private String sqlDatetimeSub;

    private String charOctetLength;

    private String ordinalPosition;

    @MdColumn(name = "isNullable", index = 5)
    private String isNullable;

    private String scopeCatalog;

    private String scopeSchema;

    private String scopeTable;

    private String sourceDataType;

    private String isAutoincrement;

    private String isGeneratedcolumn;
}


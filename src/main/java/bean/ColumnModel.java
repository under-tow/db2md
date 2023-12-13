package bean;

import config.MdColumn;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ColumnModel {
    @MdColumn("tableCat")
    private String tableCat;

    @MdColumn("tableSchem")
    private String tableSchem;

    @MdColumn("tableName")
    private String tableName;

    @MdColumn("columnName")
    private String columnName;

    @MdColumn("dataType")
    private String dataType;

    @MdColumn("typeName")
    private String typeName;

    @MdColumn("columnSize")
    private String columnSize;

    @MdColumn("decimalDigits")
    private String decimalDigits;

    @MdColumn("numPrecRadix")
    private String numPrecRadix;

    @MdColumn("nullable")
    private String nullable;

    @MdColumn("remarks")
    private String remarks;

    @MdColumn("columnDef")
    private String columnDef;

    @MdColumn("sqlDataType")
    private String sqlDataType;

    @MdColumn("sqlDatetimeSub")
    private String sqlDatetimeSub;

    @MdColumn("charOctetLength")
    private String charOctetLength;

    @MdColumn("ordinalPosition")
    private String ordinalPosition;

    @MdColumn("isNullable")
    private String isNullable;

    @MdColumn("scopeCatalog")
    private String scopeCatalog;

    @MdColumn("scopeSchema")
    private String scopeSchema;

    @MdColumn("scopeTable")
    private String scopeTable;

    @MdColumn("sourceDataType")
    private String sourceDataType;

    @MdColumn("isAutoincrement")
    private String isAutoincrement;

    @MdColumn("isGeneratedcolumn")
    private String isGeneratedcolumn;
}


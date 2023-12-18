package model.md;

import config.MdColumn;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ColumnModel {
    private String tableCat;

    private String tableSchem;

    private String tableName;

    @MdColumn(name = "名称", sort = 1)
    private String columnName;

    @MdColumn(name = "数据类型", sort = 3)
    private String dataType;

    private String typeName;

    @MdColumn(name = "列大小", sort = 4)
    private String columnSize;

    private String decimalDigits;

    private String numPrecRadix;

    private String nullable;

    @MdColumn(name = "备注", sort = 7)
    private String remarks;

    @MdColumn(name = "默认值", sort = 6)
    private String columnDef;

    private String sqlDataType;

    private String sqlDatetimeSub;

    private String charOctetLength;

    private String ordinalPosition;

    @MdColumn(name = "允许空值", sort = 5)
    private String isNullable;

    private String scopeCatalog;

    private String scopeSchema;

    private String scopeTable;

    private String sourceDataType;

    private String isAutoincrement;

    private String isGeneratedcolumn;
}


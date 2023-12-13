package bean;

import config.MdColumn;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TableModel {
    @MdColumn("tableCat")
    private String tableCat;

    @MdColumn("tableSchem")
    private String tableSchem;

    @MdColumn("tableName")
    private String tableName;

    @MdColumn("tableType")
    private String tableType;

    @MdColumn("remarks")
    private String remarks;

    @MdColumn("typeCat")
    private String typeCat;

    @MdColumn("typeSchem")
    private String typeSchem;

    @MdColumn("typeName")
    private String typeName;

    @MdColumn("selfReferencingColName")
    private String selfReferencingColName;

    @MdColumn("refGeneration")
    private String refGeneration;
    private List<ColumnModel> columns = new ArrayList<>() ;


}

package bean;

import config.MdColumn;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TableModel {
    private String tableCat;

    @MdColumn(name = "模式", sort = 1)
    private String tableSchem;

    @MdColumn(name = "表名", sort = 2)
    private String tableName;

    private String tableType;

    @MdColumn(name = "说明", sort = 3)
    private String remarks;

    private String typeCat;

    private String typeSchem;

    private String typeName;

    private String selfReferencingColName;

    private String refGeneration;
    private List<ColumnModel> columns = new ArrayList<>();


}

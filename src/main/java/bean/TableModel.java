package bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TableModel {
    private String tableName;
    private String schem;
    private String remarks;
    private List<ColumnModel> columns ;


    public TableModel(String tableName, String schem,String remarks) {
        this.tableName = tableName;
        this.schem = schem;
        this.remarks = remarks;
        this.columns = new ArrayList<>();
    }
}

package bean;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ColumnModel {
    private String columnName;
    private String dataType;
    private String typeName;
    private String nullable;
    private String remarks;
    private String columnSize;
    private String columnDef;
}


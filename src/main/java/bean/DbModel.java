package bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DbModel {
    private List<TableModel> tables = new ArrayList<>();

}

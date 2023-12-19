package model;

import lombok.Data;
import model.md.TableModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 表结构信息存储类
 */
@Data
public class DbModel {
    private List<TableModel> tables = new ArrayList<>();

}

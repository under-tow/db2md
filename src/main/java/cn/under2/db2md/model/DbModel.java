package cn.under2.db2md.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 表结构信息存储类
 */
@Data
public class DbModel {
    private List<TableModel> tables = new ArrayList<>();

}

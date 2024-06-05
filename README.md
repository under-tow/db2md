### db2md

数据库表结构的Markdown文档生成工具

工具地址：[https://github.com/under-tow/db2md](https://github.com/under-tow/db2md)

### 1 如何使用
1. 下载jar，并引入到项目中

2. 在你的项目中执行

   ```java
   // 数据源配置
   DbSourceConfig sourceConfig = DbSourceConfig.builder()
                   .jdbcUrl("jdbc:postgresql://ip:5432/x")
                   .password("123456")
                   .driverClassName("org.postgresql.Driver")
                   .username("postgres").build();
   // 执行生成，默认生成在项目的根目录
   MarkdownUtil.db2md(sourceConfig);
   ```

   

### 2 如何自定义

> 本项目支持自定义导出的列的属性和展示的名称，自定义`List<MdColumnItem> `即可

```
 DbSourceConfig sourceConfig = DbSourceConfig.builder()
                .jdbcUrl("jdbc:postgresql://ip:5432/x")
                .password("123456")
                .driverClassName("org.postgresql.Driver")
                .username("postgres").build();
List<MdColumnItem> colItems = List.of(
                MdColumnItem.of("TABLE_CAT", "TABLE_CAT"),
                MdColumnItem.of("TABLE_SCHEM", "TABLE_SCHEM"),
                MdColumnItem.of("TABLE_NAME", "TABLE_NAME"),
                MdColumnItem.of("COLUMN_NAME", "COLUMN_NAME"),
                MdColumnItem.of("DATA_TYPE", "DATA_TYPE"),
                MdColumnItem.of("TYPE_NAME", "TYPE_NAME")
                // ...
        );
 MarkdownUtil.db2md(sourceConfig,MdColumnConfig.DEFAULT_TABLE_CONFIG,colItems);
```



### 3 导出样例



| 模式   | 表名  | 说明    |
| ------ | ----- | ------- |
| public | demo1 | 样例表1 |
| public | demo2 | 样例表2 |

#### demo1

| 名称         | 数据类型 | 列大小     | 允许空值 | 默认值 | 备注     |
| ------------ | -------- | ---------- | -------- | ------ | -------- |
| id           | uuid     | 2147483647 | NO       |        | 主键     |
| name         | varchar  | 255        | YES      |        | 名称     |
| created_date | date     | 13         | YES      |        | 创建日期 |
| deleted      | bool     | 1          | YES      | false  | 是否删除 |

#### demo2

| 名称         | 数据类型 | 列大小     | 允许空值 | 默认值 | 备注     |
| ------------ | -------- | ---------- | -------- | ------ | -------- |
| id           | uuid     | 2147483647 | NO       |        | 主键     |
| version      | int8     | 19         | YES      |        | 版本     |
| updated_date | date     | 13         | YES      |        | 更新日期 |




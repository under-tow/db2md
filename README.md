### db2md

A tool to generate Markdown documentation for database table structures.

language
- [English](README.md)
- [简体中文](README-zh.md)

### 1 How to Use

1. Download the jar file and include it in your project.

2. Execute the following in your project:

   ```java
   // Data source configuration
   DbSourceConfig sourceConfig = DbSourceConfig.builder()
                   .jdbcUrl("jdbc:postgresql://ip:5432/x")
                   .password("123456")
                   .driverClassName("org.postgresql.Driver")
                   .username("postgres").build();
   // Execute the generation, default output is in the root directory of the project
   MarkdownUtil.db2md(sourceConfig);
   ```

### 2 How to Customize

> This project supports customizing the properties and display names of the exported columns. Simply customize `List<MdColumnItem>`.

```java
 DbSourceConfig sourceConfig = DbSourceConfig.builder()
                .jdbcUrl("jdbc:postgresql://ip:5432/x")
                .password("123456")
                .driverClassName("org.postgresql.Driver")
                .username("postgres").build();
 public static final List<MdColumnItem> DEFAULT_COLUMN_ITEMS = List.of(
            MdColumnItem.of("Name", "COLUMN_NAME"),
            MdColumnItem.of("Data Type", "TYPE_NAME"),
            MdColumnItem.of("Column Size", "COLUMN_SIZE"),
            MdColumnItem.of("Nullable", "IS_NULLABLE"),
            MdColumnItem.of("Default Value", "COLUMN_DEF"),
            MdColumnItem.of("Remarks", "REMARKS")
    );
 MarkdownUtil.db2md(sourceConfig, MdColumnConfig.DEFAULT_TABLE_CONFIG, colItems);
```

### 3 Export Example

| Schema | Table | Description |
| ------ | ----- | ----------- |
| public | demo1 | Sample Table 1 |
| public | demo2 | Sample Table 2 |

#### demo1

| Name         | Data Type | Column Size | Nullable | Default Value | Remarks     |
| ------------ | --------- | ----------- | -------- | ------------- | ----------- |
| id           | uuid      | 2147483647  | NO       |               | Primary Key |
| name         | varchar   | 255         | YES      |               | Name        |
| created_date | date      | 13          | YES      |               | Creation Date |
| deleted      | bool      | 1           | YES      | false         | Deleted Flag |

#### demo2

| Name         | Data Type | Column Size | Nullable | Default Value | Remarks     |
| ------------ | --------- | ----------- | -------- | ------------- | ----------- |
| id           | uuid      | 2147483647  | NO       |               | Primary Key |
| version      | int8      | 19          | YES      |               | Version     |
| updated_date | date      | 13          | YES      |               | Update Date |

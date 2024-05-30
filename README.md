> 最近由于工作需要生成数据库文档，直接复制非常的麻烦。同时借鉴了一个其他的文档生成工具，于是开发了这样的一个数据库markdown文档生成工具。

### db2md

数据库的markdown文档生成工具

工具地址：[https://github.com/under-tow/db2md](https://github.com/under-tow/db2md)

### 1 如何使用

1. 下载代码
2. 填写数据库信息:`src/main/resources/db.properties`
3. 执行`src/main/java/Run.java`类的`main`方法。以默认配置导出到`md/datasource.md`文件

### 2 如何自定义

> 本项目支持自定义导出的列和顺序。修改注解信息即可

- src/main/java/model/md/TableModel 表展示配置
- src/main/java/model/md/ColumnModel 表字段展示配置

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




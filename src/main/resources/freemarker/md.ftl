| 表名                  | 说明       |
| :---: | :---: |
<#list tables>
    <#items as t>
        | [${t.tableName!''}](#${t.tableName!''}) | ${t.tableSchem!''} |
    </#items>
</#list>
<#list tables><#items as t>

**表名：** <a id="${t.tableName!''}">${t.tableName!''}</a>


<#list t.columns>
| 序号 | 名称 | 数据类型 | 列大小 | 允许空值  |  默认值 |   说明 |
| :---: | :---: | :---:| :---: | :---: | :---: | :---:|
<#items as c>
|  ${c?index+1}   | ${c.columnName!''} |   ${c.typeName!''}   | ${c.columnSize!''}   | ${c.nullable!''}   | ${c.columnDef!''}  | ${c.remarks!''}   |
</#items>
</#list></#items>
</#list>


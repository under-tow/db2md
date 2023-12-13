<#--

    screw-core - 简洁好用的数据库表结构文档生成工具
    Copyright © 2020 SanLi (qinggang.zuo@gmail.com)

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

-->

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

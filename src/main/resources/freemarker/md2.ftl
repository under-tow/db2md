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
## 所有表

|<#list tiHeader><#items as o>${o.columnName!''}|</#items></#list>
|<#list tiHeader> <#items as o>---|</#items></#list>
<#list tiContent>
    <#items as tic>
|<#list tic><#items as o>${o!''}|</#items></#list>
    </#items>
</#list>

## 表结构

|<#list tdHeader><#items as o>${o.columnName!''}|</#items></#list>
|<#list tdHeader> <#items as o>---|</#items></#list>
<#list tdContent>
    <#items as tdc>
        |<#list tdc><#items as o>${o!''}|</#items></#list>
    </#items>
</#list>


<#list tdContent>
    <#items as tdc>
        |<#list tdc><#items as o>${o!''}|</#items></#list>
    </#items>
</#list>

[


]
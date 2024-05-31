| 模式 | 表名 | 说明 |
 | --- | --- | --- | 
| public | amis_test | 一键开发功能测试表 |
| public | demo |  |
| public | layer_data_1 |  |
| public | layer_data_2 |  |
| public | layer_info |  |
| public | magic_api_file |  |
| public | magic_api_file_32 |  |
| public | que_answer | 答卷表 |
| public | que_survey | 问卷表 |
| public | que_template |  |
| public | que_template_organ |  |
| public | spatial_ref_sys |  |
| public | sys_calendar |  |
| public | sys_dict | 字典表 |
| public | sys_file_record |  |
| public | sys_log_login |  |
| public | sys_log_login_history |  |
| public | sys_log_operate | 系统操作日志 |
| public | sys_log_operate_category | 操作日志分类 |
| public | sys_log_operate_history | 系统操作日志 |
| public | sys_menu |  |
| public | sys_message | 消息表 |
| public | sys_message_record |  |
| public | sys_online_page |  |
| public | sys_organ |  |
| public | sys_organ_ref |  |
| public | sys_permission |  |
| public | sys_role | 角色表 |
| public | sys_scheduled_task |  |
| public | sys_setting |  |
| public | sys_tenant |  |
| public | sys_user | 用户表 |
| public | sys_user_organ_ref | 用户与机构的关系表 |
| public | t_project | 项目 |
| public | tmp_dk |  |
| public | tmp_dkbh |  |
#### amis_test
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  |  |
| name | varchar | 2147483647 | YES |  | 名称 |
| date | date | 13 | YES |  | 日期 |
| int | int4 | 10 | YES |  | 整数 |
| bool | bool | 1 | YES |  | 布尔 |
| version | int8 | 19 | NO | 1 | 版本号 |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人ID |
| created_by_id | uuid | 2147483647 | YES |  | 创建人ID |
| updated_at | timestamp | 29 | YES |  | 更新日期 |
| created_at | timestamp | 29 | YES |  | 创建日期 |
| float | float4 | 8 | YES |  | 小数 |
| float2 | numeric | 0 | YES |  |  |
| float3 | numeric | 0 | YES |  |  |

#### demo
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| c1 | int4 | 10 | YES |  |  |
| c2 | text | 2147483647 | YES |  |  |
| c3 | text | 2147483647 | YES |  |  |
| geo | geometry | 2147483647 | YES |  | geo |

#### layer_data_1
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  |  |
| info_id | uuid | 2147483647 | YES |  |  |
| symbol | varchar | 2147483647 | YES |  |  |
| geo_type | varchar | 100 | YES |  |  |
| geo | geometry | 2147483647 | YES |  |  |
| attribute | json | 2147483647 | YES |  |  |
| version | int8 | 19 | YES | 1 |  |
| updated_by_id | uuid | 2147483647 | YES |  |  |
| created_by_id | uuid | 2147483647 | YES |  |  |
| updated_at | timestamp | 29 | YES |  |  |
| created_at | timestamp | 29 | YES |  |  |

#### layer_data_2
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  |  |
| info_id | uuid | 2147483647 | YES |  |  |
| symbol | varchar | 2147483647 | YES |  |  |
| geo_type | varchar | 100 | YES |  |  |
| geo | geometry | 2147483647 | YES |  |  |
| attribute | json | 2147483647 | YES |  |  |
| version | int8 | 19 | YES | 1 |  |
| updated_by_id | uuid | 2147483647 | YES |  |  |
| created_by_id | uuid | 2147483647 | YES |  |  |
| updated_at | timestamp | 29 | YES |  |  |
| created_at | timestamp | 29 | YES |  |  |

#### layer_info
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  |  |
| symbol | varchar | 2147483647 | YES |  | 图层编号 |
| name | varchar | 2147483647 | YES |  | 图层名称 |
| partition_no | int4 | 10 | YES |  | 分区号 |
| version | int8 | 19 | YES | 1 | 版本号 |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人ID |
| created_by_id | uuid | 2147483647 | YES |  | 创建人ID |
| updated_at | timestamp | 29 | YES |  | 更新日期 |
| created_at | timestamp | 29 | YES |  | 创建日期 |

#### magic_api_file
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| file_path | varchar | 255 | NO |  | 文件路径 |
| file_content | text | 2147483647 | YES |  | 文件描述 |

#### magic_api_file_32
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| file_path | varchar | 255 | NO |  |  |
| file_content | text | 2147483647 | YES |  |  |

#### que_answer
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| survey_id | uuid | 2147483647 | NO |  | 所属问卷id |
| answerer | varchar | 50 | YES |  | 答题人 |
| finish | bool | 1 | YES |  | 是否答完 |
| business_no | varchar | 255 | YES |  | 业务编码 |
| answer_json | text | 2147483647 | YES |  | 答卷json |
| create_time | timestamp | 29 | YES |  | 填答时间 |

#### que_survey
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| title | varchar | 500 | YES |  | 标题 |
| description | varchar | 1000 | YES |  | 描述 |
| survey_json | text | 2147483647 | YES |  | 问卷json |
| url | varchar | 255 | YES |  | url |
| created_at | timestamp | 29 | YES |  | 创建时间 |
| updated_at | timestamp | 29 | YES |  | 更新时间 |
| delete | bool | 1 | NO | false | 是否删除 |
| mode | varchar | 50 | YES | 0 | 问卷模式 0默认，1内置，2只读 |
| qu_types | _varchar | 2147483647 | YES |  | 允许的题型 |
| version | int8 | 19 | NO | 1 | 版本号 |
| created_by_id | uuid | 2147483647 | YES |  | 创建人ID |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人ID |

#### que_template
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | ID |
| title | varchar | 255 | YES |  | 模板标题 |
| description | varchar | 1000 | YES |  | 描述 |
| template_json | text | 2147483647 | YES |  | 模板json |
| type | varchar | 100 | YES |  | 类型（1私有,2公共） |
| created_by_id | uuid | 2147483647 | YES |  | 创建人id |
| created_at | timestamp | 29 | YES |  | 创建时间 |
| updated_at | timestamp | 29 | YES |  | 更新时间 |
| version | int8 | 19 | NO | 1 | 版本号 |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人ID |

#### que_template_organ
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| template_id | uuid | 2147483647 | NO |  | 模板id |
| organ_id | uuid | 2147483647 | NO |  | 机构id |

#### spatial_ref_sys
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| srid | int4 | 10 | NO |  |  |
| auth_name | varchar | 256 | YES |  |  |
| auth_srid | int4 | 10 | YES |  |  |
| srtext | varchar | 2048 | YES |  |  |
| proj4text | varchar | 2048 | YES |  |  |

#### sys_calendar
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| date | date | 13 | YES |  | 日期 |
| schedule | varchar | 2147483647 | YES |  | 日程 |

#### sys_dict
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | ID |
| code | varchar | 20 | YES |  | 字典code |
| name | varchar | 100 | YES |  | 字段名称 |
| category | varchar | 50 | YES |  | 字典分类 |
| value | varchar | 100 | YES |  | 字典值 |
| sort | int4 | 10 | YES | 0 | 排序 |
| remark | varchar | 200 | YES |  | 备注 |
| status | bool | 1 | YES | true | 状态 |
| create_time | timestamp | 29 | YES | CURRENT_TIMESTAMP | 创建时间 |

#### sys_file_record
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  |  |
| url | varchar | 512 | NO |  | 文件访问地址 |
| size | int8 | 19 | YES |  | 文件大小，单位字节 |
| filename | varchar | 256 | YES | NULL::character varying | 文件名称 |
| original_filename | varchar | 256 | YES | NULL::character varying | 原始文件名 |
| base_path | varchar | 256 | YES | NULL::character varying | 基础存储路径 |
| path | varchar | 256 | YES | NULL::character varying | 存储路径 |
| ext | varchar | 32 | YES | NULL::character varying | 文件扩展名 |
| content_type | varchar | 256 | YES | NULL::character varying | MIME类型 |
| platform | varchar | 32 | YES | NULL::character varying | 存储平台 |
| th_url | varchar | 512 | YES | NULL::character varying | 缩略图访问路径 |
| th_filename | varchar | 256 | YES | NULL::character varying | 缩略图名称 |
| th_size | int8 | 19 | YES |  | 缩略图大小，单位字节 |
| th_content_type | varchar | 32 | YES | NULL::character varying | 缩略图MIME类型 |
| object_id | varchar | 32 | YES | NULL::character varying | 文件所属对象id |
| object_type | varchar | 32 | YES | NULL::character varying | 文件所属对象类型，例如用户头像，评价图片 |
| attr | text | 2147483647 | YES |  | 附加属性 |
| create_time | timestamp | 29 | YES |  | 创建时间 |
| version | int8 | 19 | YES |  | 版本 |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人 |
| created_by_id | uuid | 2147483647 | YES |  | 创建人 |
| updated_at | timestamp | 29 | YES |  | 更新时间 |
| created_at | timestamp | 29 | YES |  | 创建时间 |
| metadata | text | 2147483647 | YES |  | 文件元数据 |
| user_metadata | text | 2147483647 | YES |  | 文件用户元数据 |
| th_metadata | text | 2147483647 | YES |  | 缩略图元数据 |
| th_user_metadata | text | 2147483647 | YES |  | 缩略图用户元数据 |
| file_acl | varchar | 32 | YES | NULL::character varying | 文件ACL |
| th_file_acl | varchar | 32 | YES | NULL::character varying | 缩略图文件ACL |
| hash_info | text | 2147483647 | YES |  | 哈希信息 |
| upload_id | varchar | 128 | YES | NULL::character varying | 上传ID，仅在手动分片上传时使用 |
| upload_status | int4 | 10 | YES |  | 上传状态，仅在手动分片上传时使用，1：初始化完成，2：上传完成 |

#### sys_log_login
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| username | varchar | 100 | YES |  | 用户名 |
| ip | varchar | 50 | YES |  | 登录ip |
| location | varchar | 100 | YES |  | 登录地点 |
| browser | varchar | 50 | YES |  | 浏览器 |
| os | varchar | 50 | YES |  | 操作系统 |
| login_status | varchar | 10 | YES |  | 登录状态（成功、失败） |
| message | varchar | 100 | YES |  | 操作信息 |
| login_time | timestamp | 29 | YES |  | 登录时间 |
| name | varchar | 50 | YES |  | 姓名 |
| login_id | uuid | 2147483647 | YES |  | 用户id |

#### sys_log_login_history
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| username | varchar | 100 | YES |  | 用户名 |
| ip | varchar | 50 | YES |  | 登录ip |
| location | varchar | 100 | YES |  | 登录地点 |
| browser | varchar | 50 | YES |  | 浏览器 |
| os | varchar | 50 | YES |  | 操作系统 |
| login_status | varchar | 10 | YES |  | 登录状态（成功、失败） |
| message | varchar | 100 | YES |  | 操作信息 |
| login_time | timestamp | 29 | YES |  | 登录时间 |
| name | varchar | 50 | YES |  | 姓名 |
| login_id | uuid | 2147483647 | YES |  | 用户id |

#### sys_log_operate
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| operator_id | uuid | 2147483647 | YES |  | 操作人id |
| operate_time | timestamp | 29 | NO |  | 时间 |
| action | varchar | 100 | NO |  | 操作 |
| context | jsonb | 2147483647 | YES |  | 上下文参数 |
| ip | varchar | 100 | YES |  | IP |
| category | varchar | 100 | NO |  | 类别 |
| target_id | varchar | 255 | YES |  | 操作的目标 Id |
| target_name | varchar | 100 | YES |  | 操作的目标名称 |
| params | jsonb | 2147483647 | YES |  | 额外参数 |
| content | varchar | 100 | YES |  | 日志内容 |
| location | varchar | 100 | YES |  | 登录地点 |

#### sys_log_operate_category
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| category | varchar | 2147483647 | YES |  | 分类 |
| sort | int4 | 10 | YES |  | 排序 |
| show | bool | 1 | YES | true | 是否展示 |

#### sys_log_operate_history
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| operator_id | uuid | 2147483647 | YES |  | 操作人id |
| operate_time | timestamp | 29 | NO |  | 时间 |
| action | varchar | 100 | NO |  | 操作 |
| context | jsonb | 2147483647 | YES |  | 上下文参数 |
| ip | varchar | 100 | YES |  | IP |
| category | varchar | 100 | NO |  | 类别 |
| target_id | varchar | 255 | YES |  | 操作的目标 Id |
| target_name | varchar | 100 | YES |  | 操作的目标名称 |
| params | jsonb | 2147483647 | YES |  | 额外参数 |
| content | varchar | 100 | YES |  | 日志内容 |
| location | varchar | 100 | YES |  | 登录地点 |

#### sys_menu
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| name | varchar | 50 | YES |  | 名称 |
| icon | varchar | 512 | YES |  | 图标 |
| path | varchar | 256 | YES |  | 路径 |
| open_mode | varchar | 2147483647 | YES |  | 打开方式 |
| sort | int4 | 10 | YES |  | 顺序 |
| version | int8 | 19 | YES |  | 版本 |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人 |
| created_by_id | uuid | 2147483647 | YES |  | 创建人 |
| updated_at | timestamp | 29 | YES |  | 更新时间 |
| created_at | timestamp | 29 | YES |  | 创建时间 |
| parent_id | varchar | 256 | YES |  | 父级id |
| route | varchar | 256 | YES |  | 路由 |
| category | varchar | 2147483647 | YES |  | 分类 |
| permission | varchar | 2147483647 | YES |  | 权限值 |
| enabled | bool | 1 | YES |  | 是否启用 |

#### sys_message
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  |  |
| subject | varchar | 2147483647 | YES |  | 主题 |
| content | text | 2147483647 | YES |  | 内容 |
| category1 | varchar | 2147483647 | YES |  | 分类1 |
| expected_push_time | timestamp | 29 | YES |  | 预计推送时间 |
| push_channel | _varchar | 2147483647 | YES |  | 推送渠道 |
| receiver_name | varchar | 2147483647 | YES |  | 接收者名称 |
| receiver_id | uuid | 2147483647 | YES |  | 接收者 |
| receiver_phone | varchar | 2147483647 | YES |  | 接收者联系方式 |
| receiver_email | varchar | 2147483647 | YES |  | 接收者邮箱 |
| push_state | bool | 1 | YES | false | 推送状态 |
| receive_state | bool | 1 | YES | false | 接受状态 |
| error_info | varchar | 2147483647 | YES |  | 异常信息 |
| version | int8 | 19 | NO | 1 | 版本号 |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人ID |
| created_by_id | uuid | 2147483647 | YES |  | 创建人ID |
| updated_at | timestamp | 29 | NO |  | 更新日期 |
| created_at | timestamp | 29 | NO |  | 创建日期 |

#### sys_message_record
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| message_id | uuid | 2147483647 | YES |  | 消息id |
| subject | varchar | 2147483647 | YES |  | 主题 |
| content | varchar | 2147483647 | YES |  | 内容 |
| category1 | varchar | 2147483647 | YES |  | 分类 |
| receiver_name | varchar | 2147483647 | YES |  | 接收者姓名 |
| receiver_contact | varchar | 2147483647 | YES |  | 接收者邮箱/手机号 |
| push_channel | varchar | 2147483647 | YES |  | 推送渠道 |
| push_time | timestamp | 29 | YES |  | 推送时间 |
| push_state | bool | 1 | YES |  | 推送状态 |
| error_info | varchar | 2147483647 | YES |  | 错误信息 |

#### sys_online_page
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| key | varchar | 50 | YES |  | 匹配符 |
| page_data | text | 2147483647 | YES |  | 页面数据 |
| version | int8 | 19 | YES |  | 版本 |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人 |
| created_by_id | uuid | 2147483647 | YES |  | 创建人 |
| updated_at | timestamp | 29 | YES |  | 更新日期 |
| created_at | timestamp | 29 | YES |  | 创建日期 |
| description | varchar | 100 | YES |  | 描述 |
| name | varchar | 50 | YES |  | 页面名称 |

#### sys_organ
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键id |
| abbr_name | varchar | 255 | YES |  | 简称 |
| name | varchar | 255 | YES |  | 机构名称 |
| code | varchar | 255 | YES |  | 管理机构代码 |
| version | int8 | 19 | NO | 1 | 版本 |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人 |
| created_by_id | uuid | 2147483647 | YES |  | 创建人 |
| updated_at | timestamp | 29 | NO |  | 更新时间 |
| created_at | timestamp | 29 | NO |  | 创建时间 |
| built_in | bool | 1 | NO | false | 是否系统内置 |

#### sys_organ_ref
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| node_id | uuid | 2147483647 | YES |  | 节点id |
| parent_id | uuid | 2147483647 | YES |  | 父级id |
| deep | int8 | 19 | YES |  | 到父级的距离 |

#### sys_permission
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| name | varchar | 100 | YES |  | 名称 |
| authority | varchar | 100 | YES |  | 权限值 |
| category1 | varchar | 100 | YES |  | 类别 1 |
| description | varchar | 1000 | YES |  | 描述 |
| sort | int4 | 10 | YES |  | 排序 |
| category2 | varchar | 100 | YES |  | 类别 2 |
| version | int8 | 19 | YES |  | 版本 |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人 |
| created_by_id | uuid | 2147483647 | YES |  | 创建人 |
| updated_at | timestamp | 29 | YES |  | 更新时间 |
| created_at | timestamp | 29 | YES |  | 创建时间 |
| show | bool | 1 | YES |  | 是否展示在角色编辑界面中 |

#### sys_role
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| name | varchar | 50 | YES |  | 名称 |
| read_only | bool | 1 | YES | false | 只读 |
| description | varchar | 1000 | YES |  | 描述 |
| permissions | _varchar | 2147483647 | YES |  | 权限列表 |
| version | int8 | 19 | NO | 1 | 版本号 |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人ID |
| created_by_id | uuid | 2147483647 | YES |  | 创建人ID |
| updated_at | timestamp | 29 | YES |  | 更新日期 |
| created_at | timestamp | 29 | YES |  | 创建日期 |
| authority | varchar | 100 | YES |  |  |
| user_total | int4 | 10 | YES | 0 | 用户数量 |
| sort | int4 | 10 | YES |  | 排序 |
| defaulted | bool | 1 | YES | false | 是否默认角色 |

#### sys_scheduled_task
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| task_name | text | 2147483647 | NO |  | 任务名称 |
| task_instance | text | 2147483647 | NO |  | 任务实例 |
| task_data | bytea | 2147483647 | YES |  | 任务数据 |
| execution_time | timestamptz | 35 | NO |  | 执行时间 |
| picked | bool | 1 | NO |  | 运行状态 |
| picked_by | text | 2147483647 | YES |  | 运行节点 |
| last_success | timestamptz | 35 | YES |  | 上一次成功 |
| last_failure | timestamptz | 35 | YES |  | 上一次失败 |
| consecutive_failures | int4 | 10 | YES |  | 连续失败次数 |
| last_heartbeat | timestamptz | 35 | YES |  | 心跳时间 |
| version | int8 | 19 | NO |  | 版本数 |

#### sys_setting
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  |  |
| version | int8 | 19 | YES |  | 版本 |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人 |
| created_by_id | uuid | 2147483647 | YES |  | 创建人 |
| updated_at | timestamp | 29 | YES |  | 更新时间 |
| created_at | timestamp | 29 | YES |  | 创建时间 |
| key | varchar | 100 | NO |  | 配置key |
| value | varchar | 1000 | NO |  | 配置值 |
| category1 | varchar | 100 | NO |  | 类别1 |
| type | varchar | 255 | NO |  | 值的类型 |
| pattern | varchar | 255 | YES |  | 值的正则格式，仅 type 为 string 类型有效 |
| min_value | varchar | 1000 | YES |  | 最小值 |
| max_value | varchar | 1000 | YES |  | 最大值 |
| description | varchar | 1000 | YES |  | 描述 |
| built_in | bool | 1 | NO | false | 是否系统内置 |

#### sys_tenant
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  |  |
| name | varchar | 50 | YES |  | 租户名 |
| key | varchar | 50 | YES |  | 唯一标识 |
| schema | varchar | 50 | YES |  | 数据库模式 |
| description | varchar | 300 | YES |  | 描述 |
| enabled | bool | 1 | YES |  | 是否启用 |
| version | int8 | 19 | NO | 1 | 版本号 |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人ID |
| created_by_id | uuid | 2147483647 | YES |  | 创建人ID |
| updated_at | timestamp | 29 | NO |  | 更新日期 |
| created_at | timestamp | 29 | NO |  | 创建日期 |

#### sys_user
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键 |
| name | varchar | 50 | YES |  | 姓名 |
| username | varchar | 100 | YES |  | 用户名 |
| password | varchar | 1000 | YES |  | 密码 |
| mobile | varchar | 100 | YES |  | 手机号 |
| email | varchar | 100 | YES |  | 邮箱 |
| version | int8 | 19 | NO | 1 | 版本号 |
| updated_by_id | uuid | 2147483647 | YES |  | 更新人ID |
| created_by_id | uuid | 2147483647 | YES |  | 创建人ID |
| updated_at | timestamp | 29 | NO |  | 更新日期 |
| created_at | timestamp | 29 | NO |  | 创建日期 |
| role_id | uuid | 2147483647 | YES |  | 角色ID |
| position | varchar | 50 | YES |  | 职务 |
| enabled | bool | 1 | YES | true | 启用 |
| last_change_password_date | timestamp | 29 | YES |  | 最近修改密码日期 |
| avatar | varchar | 1000 | YES |  | 用户头像 |
| delete | bool | 1 | NO | false | 删除标识 |

#### sys_user_organ_ref
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| user_id | uuid | 2147483647 | NO |  | 用户id |
| organ_id | uuid | 2147483647 | NO |  | 机构id |

#### t_project
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| id | uuid | 2147483647 | NO |  | 主键id |
| project_name | varchar | 100 | YES | NULL::character varying | 项目名称 |
| state | varchar | 20 | YES |  | 状态(PUBLISHED_NOT/PUBLISHED) |
| create_time | timestamp | 29 | YES | now() | 创建时间 |
| created_by_id | uuid | 2147483647 | YES |  | 创建人 |
| image_index | varchar | 100 | YES |  | 图片存储url |
| remarks | varchar | 500 | YES | NULL::character varying | 备注 |
| deleted | bool | 1 | NO | false | 是否删除 |
| context | text | 2147483647 | YES |  | 项目配置信息 |
| ip | varchar | 100 | YES |  | IP地址 |
| file_id | uuid | 2147483647 | YES |  | 预览图片id |

#### tmp_dk
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| wkt_geom | text | 2147483647 | YES |  |  |
| fid_ | int4 | 10 | YES |  |  |
| Entity | text | 2147483647 | YES |  |  |
| Layer | text | 2147483647 | YES |  |  |
| Color | int4 | 10 | YES |  |  |
| Linetype | text | 2147483647 | YES |  |  |
| Elevation | int4 | 10 | YES |  |  |
| LineWt | int4 | 10 | YES |  |  |
| RefName | text | 2147483647 | YES |  |  |
| geo | geometry | 2147483647 | YES |  |  |
| sid | bigserial | 19 | NO | nextval('tmp_dk_sid_seq'::regclass) |  |
| bh | varchar | 255 | YES |  |  |
| ydx | varchar | 255 | YES |  |  |

#### tmp_dkbh
| 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
 | --- | --- | --- | --- | --- | --- | 
| wkt_geom | text | 2147483647 | YES |  |  |
| fid_ | int4 | 10 | YES |  |  |
| Entity | text | 2147483647 | YES |  |  |
| Layer | text | 2147483647 | YES |  |  |
| Color | int4 | 10 | YES |  |  |
| Linetype | text | 2147483647 | YES |  |  |
| Elevation | int4 | 10 | YES |  |  |
| LineWt | int4 | 10 | YES |  |  |
| RefName | text | 2147483647 | YES |  |  |
| Angle | int4 | 10 | YES |  |  |
| 地块编 | text | 2147483647 | YES |  |  |
| 用地代 | text | 2147483647 | YES |  |  |
| 用地性 | text | 2147483647 | YES |  |  |
| 用地面 | int4 | 10 | YES |  |  |
| 容积率 | numeric | 0 | YES |  |  |
| 建筑面 | int4 | 10 | YES |  |  |
| 建筑密 | int4 | 10 | YES |  |  |
| 建筑高 | int4 | 10 | YES |  |  |
| 绿地率 | numeric | 0 | YES |  |  |
| 停车位 | int4 | 10 | YES |  |  |
| 备注 | text | 2147483647 | YES |  |  |
| 后退道 | text | 2147483647 | YES |  |  |
| 后退_1 | text | 2147483647 | YES |  |  |
| 后退_12 | text | 2147483647 | YES |  |  |
| 后退__13 | text | 2147483647 | YES |  |  |
| 机动车 | text | 2147483647 | YES |  |  |
| geo | geometry | 2147483647 | YES |  |  |


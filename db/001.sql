

create database master_shardingsphere default character set utf8mb4 collate utf8mb4_unicode_ci;


DROP TABLE
IF EXISTS app_collect_user;
CREATE TABLE `app_collect_user` (
  `id` char(32)  NOT NULL COMMENT 'id',
  `username` varchar(255)  DEFAULT NULL COMMENT '帐号',
  `password` varchar(255)  DEFAULT NULL COMMENT '密码',
  `nickname` varchar(50)  DEFAULT NULL COMMENT '昵称',
  `state` int(2) DEFAULT NULL COMMENT '状态',
  `crt_time` datetime DEFAULT NULL,
  `crt_user` varchar(32)  DEFAULT NULL,
  `crt_name` varchar(255)  DEFAULT NULL,
  `upd_time` datetime DEFAULT NULL,
  `upd_user` varchar(32)  DEFAULT NULL,
  `upd_name` varchar(255)  DEFAULT NULL,
  `remark` varchar(255)  DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT='app采集人员用户';

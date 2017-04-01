CREATE TABLE `sys_user` (
	`id`  int NOT NULL AUTO_INCREMENT COMMENT '用户内部ID' ,
	`name`  varchar(50) NOT NULL COMMENT '用户名称' ,
	`login_id`  varchar(50) NOT NULL COMMENT '登录ID' ,
	`login_password`  varchar(50) NOT NULL COMMENT '登录密码' ,
	`is_valid`  char(1) NOT NULL COMMENT '是否有效' ,
	`valid_from`  datetime NOT NULL COMMENT '生效开始日期' ,
	`valid_to`  datetime NULL COMMENT '生效结束日期' ,
	`email`  varchar(50) NULL COMMENT '邮箱' ,
	`mobile_phone`  varchar(50) NULL COMMENT '手机' ,
	`login_state`  varchar(20) NULL COMMENT '登录状态' ,
	`last_login_ip`  varchar(50) NULL COMMENT '最后登录IP' ,
	`last_login_time`  datetime NULL COMMENT '最后登录时间' ,
	`created_by`  int NULL COMMENT '创建人' ,
	`creation_date`  datetime NULL COMMENT '创建时间' ,
	`last_updated_by`  int NULL COMMENT '最后更新人' ,
	`last_update_date`  datetime NULL COMMENT '最后更新时间' 
);
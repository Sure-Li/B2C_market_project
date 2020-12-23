#创建库
CREATE DATABASE `b2c_market`CHARACTER SET utf8; 
#使用库
USE `b2c_market`;
#地址表
CREATE TABLE `tb_address` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(60) DEFAULT NULL,
  `address_province_code` varchar(60) DEFAULT NULL,
  `address_city_code` varchar(60) DEFAULT NULL,
  `address_regin_code` varchar(60) DEFAULT NULL,
  `address_datail` text,
  `address_post_code` varchar(30) DEFAULT NULL,
  `address_phone` varchar(30) DEFAULT NULL,
  `address_is_default` int(11) DEFAULT NULL,
  `active_flag` int(11) DEFAULT NULL,
  `create_by` varchar(30) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(30) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
#购物车表
CREATE TABLE `tb_cart` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(60) DEFAULT NULL,
  `commodity_id` varchar(60) DEFAULT NULL,
  `commodity_count` int(11) DEFAULT NULL,
  `commodity_price_sum` double DEFAULT NULL,
  `active_flag` int(11) DEFAULT NULL,
  `create_by` varchar(30) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(30) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
#商品目录表
CREATE TABLE `tb_catalogue` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` varchar(30) DEFAULT NULL,
  `catalogue_name` varchar(30) DEFAULT NULL,
  `commodity_count` int(11) DEFAULT NULL,
  `active_flag` int(11) DEFAULT NULL,
  `create_by` varchar(30) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(30) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
#商品表
CREATE TABLE `tb_commodity` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `catalogue_id` bigint(20) DEFAULT NULL,
  `commodity_name` varchar(30) DEFAULT NULL,
  `commodity_code` varchar(60) DEFAULT NULL,
  `commodity_photo` varchar(60) DEFAULT NULL,
  `commodity_price` double DEFAULT NULL,
  `commodity_stock_count` int(11) DEFAULT NULL,
  `commodity_up_down_state` int(11) DEFAULT NULL,
  `commodity_info` text,
  `active_flag` int(11) DEFAULT NULL,
  `create_by` varchar(30) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(30) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
#订单表
CREATE TABLE `tb_order` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_code` varchar(60) DEFAULT NULL,
  `user_id` varchar(60) DEFAULT NULL,
  `price_sum` double DEFAULT NULL,
  `address_id` varchar(60) DEFAULT NULL,
  `order_state` int(11) DEFAULT NULL,
  `order_pay_method` int(11) DEFAULT NULL,
  `active_flag` int(11) DEFAULT NULL,
  `create_by` varchar(30) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(30) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
#订单目录表
CREATE TABLE `tb_orderlist` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(60) DEFAULT NULL,
  `commodity_id` varchar(60) DEFAULT NULL,
  `order_count` int(11) DEFAULT NULL,
  `order_price_sum` double DEFAULT NULL,
  `active_flag` int(11) DEFAULT NULL,
  `create_by` varchar(30) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(30) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
#用户表
CREATE TABLE `tb_user` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_type` int(11) DEFAULT NULL,
  `user_name` varchar(30) DEFAULT NULL,
  `user_code` varchar(30) DEFAULT NULL,
  `user_password` varchar(120) DEFAULT NULL,
  `user_phone` varchar(30) DEFAULT NULL,
  `is_lock` int(11) DEFAULT NULL,
  `last_login_ip` varchar(30) DEFAULT NULL,
  `last_login_date` varchar(30) DEFAULT NULL,
  `active_flag` int(11) DEFAULT NULL,
  `create_by` varchar(30) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(30) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
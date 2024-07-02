-- --------------------------------------------------------
-- 主机:                           localhost
-- 服务器版本:                        8.0.12 - MySQL Community Server - GPL
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  8.2.0.4675
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 vue_db 的数据库结构
DROP DATABASE IF EXISTS `vue_db`;
CREATE DATABASE IF NOT EXISTS `vue_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `vue_db`;


-- 导出  表 vue_db.category 结构
DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `categoryId` int(11) NOT NULL AUTO_INCREMENT,
  `categoryName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`categoryId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  vue_db.category 的数据：~3 rows (大约)
DELETE FROM `category`;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` (`categoryId`, `categoryName`) VALUES
	(1, '食品'),
	(2, '饮品'),
	(3, '日用品');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;


-- 导出  表 vue_db.goods 结构
DROP TABLE IF EXISTS `goods`;
CREATE TABLE IF NOT EXISTS `goods` (
  `goodsId` int(11) NOT NULL AUTO_INCREMENT,
  `goodsName` varchar(200) DEFAULT NULL,
  `price` decimal(5,1) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `produceDate` date DEFAULT NULL,
  `picture` varchar(200) DEFAULT NULL,
  `categoryId` int(11) DEFAULT NULL,
  PRIMARY KEY (`goodsId`),
  KEY `categoryId` (`categoryId`),
  CONSTRAINT `goods_ibfk_1` FOREIGN KEY (`categoryId`) REFERENCES `category` (`categoryid`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  vue_db.goods 的数据：~18 rows (大约)
DELETE FROM `goods`;
/*!40000 ALTER TABLE `goods` DISABLE KEYS */;
INSERT INTO `goods` (`goodsId`, `goodsName`, `price`, `address`, `produceDate`, `picture`, `categoryId`) VALUES
	(12, '火腿肠', 3.5, '河南', '2020-06-02', NULL, 1),
	(13, '冰红茶', 3.0, '福建', '2018-06-02', NULL, 2),
	(14, '可乐', 2.9, '杭州', '2020-06-03', NULL, 2),
	(15, '牙膏', 30.0, '河南', '2020-06-02', NULL, 3),
	(16, '洗衣粉', 18.0, '广东', '2000-06-02', NULL, 3),
	(19, '鸡蛋', 3.5, '河南', '2020-08-01', NULL, 1),
	(20, '面包', 9.5, '河南', '2020-07-02', NULL, 1),
	(21, '绿茶', 2.0, '福建', '2017-06-02', NULL, 2),
	(22, '奶茶', 8.0, '杭州', '2019-06-03', NULL, 2),
	(23, '香皂', 4.0, '河南', '1999-06-02', NULL, 3),
	(24, '牙刷', 25.0, '广东', '2001-06-02', NULL, 3),
	(26, '辣条', 2.5, '河南', '2020-05-19', NULL, 1),
	(27, '豆腐', 3.5, '河南', '2020-06-02', NULL, 1),
	(28, '雪碧', 3.0, '福建', '2018-06-02', NULL, 2),
	(29, '橙汁', 2.9, '杭州', '2020-06-03', NULL, 2),
	(30, '镜子', 30.0, '河南', '2020-06-02', NULL, 3),
	(31, '脸盆', 18.0, '广东', '2000-06-02', NULL, 3);
/*!40000 ALTER TABLE `goods` ENABLE KEYS */;


-- 导出  表 vue_db.modules 结构
DROP TABLE IF EXISTS `modules`;
CREATE TABLE IF NOT EXISTS `modules` (
  `moduleCode` varchar(30) NOT NULL,
  `moduleType` varchar(30) DEFAULT NULL,
  `moduleText` varchar(30) DEFAULT NULL,
  `moduleUrl` varchar(200) DEFAULT NULL,
  `moduleIcon` varchar(100) DEFAULT NULL,
  `parentCode` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`moduleCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  vue_db.modules 的数据：~17 rows (大约)
DELETE FROM `modules`;
/*!40000 ALTER TABLE `modules` DISABLE KEYS */;
INSERT INTO `modules` (`moduleCode`, `moduleType`, `moduleText`, `moduleUrl`, `moduleIcon`, `parentCode`) VALUES
	('L01', 'parent', '根节点', NULL, NULL, 'root'),
	('L0101', 'parent', '人事管理', NULL, 'el-icon-user-solid', 'L01'),
	('L010101', 'child', '员工管理', '/hr/emp', NULL, 'L0101'),
	('L010102', 'child', '职位管理', '/hr/pos', NULL, 'L0101'),
	('L010103', 'child', '部门管理', '/hr/dept', NULL, 'L0101'),
	('L0102', 'parent', '采购管理', NULL, 'el-icon-s-promotion', 'L01'),
	('L010201', 'child', '采购单查询', '/purchase/query', NULL, 'L0102'),
	('L010202', 'child', '采购单创建', '/purchase/create', NULL, 'L0102'),
	('L010203', 'child', '采购单审核', '/purchase/audit', NULL, 'L0102'),
	('L010204', 'child', '供应商管理', '/purchase/vendor', NULL, 'L0102'),
	('L0103', 'parent', '销售管理', NULL, 'el-icon-s-goods', 'L01'),
	('L010301', 'child', '客户信息', '/sales/customer', NULL, 'L0103'),
	('L010302', 'child', '订单管理', '/sales/order', NULL, 'L0103'),
	('L010303', 'child', '退货管理', '/sales/return', NULL, 'L0103'),
	('L0104', 'parent', '商品管理', NULL, 'el-icon-s-grid', 'L01'),
	('L010401', 'child', '商品信息', 'GoodsMgr', NULL, 'L0104'),
	('L010402', 'child', '商品分类', '/goods/category', NULL, 'L0104');
/*!40000 ALTER TABLE `modules` ENABLE KEYS */;


-- 导出  表 vue_db.users 结构
DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `flag` int(11) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  vue_db.users 的数据：~2 rows (大约)
DELETE FROM `users`;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`userId`, `userName`, `password`, `flag`) VALUES
	(1, 'test1', 'test1', 1),
	(2, 'test2', 'test2', 1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

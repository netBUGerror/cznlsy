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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  vue_db.goods 的数据：~5 rows (大约)
DELETE FROM `goods`;
/*!40000 ALTER TABLE `goods` DISABLE KEYS */;
INSERT INTO `goods` (`goodsId`, `goodsName`, `price`, `address`, `produceDate`, `picture`, `categoryId`) VALUES
	(1, '方便面', 2.5, '河南', '2020-05-01', NULL, 1),
	(2, '火腿肠', 3.5, '河南', '2020-06-02', NULL, 1),
	(3, '冰红茶', 3.0, '福建', '2018-06-02', NULL, 2),
	(4, '可乐', 2.9, '杭州', '2020-06-03', NULL, 2),
	(8, '鸡蛋', 2.5, '洛阳', '2020-01-01', NULL, 1),
	(9, '鸡蛋', 2.5, '洛阳', '2020-01-01', NULL, 1);
/*!40000 ALTER TABLE `goods` ENABLE KEYS */;


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

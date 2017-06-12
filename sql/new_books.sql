/*
Navicat MySQL Data Transfer

Source Server         : mysql.secondbook
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : secondbooks

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-06-12 11:05:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  `introduction` varchar(300) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `saled` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('1', 'JAVA:从入门到崩溃', '李麻麻', '烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫', '66', '0');
INSERT INTO `books` VALUES ('2', 'C++:从入门到入土', '李爷爷', '烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫烫', '998', '30');

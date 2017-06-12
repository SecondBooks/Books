/*
Navicat MySQL Data Transfer

Source Server         : mysql.secondbook
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : secondbooks

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-06-12 22:59:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `account` varchar(20) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES ('asd123', '666666666');
INSERT INTO `address` VALUES ('zxc123', 'asdewqwe');
INSERT INTO `address` VALUES ('qwe123', 'ssssqqwes');

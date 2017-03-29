/*
Navicat MySQL Data Transfer

Source Server         : jiajingong
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : pim

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2017-03-29 15:33:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `file`
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fileTitle` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fileType` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fileName` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `filePath` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of file
-- ----------------------------
INSERT INTO `file` VALUES ('6', 'rrr', '745', 'image/jpeg', 'h (2).jpg', 'E:\\WorkSpace\\MyEclipseWS\\apache-tomcat-8.5.11\\webapps\\PIM\\upload');
INSERT INTO `file` VALUES ('8', 'rrr', '456', 'image/jpeg', '1.jpg', 'E:\\WorkSpace\\MyEclipseWS\\apache-tomcat-8.5.11\\webapps\\PIM\\upload');
INSERT INTO `file` VALUES ('9', 'rrr', '34', 'image/jpeg', 'IMG_1935.JPG', 'E:\\WorkSpace\\MyEclipseWS\\apache-tomcat-8.5.11\\webapps\\PIM\\upload');

-- ----------------------------
-- Table structure for `friends`
-- ----------------------------
DROP TABLE IF EXISTS `friends`;
CREATE TABLE `friends` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `friendName` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `friendPhone` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `friendEmail` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `friendPlace` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of friends
-- ----------------------------
INSERT INTO `friends` VALUES ('3', 'rrr', '大鹏', '17859533', '145@163.com', '烟台');
INSERT INTO `friends` VALUES ('7', 'rrr', '王晓峰', '1234', '123@163.com', '上海');
INSERT INTO `friends` VALUES ('8', 'rrr', '秋秋', '17862826355', 'qiuqiu@163.com', '山东临沂');
INSERT INTO `friends` VALUES ('9', 'rrr', '蕾蕾', '4445', '112@163.com', '北京');

-- ----------------------------
-- Table structure for `schedule`
-- ----------------------------
DROP TABLE IF EXISTS `schedule`;
CREATE TABLE `schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `date` date DEFAULT NULL,
  `thing` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of schedule
-- ----------------------------
INSERT INTO `schedule` VALUES ('1', 'rrr', '2017-03-03', '参加春季运动会哈哈');
INSERT INTO `schedule` VALUES ('3', 'rrr', '2017-03-16', '去旅游去北京');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `birth` date DEFAULT NULL,
  `location` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('9', 'rrr', '123', '2017-03-01', '山东烟台', 'jiajingong@163.com');
INSERT INTO `user` VALUES ('10', 'gao', '123', '2017-03-09', '烟台', '123@163.com');

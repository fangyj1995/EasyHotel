# Host: localhost  (Version: 5.5.30)
# Date: 2016-11-05 18:37:16
# Generator: MySQL-Front 5.3  (Build 5.17)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "hotel"
#

CREATE TABLE `hotel` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `hotel_name` varchar(255) DEFAULT NULL,
  `hotel_city` varchar(255) DEFAULT NULL,
  `hotel_area` varchar(255) DEFAULT NULL,
  `hotel_address` varchar(255) DEFAULT NULL,
  `hotel_starLevel` int(11) DEFAULT NULL,
  `hotel_avgRate` double DEFAULT NULL,
  `hotel_des` varchar(255) DEFAULT NULL COMMENT '酒店描述',
  `hotel_roomNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

#
# Data for table "hotel"
#

REPLACE INTO `hotel` VALUES (1,'希尔顿大酒店','南京','栖霞区','xx路2号',5,4.3,'nusb ueefhdg euyweru gvzgyqv dshgytw hdifyw ',146),(2,'四季酒店','北京','朝阳区','xx路23号',5,4.6,'bueh eduywy qoqet ytzak g',215);

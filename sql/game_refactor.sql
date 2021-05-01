/*
SQLyog Professional v12.09 (64 bit)
MySQL - 8.0.20 : Database - game_refactor
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`game_refactor` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `game_refactor`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '管理员序号',
  `username` varchar(10) DEFAULT NULL COMMENT '用户名',
  `password` varchar(10) DEFAULT NULL COMMENT '密码',
  `perms` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '权限',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='管理员';

/*Data for the table `admin` */

insert  into `admin`(`id`,`username`,`password`,`perms`) values (1,'admin','zy123456','');

/*Table structure for table `lol_force` */

DROP TABLE IF EXISTS `lol_force`;

CREATE TABLE `lol_force` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '势力编号',
  `force_name` varchar(20) DEFAULT NULL COMMENT '势力名',
  `status` tinyint DEFAULT '1' COMMENT '逻辑删除 1存在 0删除',
  `create_time` bigint DEFAULT NULL COMMENT '创建时间',
  `update_time` bigint DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='势力';

/*Data for the table `lol_force` */

insert  into `lol_force`(`id`,`force_name`,`status`,`create_time`,`update_time`) values (1,'德玛西亚',1,1619597128487,1619597128487),(2,'诺克萨斯',1,1619597128487,1619597128487),(3,'弗雷尔卓德',1,1619597128487,1619597128487),(4,'暗影岛',1,1619597128487,1619597128487),(5,'比尔吉沃特',1,1619597128487,1619597128487),(6,'祖安',1,1619597128487,1619597128487),(7,'艾欧尼亚',1,1619597128487,1619597128487),(8,'虚空',1,1619597128487,1619597128487),(9,'皮尔特沃夫',1,1619597128487,1619597128487),(10,'巨神峰',1,1619597128487,1619597128487),(11,'恕瑞玛',1,1619597128487,1619597128487),(12,'班德尔城',1,1619597128487,1619597128487),(13,'以绪塔尔',1,1619597128487,1619597128487);

/*Table structure for table `lol_hero` */

DROP TABLE IF EXISTS `lol_hero`;

CREATE TABLE `lol_hero` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '英雄编号',
  `designation` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '英雄称号',
  `hero_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '英雄名',
  `gender` tinyint NOT NULL COMMENT '性别,0男1女',
  `force_id` bigint NOT NULL COMMENT '势力编号',
  `profession_one` bigint NOT NULL COMMENT '职业（主）',
  `profession_two` bigint NOT NULL COMMENT '职业（次）',
  `route_one` bigint NOT NULL COMMENT '推荐分路一',
  `route_two` bigint NOT NULL COMMENT '推荐分路二',
  `status` tinyint NOT NULL DEFAULT '1' COMMENT '逻辑删除 1存在 0删除',
  `create_time` bigint NOT NULL COMMENT '创建时间',
  `update_time` bigint NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='英雄联盟';

/*Data for the table `lol_hero` */

insert  into `lol_hero`(`id`,`designation`,`hero_name`,`gender`,`force_id`,`profession_one`,`profession_two`,`route_one`,`route_two`,`status`,`create_time`,`update_time`) values (1,'德玛西亚之力','盖伦',0,1,5,6,1,4,1,1619597128487,1619597128487),(2,'诺克萨斯之手','德莱厄斯',0,2,6,5,1,2,1,1619597128487,1619597128487),(3,'德邦总管','赵信',0,1,6,3,2,1,1,1619597128487,1619597128487),(4,'寒冰射手','艾希',1,3,1,4,4,5,1,1619597128487,1619597128487),(5,'刀锋舞者','艾瑞利亚',1,7,6,3,1,3,1,1619597128487,1619597128487),(6,'荣耀行刑官','德莱文',0,2,1,6,4,4,1,1619597128487,1619597128487),(7,'铁铠冥魂','莫德凯撒',0,4,6,2,1,3,1,1619597128487,1619597128487),(8,'虚空行者','卡萨丁',0,8,3,2,3,3,1,1619597128487,1619597128487),(9,'虚空行者','卡萨丁',1,9,1,1,4,4,1,1619597128487,1619597128487),(10,'法外狂徒','格雷福斯',0,5,1,3,2,3,1,1619597128487,1619597128487),(11,'沙漠皇帝','阿兹尔',0,11,2,2,3,3,1,1619597128487,1619597128487),(12,'不屈之枪','潘森',0,10,6,3,3,1,1,1619597128487,1619597128487),(13,'时间刺客','艾克',0,6,3,2,3,2,1,1619597128487,1619597128487),(14,'皮城执法官','蔚',1,9,6,5,2,1,1,1619597128487,1619597128487),(15,'战争之影','赫卡里姆',0,4,6,5,2,1,1,1619597128487,1619597128487),(16,'虚空掠夺者','卡兹克',0,8,3,3,2,3,1,1619597128487,1619597128487),(17,'星界游神','巴德',0,10,4,2,5,5,1,1619597128487,1619597128487),(18,'凛冬之怒','瑟庄妮',1,3,5,6,2,1,1,1619597128487,1619597128487),(19,'天启者','卡尔玛',1,7,4,2,5,3,1,1619597128487,1619597128487),(20,'刀锋之影','泰隆',0,2,3,3,3,2,1,1619597128487,1619597128487),(21,'沙漠死神','内瑟斯',0,11,6,5,1,2,1,1619870635511,1619870635511),(22,'巨魔之王','特朗德尔',0,3,6,5,2,1,1,1619870758930,1619870758930);

/*Table structure for table `lol_profession` */

DROP TABLE IF EXISTS `lol_profession`;

CREATE TABLE `lol_profession` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '职业序号',
  `name_us` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职业名(英文)',
  `name_cn` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职业名(中文)',
  `status` tinyint NOT NULL DEFAULT '1' COMMENT '逻辑删除 1存在 0删除',
  `create_time` bigint NOT NULL COMMENT '创建时间',
  `update_time` bigint NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='英雄职业';

/*Data for the table `lol_profession` */

insert  into `lol_profession`(`id`,`name_us`,`name_cn`,`status`,`create_time`,`update_time`) values (1,'adc','射手',1,1619597128487,1619597128487),(2,'ap','法师',1,1619597128487,1619597128487),(3,'assassin','刺客',1,1619597128487,1619597128487),(4,'support','辅助',1,1619597128487,1619597128487),(5,'tank','坦克',1,1619597128487,1619597128487),(6,'warrior','战士',1,1619597128487,1619597128487);

/*Table structure for table `lol_route` */

DROP TABLE IF EXISTS `lol_route`;

CREATE TABLE `lol_route` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '分路编号',
  `route_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分路',
  `status` tinyint NOT NULL DEFAULT '1' COMMENT '逻辑删除 1存在 0删除',
  `create_time` bigint NOT NULL COMMENT '创建时间',
  `update_time` bigint NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `lol_route` */

insert  into `lol_route`(`id`,`route_name`,`status`,`create_time`,`update_time`) values (1,'上路',1,1619597128487,1619597128487),(2,'打野',1,1619597128487,1619597128487),(3,'中路',1,1619597128487,1619597128487),(4,'下路',1,1619597128487,1619597128487),(5,'辅助',1,1619597128487,1619597128487);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

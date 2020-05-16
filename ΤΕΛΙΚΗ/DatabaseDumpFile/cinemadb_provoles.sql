CREATE DATABASE  IF NOT EXISTS `cinemadb` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cinemadb`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cinemadb
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `provoles`
--

DROP TABLE IF EXISTS `provoles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `provoles` (
  `provoliID` int(11) NOT NULL AUTO_INCREMENT,
  `provoliFilm` tinytext,
  `provoliCinema` tinytext,
  `provoliStartDate` tinytext,
  `provoliEndDate` tinytext,
  `provoliNumberOfReservations` int(11) DEFAULT NULL,
  `provoliIsAvailable` tinytext,
  `ContentAdmins_contentAdminsId` int(11) NOT NULL,
  `ContentAdmins_Admins_AdminsId` int(11) DEFAULT NULL,
  `ContentAdmins_Admins_Users_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`provoliID`,`ContentAdmins_contentAdminsId`),
  KEY `fk_Provoles_ContentAdmins1_idx` (`ContentAdmins_contentAdminsId`,`ContentAdmins_Admins_AdminsId`,`ContentAdmins_Admins_Users_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2366 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provoles`
--

LOCK TABLES `provoles` WRITE;
/*!40000 ALTER TABLE `provoles` DISABLE KEYS */;
INSERT INTO `provoles` VALUES (1,'BACK TO THE FUTURE','13','14/7/2019','15/8/2019',34,'YES',0,0,0),(2,'BLADE RUNNER','16','15/7/2019','17/8/2019',37,'YES',23561,NULL,NULL),(3,'War and Peace (Voyna i mir)','345','9/9/2019','10/10/2019',14,'NO',234,NULL,NULL),(4,'The Matrix','263','2/5/2020','3/6/2020',68,'YES',234,NULL,NULL),(5,'Spawn','23','8/6/2019','14/7/2019',31,'YES',145324,NULL,NULL),(6,'Mortal Kombat','12','8/6/2019','10/10/2019',66,'NO',5263,NULL,NULL),(7,'Top Gun','133','8/6/2019','10/10/2019',45,'YES',1234,NULL,NULL),(8,'TERMINATOR 2','14','17/7/2019','22/7/2019',66,'NO',3567,NULL,NULL);
/*!40000 ALTER TABLE `provoles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-29 19:15:46

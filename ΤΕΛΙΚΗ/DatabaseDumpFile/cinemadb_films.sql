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
-- Table structure for table `films`
--

DROP TABLE IF EXISTS `films`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `films` (
  `filmId` int(11) DEFAULT NULL,
  `filmTitle` tinytext,
  `filmCategory` tinytext,
  `filmDescription` text,
  `Provoles_provoliiD` int(11) DEFAULT NULL,
  `ContentAdmins_contentAdminsId` int(11) DEFAULT NULL,
  `ContentAdmins_Admins_AdminsId` int(11) DEFAULT NULL,
  `ContentAdmins_Admins_Users_id` int(11) DEFAULT NULL,
  KEY `fk_Films_ContentAdmins1_idx` (`ContentAdmins_contentAdminsId`,`ContentAdmins_Admins_AdminsId`,`ContentAdmins_Admins_Users_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `films`
--

LOCK TABLES `films` WRITE;
/*!40000 ALTER TABLE `films` DISABLE KEYS */;
INSERT INTO `films` VALUES (1203,'Mystery on Monster Island','Adventure|Comedy','',NULL,NULL,NULL,NULL),(1450,'War and Peace (Voyna i mir)','Drama|Romance|War','',NULL,NULL,NULL,NULL),(1489,'The Matrix','Action','',NULL,NULL,NULL,NULL),(1570,'Of Love and Shadows','Drama','',NULL,NULL,NULL,NULL),(1908,'Promise of the Flesh (Yukcheui yaksok)','(no genres listed)','',NULL,NULL,NULL,NULL),(1925,'Small Time','Comedy|Drama','',NULL,NULL,NULL,NULL),(1927,'Rio Sex Comedy','Comedy|Drama','',NULL,NULL,NULL,NULL),(1994,'Burlesque','Drama|Musical|Romance','',NULL,NULL,NULL,NULL),(1999,'Diary of a Lost Girl (Tagebuch einer Verlorenen)','Drama','',NULL,NULL,NULL,NULL),(2004,'Larks on a String (Skrivánci na niti)','Comedy|Drama|Romance','',NULL,NULL,NULL,NULL),(2010,'Hellbound: Hellraiser II','Horror','',NULL,NULL,NULL,NULL),(2378,'Quatermass and the Pit','Horror|Sci-Fi','',NULL,NULL,NULL,NULL),(2532,'THE AVENGERS','ACTION','',NULL,NULL,NULL,NULL),(2534,'Mud','Adventure|Crime|Drama','',NULL,NULL,NULL,NULL),(2590,'Capone','Crime|Drama','',NULL,NULL,NULL,NULL),(2834,'Mother (Madeo)','Crime|Drama|Mystery|Thriller','',NULL,NULL,NULL,NULL),(6142,'Dynamite','Drama','',NULL,NULL,NULL,NULL),(8465,'Cobweb, The','Drama','',NULL,NULL,NULL,NULL),(9012,'Rid of Me','Comedy|Drama|Romance','',NULL,NULL,NULL,NULL),(9890,'Docking the Boat (Att angöra en brygga)','Comedy|Drama|Romance','',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `films` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-29 19:15:47

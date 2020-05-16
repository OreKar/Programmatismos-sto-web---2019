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
-- Table structure for table `history`
--

DROP TABLE IF EXISTS `history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `history` (
  `idHistory` int(11) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `film` varchar(45) DEFAULT NULL,
  `tickets` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `history`
--

LOCK TABLES `history` WRITE;
/*!40000 ALTER TABLE `history` DISABLE KEYS */;
INSERT INTO `history` VALUES (1,NULL,NULL,NULL),(2,NULL,NULL,NULL),(3,NULL,NULL,NULL),(4,NULL,NULL,NULL),(NULL,NULL,'The Matrix',3),(NULL,NULL,'War and Peace (Voyna i mir)',4),(NULL,NULL,'The Matrix',9),(NULL,NULL,'The Matrix',14),(NULL,NULL,'The Matrix',34),(NULL,NULL,'The Matrix',66),(NULL,NULL,'The Matrix',666),(NULL,'kostasp','The Matrix',34),(NULL,'kostasp','The Matrix',34),(1,'tpoinsett0','Grace Unplugged',NULL),(2,'pnoton1','Onmyoji (Onmyoji: The Yin Yang Master)',NULL),(3,'rjammet2','Ascension',NULL),(4,'scrumby3','Dust to Glory',NULL),(5,'afairall4','Station West',NULL),(6,'kgipson5','Rock-afire Explosion, The',NULL),(7,'ekilroy6','The Dancer',NULL),(8,'tjorin7','Donkey Skin (Peau d\'âne)',NULL),(9,'ghalliwell8','Yellow Cab Man, The',NULL),(10,'cwalisiak9','Lady in a Cage',NULL),(11,'slippia','Cleaner',NULL),(12,'daldrenb','Dead Within',NULL),(13,'gcarniec','Svensson, Svensson - I nöd och lust',NULL),(14,'tashurstd','Peking Opera Blues (Do ma daan)',NULL),(15,'tshawcrosse','Darling',NULL),(16,'lgermainf','Enlighten Up!',NULL),(17,'casprayg','Bloodtide',NULL),(18,'lwhitearh','Romy and Michele\'s High School Reunion',NULL),(19,'mshivelli','Antiviral',NULL),(20,'cchithamj','Shark Attack',NULL);
/*!40000 ALTER TABLE `history` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-29 19:15:48

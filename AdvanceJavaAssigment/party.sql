-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: election
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `party_tbl`
--

DROP TABLE IF EXISTS `party_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `party_tbl` (
  `partyID` int NOT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `zip` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`partyID`),
  UNIQUE KEY `id_UNIQUE` (`partyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `party_tbl`
--

LOCK TABLES `party_tbl` WRITE;
/*!40000 ALTER TABLE `party_tbl` DISABLE KEYS */;
INSERT INTO `party_tbl` VALUES (1,'Palash','w','w','Khargone','sss','sss','aaa','sss'),(2,'Palash','Kale','moti pura','Khargone','451001','mp','India','01234567891');
/*!40000 ALTER TABLE `party_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reg_tbl`
--

DROP TABLE IF EXISTS `reg_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reg_tbl` (
  `partyId` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `zip` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `userloginid` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`partyId`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reg_tbl`
--

LOCK TABLES `reg_tbl` WRITE;
/*!40000 ALTER TABLE `reg_tbl` DISABLE KEYS */;
INSERT INTO `reg_tbl` VALUES (7,'Palash','Bajaj','sss','Khargone','aaa','sss','oooo','sss','sss@gmail.com','145'),(8,'Aakash','Kale','moti pura','Khargone','mp','india','451001','1234567891','aakash@gmail.com','aakash@123'),(10,'pranay','pandit','talai marg','Khargone','mp','India','451001','01234567892','pranay@gmail.com','123456'),(11,'Aakash','Kale','moti pura','Khargone','mp','India','451001','01234567891','palashbajaj3847@gmail.com','1234'),(12,'pranay','pandit','talai marg','Khargone','mp','India','451001','01234567892','palashbajaj3847@gmail.com','123456'),(13,'pranay','pandit','talai marg','Khargone','mp','India','451001','01234567892','palashbajaj3847@gmail.com','1234'),(14,'Aakash','Kale','moti pura','Khargone','mp','India','451001','01234567891','palashbajaj3847@gmail.com','1478'),(15,'Aakash','Kale','moti pura','Khargone','mp','India','451001','01234567891','palashbajaj3847@gmail.com','789456'),(16,'Aakash','Kale','moti pura','Khargone','mp','India','451001','01234567891','palashbajaj3847@gmail.com','745'),(17,'Aakash','Kale','moti pura','Khargone','mp','India','451001','01234567891','palashbajaj3847@gmail.com','852'),(18,'Aakash','Kale','moti pura','Khargone','mp','India','451001','01234567891','palashbajaj3847@gmail.com','8745'),(19,'pranay','pandit','talai marg','Khargone','mp','India','451001','01234567892','palashbajaj3847@gmail.com','789456');
/*!40000 ALTER TABLE `reg_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_login_tbl`
--

DROP TABLE IF EXISTS `user_login_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_login_tbl` (
  `sno` int NOT NULL AUTO_INCREMENT,
  `user_id` varchar(45) DEFAULT NULL,
  `user_pass` varchar(45) DEFAULT NULL,
  `partyID` int DEFAULT NULL,
  PRIMARY KEY (`sno`),
  KEY `partyID_idx` (`partyID`),
  CONSTRAINT `partyID` FOREIGN KEY (`partyID`) REFERENCES `party_tbl` (`partyID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_login_tbl`
--

LOCK TABLES `user_login_tbl` WRITE;
/*!40000 ALTER TABLE `user_login_tbl` DISABLE KEYS */;
INSERT INTO `user_login_tbl` VALUES (1,'palashbajaj3847@gmail.com','789456',2);
/*!40000 ALTER TABLE `user_login_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-26 17:11:53

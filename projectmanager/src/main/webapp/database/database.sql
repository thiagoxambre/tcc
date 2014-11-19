CREATE DATABASE  IF NOT EXISTS `projectmanager` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `projectmanager`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: projectmanager
-- ------------------------------------------------------
-- Server version	5.6.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `fornecedor_requisitos`
--

DROP TABLE IF EXISTS `fornecedor_requisitos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fornecedor_requisitos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PROJETO_ID` int(11) DEFAULT NULL,
  `NOME` varchar(100) DEFAULT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  `TELEFONE` varchar(45) DEFAULT NULL,
  `OBSERVACAO` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_FORNECEDOR_REQUISITO_PROJETO_idx` (`PROJETO_ID`),
  CONSTRAINT `FK_FORNECEDOR_REQUISITO_PROJETO` FOREIGN KEY (`PROJETO_ID`) REFERENCES `projeto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `projeto`
--

DROP TABLE IF EXISTS `projeto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `projeto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `visaogeral` varchar(1000) DEFAULT NULL,
  `problema` varchar(1000) DEFAULT NULL,
  `afeta` varchar(1000) DEFAULT NULL,
  `impacto` varchar(1000) DEFAULT NULL,
  `solucao` varchar(1000) DEFAULT NULL,
  `manualusuario` bit(1) DEFAULT NULL,
  `ajudaonline` bit(1) DEFAULT NULL,
  `guiainstalacao` bit(1) DEFAULT NULL,
  `outrodocumentacao` bit(1) DEFAULT NULL,
  `textooutro` varchar(100) DEFAULT NULL,
  `setoresenvolvidos` varchar(1000) DEFAULT NULL,
  `nomeresponsavel` varchar(100) DEFAULT NULL,
  `emailresponsavel` varchar(100) DEFAULT NULL,
  `telefoneresponsavel` varchar(45) DEFAULT NULL,
  `observacaoresponsavel` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `recurso`
--

DROP TABLE IF EXISTS `recurso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recurso` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PROJETO_ID` int(11) DEFAULT NULL,
  `NOME` varchar(100) DEFAULT NULL,
  `DESCRICAO` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_RECURSO_PROJETO_idx` (`PROJETO_ID`),
  CONSTRAINT `FK_RECURSO_PROJETO` FOREIGN KEY (`PROJETO_ID`) REFERENCES `projeto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `resumo_usuarios`
--

DROP TABLE IF EXISTS `resumo_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resumo_usuarios` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PROJETO_ID` int(11) DEFAULT NULL,
  `NOME` varchar(100) DEFAULT NULL,
  `DESCRICAO` varchar(1000) DEFAULT NULL,
  `RESPONSABILIDADES` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_RESUMO_USUARIOS_PROJETO_idx` (`PROJETO_ID`),
  CONSTRAINT `FK_RESUMO_USUARIOS_PROJETO` FOREIGN KEY (`PROJETO_ID`) REFERENCES `projeto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `risco`
--

DROP TABLE IF EXISTS `risco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `risco` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PROJETO_ID` int(11) DEFAULT NULL,
  `NOME` varchar(100) DEFAULT NULL,
  `DESCRICAO` varchar(1000) DEFAULT NULL,
  `TIPO_RISCO` varchar(45) DEFAULT NULL,
  `CATEGORIA_RISCO` varchar(45) DEFAULT NULL,
  `PLANO_CONTINGENCIA` varchar(1000) DEFAULT NULL,
  `PROBABILIDADE` double DEFAULT NULL,
  `IMPACTO` double DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_RISCO_PROJETO_idx` (`PROJETO_ID`),
  CONSTRAINT `FK_RISCO_PROJETO` FOREIGN KEY (`PROJETO_ID`) REFERENCES `projeto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-11-19 17:28:19

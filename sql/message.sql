CREATE DATABASE  IF NOT EXISTS `message_bdd`;
USE `message_bdd`;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL,
  `signature` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `message`
--

INSERT INTO `message` VALUES 
	(1,'salut à tous','Vous êtes en train de lire mon premier message','obiwan@ecole.fr'),
	(2,'bonjour','merci de m'' accuellir sur ce chat','emma@ecole.com'),
	(3,'programme','aujourd'' hui on va coder une api avec spring boot','premierdeleclasse@ecole.com'),
	(4,'absence imprévue','désolé, je ne pourrai pas suivre la leçon aujourd'' hui. Je rattraperai très vite','bran@ecole.com'),
	(5,'Diego','de toute façon je te donnerai mes support de cours ','diego@outlook.com');
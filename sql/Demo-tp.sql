CREATE DATABASE IF NOT EXISTS `bdd_demo_projet`;
USE `bdd_demo_projet`;
--
-- Table structure for table `voiture`
--
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `nom` varchar(45) DEFAULT NULL,
 `prenom` varchar(45) DEFAULT NULL, 
  `email` varchar(45) DEFAULT NULL, 
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `users` VALUES 
(1,'Nassim', 'Zoubeir','NassimZoubeir@gmail.com'),
(2,'Steve', 'vahala','SteveVahala@gmail.com'),
(3,'khaled', 'Bensaim','KhaledBensaim@gmail.com')


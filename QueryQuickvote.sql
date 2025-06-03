create database QuickVote;

use QuickVote;
 
Create Table Eleitor (
numeroEleitor int (02) AUTO_INCREMENT PRIMARY KEY, 
numeroSessao Int (02) not null, 
nomeEleitor varchar (50) not null
);
 
Create Table Candidato (
nomeCandidato int (02) not null,
  

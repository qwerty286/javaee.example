Java EE web page
 
Simple java ee web page with jpa and jsf
using mysql client

for adding table:
 
CREATE DATABASE IF NOT EXISTS "javaee" DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;

USE `javaee`;

CREATE TABLE `linki` (

   `id` int(11) NOT NULL,
   
   `link` text NOT NULL,
   
   `autor` text NOT NULL,
   
   `tekst` text NOT NULL
   
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

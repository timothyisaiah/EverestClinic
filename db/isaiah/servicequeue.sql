CREATE TABLE `userauth`.`servicequeue` ( `servicequeueid` INT NOT NULL AUTO_INCREMENT PRIMARY KEY, `addedby` INT NULL , `serviced` BOOLEAN NULL , `servicedby` INT NULL , `timein` TIMESTAMP NULL , `timeout` TIMESTAMP NULL , `serviceid` INT NULL , `patientvisitid` BIGINT NULL , `canceled` INT NULL , `canceledby` INT NULL , `timecanceled` TIMESTAMP NULL , `ispopped` BOOLEAN NULL , `timepopped` TIMESTAMP NULL , `poppedby` INT NULL ) ENGINE = InnoDB;
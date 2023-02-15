-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema hotel_alura
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema hotel_alura
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hotel_alura` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `hotel_alura` ;

-- -----------------------------------------------------
-- Table `hotel_alura`.`reservas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hotel_alura`.`reservas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `fecha_entrada` DATE NULL DEFAULT NULL,
  `fecha_salida` DATE NULL DEFAULT NULL,
  `valor` VARCHAR(45) NULL DEFAULT NULL,
  `forma_pago` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 12
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `hotel_alura`.`huespedes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hotel_alura`.`huespedes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  `apellido` VARCHAR(50) NOT NULL,
  `nacionalidad` VARCHAR(50) NOT NULL,
  `telefono` VARCHAR(50) NOT NULL,
  `fechaNacimiento` DATE NOT NULL,
  `idReservas` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `idReservas` (`idReservas` ASC) VISIBLE,
  CONSTRAINT `huespedes_ibfk_1`
    FOREIGN KEY (`idReservas`)
    REFERENCES `hotel_alura`.`reservas` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

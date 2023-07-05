-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema SIS_Biblioteca
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema SIS_Biblioteca
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SIS_Biblioteca` DEFAULT CHARACTER SET utf8 ;
USE `SIS_Biblioteca` ;

-- -----------------------------------------------------
-- Table `SIS_Biblioteca`.`Categoria_Us`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIS_Biblioteca`.`Categoria_Us` (
  `Id_Categoria` INT NOT NULL AUTO_INCREMENT,
  `Nombre_Categoria` VARCHAR(45) NOT NULL,
  `Des_Categoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Id_Categoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIS_Biblioteca`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIS_Biblioteca`.`Usuario` (
  `Id_Usuario` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `Categoria` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `Categoria_Us_Id_Categoria` INT NOT NULL,
  PRIMARY KEY (`Id_Usuario`),
  CONSTRAINT `fk_Usuario_Categoria_Us1`
    FOREIGN KEY (`Categoria_Us_Id_Categoria`)
    REFERENCES `SIS_Biblioteca`.`Categoria_Us` (`Id_Categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIS_Biblioteca`.`Generos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIS_Biblioteca`.`Generos` (
  `Id_Generos` INT NOT NULL AUTO_INCREMENT,
  `Nombre_Gen` VARCHAR(45) NOT NULL,
  `Des_Gen` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Id_Generos`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIS_Biblioteca`.`Libro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIS_Biblioteca`.`Libro` (
  `Id_Libro` INT NOT NULL AUTO_INCREMENT,
  `Titulo` VARCHAR(45) NOT NULL,
  `Autor` VARCHAR(45) NOT NULL,
  `Genero` VARCHAR(45) NOT NULL,
  `Num_Copias` VARCHAR(45) NOT NULL,
  `Generos_Id_Generos` INT NOT NULL,
  PRIMARY KEY (`Id_Libro`),
  CONSTRAINT `fk_Libro_Generos1`
    FOREIGN KEY (`Generos_Id_Generos`)
    REFERENCES `SIS_Biblioteca`.`Generos` (`Id_Generos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIS_Biblioteca`.`Estados`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIS_Biblioteca`.`Estados` (
  `Id_estados` INT NOT NULL AUTO_INCREMENT,
  `Nombre_estados` VARCHAR(45) NOT NULL,
  `Des_estados` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Id_estados`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIS_Biblioteca`.`Transaccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIS_Biblioteca`.`Transaccion` (
  `Id_Transaccion` INT NOT NULL AUTO_INCREMENT,
  `Fecha_Devolucion` DATE NOT NULL,
  `Fecha_Reserva` DATE NOT NULL,
  `Fecha_Prestamo` DATE NOT NULL,
  `Estado` VARCHAR(45) NOT NULL,
  `Multa` DECIMAL(10,2) NOT NULL,
  `Libro_Id_Libro` INT NOT NULL,
  `Usuario_Id_Usuario` INT NOT NULL,
  `Estados_Id_estados` INT NOT NULL,
  PRIMARY KEY (`Id_Transaccion`),
  CONSTRAINT `fk_Transaccion_Libro1`
    FOREIGN KEY (`Libro_Id_Libro`)
    REFERENCES `SIS_Biblioteca`.`Libro` (`Id_Libro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Transaccion_Usuario1`
    FOREIGN KEY (`Usuario_Id_Usuario`)
    REFERENCES `SIS_Biblioteca`.`Usuario` (`Id_Usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Transaccion_Estados1`
    FOREIGN KEY (`Estados_Id_estados`)
    REFERENCES `SIS_Biblioteca`.`Estados` (`Id_estados`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Bd_LeeMass
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Bd_LeeMass
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Bd_LeeMass` DEFAULT CHARACTER SET utf8 ;
USE `Bd_LeeMass` ;

-- -----------------------------------------------------
-- Table `Bd_LeeMass`.`TypeUser`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Bd_LeeMass`.`TypeUser` (
  `idTypeUser` INT NOT NULL AUTO_INCREMENT,
  `NomTypeUser` VARCHAR(45) NOT NULL,
  `DesTypeUser` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`idTypeUser`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Bd_LeeMass`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Bd_LeeMass`.`User` (
  `idUser` INT NULL AUTO_INCREMENT,
  `DniUser` VARCHAR(8) NOT NULL,
  `NomUser` VARCHAR(45) NOT NULL,
  `ApeUser` VARCHAR(45) NOT NULL,
  `TelefonoUser` VARCHAR(45) NOT NULL,
  `Contraseña` VARCHAR(45) NOT NULL,
  `TypeUser` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `Id_TypeUser` INT NOT NULL,
  `Estado` TINYINT NOT NULL,
  PRIMARY KEY (`idUser`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Bd_LeeMass`.`Generos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Bd_LeeMass`.`Generos` (
  `idGeneros` INT NOT NULL AUTO_INCREMENT,
  `NomGenero` VARCHAR(45) NOT NULL,
  `DesGenero` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`idGeneros`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Bd_LeeMass`.`Libro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Bd_LeeMass`.`Libro` (
  `idLibro` INT NOT NULL AUTO_INCREMENT,
  `Titulo` VARCHAR(45) NOT NULL,
  `autor` VARCHAR(45) NOT NULL,
  `Descripcion` VARCHAR(255) NOT NULL,
  `Stock` INT NOT NULL,
  `Precio` DECIMAL(10,2) NOT NULL,
  `Editorial` VARCHAR(45) NOT NULL,
  `Genero` VARCHAR(45) NOT NULL,
  `Id_Genero` INT NOT NULL,
  `FechaPubli` DATE NOT NULL,
  PRIMARY KEY (`idLibro`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Bd_LeeMass`.`TipoVenta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Bd_LeeMass`.`TipoVenta` (
  `idTipoVenta` INT NOT NULL AUTO_INCREMENT,
  `NomTypeVenta` VARCHAR(45) NOT NULL,
  `DesTypeVenta` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idTipoVenta`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Bd_LeeMass`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Bd_LeeMass`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Bd_LeeMass`.`Venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Bd_LeeMass`.`Venta` (
  `idVenta` INT NULL AUTO_INCREMENT,
  `TypeVenta` VARCHAR(45) NOT NULL,
  `Id_Type` INT NOT NULL,
  `PrecioUnidad` DECIMAL(10,2) NOT NULL,
  `FechaVenta` DATE NOT NULL,
  `Id_Cliente` INT NOT NULL,
  `Id_Libro` INT NOT NULL,
  `CantidadLibros` INT NOT NULL,
  `Id_User` INT NOT NULL,
  `MetodoPago` VARCHAR(45) NOT NULL,
  `EstadoVenta` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idVenta`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

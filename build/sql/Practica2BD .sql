SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `mydb` ;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`centrodetrabajo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`centrodetrabajo` (
  `idCentroDeTrabajo` INT NOT NULL,
  `nombreCentroDeTrabajo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCentroDeTrabajo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`carrera`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`carrera` (
  `idCarrera` INT NOT NULL,
  `nombreCarrera` VARCHAR(45) NOT NULL,
  `duracion` INT(11) NULL,
  `idCentroDeTrabajo` INT(11) NULL,
  `centrodetrabajo_idCentroDeTrabajo` INT NOT NULL,
  PRIMARY KEY (`idCarrera`),
  INDEX `fk_carrera_centrodetrabajo1_idx` (`centrodetrabajo_idCentroDeTrabajo` ASC),
  CONSTRAINT `fk_carrera_centrodetrabajo1`
    FOREIGN KEY (`centrodetrabajo_idCentroDeTrabajo`)
    REFERENCES `mydb`.`centrodetrabajo` (`idCentroDeTrabajo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`alumno` (
  `matricula` BIGINT(20) NOT NULL,
  `nombreAlumno` VARCHAR(45) NOT NULL,
  `paternoAlumno` VARCHAR(45) NOT NULL,
  `maternoAlumno` VARCHAR(45) NOT NULL,
  `fechaNacimiento` DATE NOT NULL,
  `calle` VARCHAR(45) NULL,
  `colonia` VARCHAR(45) NULL,
  `numero` INT(11) NULL,
  `codigoPostal` BIGINT(20) NULL,
  `sexo` CHAR(1) NULL,
  `email` VARCHAR(45) NULL,
  `idCarrera` VARCHAR(45) NULL,
  `carrera_idCarrera` INT NOT NULL,
  PRIMARY KEY (`matricula`),
  INDEX `fk_alumno_carrera1_idx` (`carrera_idCarrera` ASC),
  CONSTRAINT `fk_alumno_carrera1`
    FOREIGN KEY (`carrera_idCarrera`)
    REFERENCES `mydb`.`carrera` (`idCarrera`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`materias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`materias` (
  `idMaterias` INT(11) NOT NULL,
  `nombreMateria` VARCHAR(45) NULL,
  `creditos` INT(11) NULL,
  PRIMARY KEY (`idMaterias`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`examen`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`examen` (
  `idExamen` INT NOT NULL,
  `fecha` VARCHAR(45) NULL,
  `materias_idMaterias` INT(11) NOT NULL,
  PRIMARY KEY (`idExamen`),
  INDEX `fk_examen_materias1_idx` (`materias_idMaterias` ASC),
  CONSTRAINT `fk_examen_materias1`
    FOREIGN KEY (`materias_idMaterias`)
    REFERENCES `mydb`.`materias` (`idMaterias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`respuestas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`respuestas` (
  `idRespuestas` INT NOT NULL,
  `Respuesta` VARCHAR(45) NULL,
  `respuestas_idPreguntas` INT NOT NULL,
  PRIMARY KEY (`idRespuestas`),
  INDEX `fk_respuestas_respuestas1_idx` (`respuestas_idPreguntas` ASC),
  CONSTRAINT `fk_respuestas_respuestas1`
    FOREIGN KEY (`respuestas_idPreguntas`)
    REFERENCES `mydb`.`respuestas` (`idPreguntas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`respuestas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`respuestas` (
  `idRespuestas` INT NOT NULL,
  `Respuesta` VARCHAR(45) NULL,
  `respuestas_idPreguntas` INT NOT NULL,
  PRIMARY KEY (`idRespuestas`),
  INDEX `fk_respuestas_respuestas1_idx` (`respuestas_idPreguntas` ASC),
  CONSTRAINT `fk_respuestas_respuestas1`
    FOREIGN KEY (`respuestas_idPreguntas`)
    REFERENCES `mydb`.`respuestas` (`idPreguntas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`calificaciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`calificaciones` (
  `idCalificaciones` INT NOT NULL,
  `puntaje` VARCHAR(45) NULL,
  `idExamen` VARCHAR(45) NULL,
  `alumno_matricula` BIGINT(20) NOT NULL,
  `examen_idExamen` INT NOT NULL,
  PRIMARY KEY (`idCalificaciones`),
  INDEX `fk_calificaciones_alumno1_idx` (`alumno_matricula` ASC),
  INDEX `fk_calificaciones_examen1_idx` (`examen_idExamen` ASC),
  CONSTRAINT `fk_calificaciones_alumno1`
    FOREIGN KEY (`alumno_matricula`)
    REFERENCES `mydb`.`alumno` (`matricula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_calificaciones_examen1`
    FOREIGN KEY (`examen_idExamen`)
    REFERENCES `mydb`.`examen` (`idExamen`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

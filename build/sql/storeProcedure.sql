DELIMITER $$
CREATE PROCEDURE Grafiquita()
BEGIN
    SELECT COUNT(*) AS alumnosTotales, c.nombreCarrera AS carrera 
    FROM alumnos AS a
    INNER JOIN carrera AS c
    ON a.matricula = c.idCarrera
    GROUP BY a.nombreAlumno
    ;
END $$
DELIMITER ;

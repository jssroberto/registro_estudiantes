/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.pruebas.tests;

import java.util.List;
import org.itson.pruebas.daos.AlumnoDAO;
import org.itson.pruebas.daos.Conexion;
import org.itson.pruebas.daos.IConexion;
import org.itson.pruebas.exceptions.ModelException;
import org.itson.pruebas.model.Alumno;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author elimo
 */
public class AlumnoDAORendimientoTest {

    private AlumnoDAO alumnoDAO;

    @BeforeEach
    public void setUp() {
        IConexion conexion = new Conexion(); // Asegúrate de proporcionar tu implementación de IConexion
        alumnoDAO = new AlumnoDAO(conexion);
    }

    @Test
    @Timeout(30)
    public void testRegistrarPerformance() throws ModelException {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 400; i++) { // Crear 1000 alumnos
            Alumno alumno = new Alumno("Nombre" + i, "Apellido" + i, "000" + i, "correo" + i + "@example.com", "Dirección" + i);
            alumnoDAO.registrar(alumno);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo de creación: " + (endTime - startTime) + " milisegundos");
    }

    @Test
    @Timeout(30)
    public void testConsultarPorMatriculaPerformance() throws ModelException {
        for (int i = 0; i < 1000; i++) {
            Alumno alumno = new Alumno("Nombre" + i, "Apellido" + i, "0000" + i, "correo" + i + "@example2.com", "Dirección" + i);
            alumnoDAO.registrar(alumno);
        }

        long startTime = System.currentTimeMillis();

        List<Alumno> alumnos = alumnoDAO.consultarPorMatricula("5645462");
        assertNotNull(alumnos);

        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo de consulta por matrícula: " + (endTime - startTime) + " milisegundos");
    }

    @Test
    @Timeout(30)
    public void testActualizarPerformance() throws ModelException {
        // Precondiciones: Insertar datos de prueba
        Alumno alumno = new Alumno("Nombre", "Apellido", "5645462", "correo@example.com", "Dirección");
        alumnoDAO.registrar(alumno);

        long startTime = System.currentTimeMillis();

        alumno.setCorreo("nuevoCorreo@example.com");
        alumnoDAO.actualizar(alumno);

        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo de actualización: " + (endTime - startTime) + " milisegundos");
    }

    @Test
    @Timeout(30)
    public void testEliminarPerformance() throws ModelException {
        Alumno alumno = new Alumno("Nombre", "Apellido", "5645462", "correo@example.com", "Dirección");
        alumnoDAO.registrar(alumno);

        long startTime = System.currentTimeMillis();

        alumnoDAO.eliminar(alumno);

        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo de eliminación: " + (endTime - startTime) + " milisegundos");
    }
}

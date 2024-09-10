/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.pruebas.daos;

import org.itson.pruebas.exceptions.ModelException;
import org.itson.pruebas.model.Alumno;

/**
 *
 * @author rover
 */
public class prub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ModelException {
        AlumnoDAO alumnoDAO = new AlumnoDAO(new Conexion());
        Alumno alumno = alumnoDAO.consultarTodos().getFirst();
        System.out.println(alumno);
        alumnoDAO.eliminar(alumno);
    }
    
}

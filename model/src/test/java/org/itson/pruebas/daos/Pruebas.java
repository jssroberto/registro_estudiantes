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
public class Pruebas {

    /**
     * @param args the command line arguments
     * @throws org.itson.pruebas.exceptions.ModelException
     */
    public static void main(String[] args) throws ModelException {
        Alumno alumnoo = new Alumno("Roberto ","Garcia", "5136548", "rob@outlook.com", "Alamos 912");
        AlumnoDAO alumno = new AlumnoDAO();
        alumno.registrar(alumnoo);
    }
    
}

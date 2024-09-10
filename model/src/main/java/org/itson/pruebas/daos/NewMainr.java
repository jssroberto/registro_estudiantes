/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.pruebas.daos;

import org.itson.pruebas.exceptions.ModelException;
import org.itson.pruebas.model.Alumno;

/**
 *
 * @author elimo
 */
public class NewMainr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ModelException {
        IAlumnoDAO al = new AlumnoDAO();
        al.consultaPorNombre("ELIANA");
        Alumno alumno = new Alumno();
        alumno.setApellido("gustamante");
        alumno.setCorreo("perrito junioe");
        alumno.setDireccion("arboleads 4");
        alumno.setMatricula("fmekfe5");
        alumno.setNombre("gustavo");
        al.eliminar(alumno);
        System.out.println(al.consultarPorMatricula("MOCE0919"));

    }

}

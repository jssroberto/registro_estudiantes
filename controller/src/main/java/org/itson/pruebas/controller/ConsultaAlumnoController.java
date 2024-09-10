/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.pruebas.controller;

import java.util.List;
import org.itson.pruebas.controller.controllerExceptions.ControllerException;
import org.itson.pruebas.daos.AlumnoDAO;
import org.itson.pruebas.daos.IAlumnoDAO;
import org.itson.pruebas.exceptions.ModelException;
import org.itson.pruebas.model.Alumno;

/**
 *
 * @author elimo
 */
public class ConsultaAlumnoController implements IConsultaAlumnoController{

    private final IAlumnoDAO alumnoDAO;

    
    public ConsultaAlumnoController() {
        alumnoDAO = new AlumnoDAO();
    }

    /**
     * Consulta alumnos por matrícula.
     * 
     * @param matricula La matrícula o parte de ella.
     * @return Lista de alumnos que coinciden con la búsqueda.
     * @throws ControllerException Si ocurre un error en la consulta.
     */
    @Override
    public List<Alumno> consultarPorMatricula(String matricula) throws ControllerException {
        try{
        return alumnoDAO.consultarPorMatricula(matricula);
        }catch(ModelException e){
            throw new ControllerException(e);
        }
    }

    /**
     * Consulta alumnos por nombre.
     * 
     * @param nombre El nombre o parte de él.
     * @return Lista de alumnos que coinciden con la búsqueda.
     * @throws ControllerException Si ocurre un error en la consulta.
     */
    @Override
    public List<Alumno> consultarPorNombre(String nombre) throws ControllerException {
        try{
        return alumnoDAO.consultaPorNombre(nombre);
        }catch(ModelException e){
            throw new ControllerException(e);
        }
    }
}

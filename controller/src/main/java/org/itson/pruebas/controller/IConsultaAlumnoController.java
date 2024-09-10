/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.pruebas.controller;

import java.util.List;
import org.itson.pruebas.controller.controllerExceptions.ControllerlException;
import org.itson.pruebas.model.Alumno;

/**
 *
 * @author elimo
 */
public interface IConsultaAlumnoController {

    /**
     * Consulta alumnos por matrícula.
     * 
     * @param matricula La matrícula o parte de ella.
     * @return Lista de alumnos que coinciden con la búsqueda.
     * @throws ControllerlException Si ocurre un error en la consulta.
     */
    List<Alumno> consultarPorMatricula(String matricula) throws ControllerlException;

    /**
     * Consulta alumnos por nombre.
     * 
     * @param nombre El nombre o parte de él.
     * @return Lista de alumnos que coinciden con la búsqueda.
     * @throws ControllerlException Si ocurre un error en la consulta.
     */
    List<Alumno> consultarPorNombre(String nombre) throws ControllerlException;

}

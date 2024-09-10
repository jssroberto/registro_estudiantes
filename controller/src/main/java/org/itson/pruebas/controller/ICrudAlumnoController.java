/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.pruebas.controller;

import org.itson.pruebas.controller.controllerExceptions.ControllerlException;
import org.itson.pruebas.exceptions.ModelException;
import org.itson.pruebas.model.Alumno;
/**
 *
 * @author elimo
 */
public interface ICrudAlumnoController {

    /**
     * Registra un nuevo alumno.
     * 
     * @param alumno El alumno a registrar.
     * @throws ControllerlException Si ocurre un error en el registro.
     */
    void registrarAlumno(AlumnoDTO alumno) throws ControllerlException;

    /**
     * Actualiza la información de un alumno existente.
     * 
     * @param alumno El alumno con la información actualizada.
     * @throws ControllerlException Si ocurre un error en la actualización.
     */
    void actualizarAlumno(AlumnoDTO alumno) throws ControllerlException;

    /**
     * Elimina un alumno.
     * 
     * @param alumno El alumno a eliminar.
     * @throws ControllerlException Si ocurre un error en la eliminación.
     */
    void eliminarAlumno(AlumnoDTO alumno) throws ControllerlException;
    
    /**
     * Convierte un AlumnoDTO en una entidad Alumno.
     * 
     * @param alumnoDTO El DTO a convertir.
     * @return La entidad Alumno resultante.
     * @throws ControllerlException si no se pudo convertir
     */
    public Alumno convertirDTOAEntidad(AlumnoDTO alumnoDTO) throws ControllerlException;

}

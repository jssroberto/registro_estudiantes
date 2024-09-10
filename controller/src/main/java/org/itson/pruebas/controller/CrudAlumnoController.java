/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.pruebas.controller;

import org.itson.pruebas.controller.controllerExceptions.ControllerlException;
import org.itson.pruebas.daos.IAlumnoDAO;
import org.itson.pruebas.exceptions.ModelException;
import org.itson.pruebas.model.Alumno;

/**
 * Controlador que maneja las operaciones CRUD de alumnos.
 */
public class CrudAlumnoController implements ICrudAlumnoController{

    private final IAlumnoDAO alumnoDAO;

    public CrudAlumnoController(IAlumnoDAO alumnoDAO){
        this.alumnoDAO = alumnoDAO;
    }

    /**
     * Registra un nuevo alumno.
     *
     * @param alumno El alumno a registrar.
     * @throws ControllerlException Si ocurre un error en el registro.
     */
    @Override
    public void registrarAlumno(AlumnoDTO alumno) throws ControllerlException {
        try {
            alumnoDAO.registrar(convertirDTOAEntidad(alumno));
        } catch (ModelException e) {
            throw new ControllerlException(e);
        }
    }

    /**
     * Actualiza la información de un alumno existente.
     *
     * @param alumno El alumno con la información actualizada.
     * @throws ControllerlException Si ocurre un error en la actualización.
     */
    @Override
    public void actualizarAlumno(AlumnoDTO alumno) throws ControllerlException {
        try {

            alumnoDAO.actualizar(convertirDTOAEntidad(alumno));
        } catch (ModelException e) {
            throw new ControllerlException(e);
        }
    }

    /**
     * Elimina un alumno.
     *
     * @param alumno El alumno a eliminar.
     * @throws ControllerlException Si ocurre un error en la eliminación.
     */
    @Override
    public void eliminarAlumno(AlumnoDTO alumno) throws ControllerlException {
        try {
            alumnoDAO.eliminar(convertirDTOAEntidad(alumno));
        } catch (ModelException e) {
            throw new ControllerlException(e);
        }
    }

    /**
     * Convierte un AlumnoDTO en una entidad Alumno.
     *
     * @param alumnoDTO El DTO a convertir.
     * @return La entidad Alumno resultante.
     * @throws ControllerlException si no se pudo convertir
     */
    @Override
    public Alumno convertirDTOAEntidad(AlumnoDTO alumnoDTO) throws ControllerlException {

        Alumno alumno = new Alumno();

        try {
            if (alumnoDTO == null) {
                return null;
            }

            alumno.setNombre(alumnoDTO.getNombre());
            alumno.setApellido(alumnoDTO.getApellido());
            alumno.setMatricula(alumnoDTO.getMatricula());
            alumno.setCorreo(alumnoDTO.getCorreo());
            alumno.setDireccion(alumnoDTO.getDireccion());
        } catch (Exception e) {
            throw new ControllerlException(e);
        }
        return alumno;

    }
}

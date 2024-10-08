/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.pruebas.controller;

import org.itson.pruebas.controller.controllerExceptions.ControllerException;
import org.itson.pruebas.daos.AlumnoDAO;
import org.itson.pruebas.daos.Conexion;
import org.itson.pruebas.daos.IAlumnoDAO;
import org.itson.pruebas.exceptions.ModelException;
import org.itson.pruebas.model.Alumno;

/**
 * Controlador que maneja las operaciones CRUD de alumnos.
 */
public class CrudAlumnoController implements ICrudAlumnoController{

    private final IAlumnoDAO alumnoDAO;

    public CrudAlumnoController(){
        alumnoDAO = new AlumnoDAO(new Conexion());
    }

    /**
     * Registra un nuevo alumno.
     *
     * @param alumno El alumno a registrar.
     * @throws ControllerException Si ocurre un error en el registro.
     */
    @Override
    public void registrarAlumno(AlumnoDTO alumno) throws ControllerException {
        try {
            alumnoDAO.registrar(convertirDTOAEntidad(alumno));
        } catch (ModelException e) {
            throw new ControllerException(e);
        }
    }

    /**
     * Actualiza la información de un alumno existente.
     *
     * @param alumno El alumno con la información actualizada.
     * @throws ControllerException Si ocurre un error en la actualización.
     */
    @Override
    public void actualizarAlumno(AlumnoDTO alumno) throws ControllerException {
        try {

            alumnoDAO.actualizar(convertirDTOAEntidad(alumno));
        } catch (ModelException e) {
            throw new ControllerException(e);
        }
    }

    /**
     * Elimina un alumno.
     *
     * @param alumno El alumno a eliminar.
     * @throws ControllerException Si ocurre un error en la eliminación.
     */
    @Override
    public void eliminarAlumno(AlumnoDTO alumno) throws ControllerException {
        try {
            alumnoDAO.eliminar(convertirDTOAEntidad(alumno));
        } catch (ModelException e) {
            throw new ControllerException(e);
        }
    }

    /**
     * Convierte un AlumnoDTO en una entidad Alumno.
     *
     * @param alumnoDTO El DTO a convertir.
     * @return La entidad Alumno resultante.
     * @throws ControllerException si no se pudo convertir
     */
    @Override
    public Alumno convertirDTOAEntidad(AlumnoDTO alumnoDTO) throws ControllerException {

        Alumno alumno = new Alumno();

        try {
            if (alumnoDTO == null) {
                return null;
            }
            alumno.setId(alumnoDTO.getId());
            alumno.setNombre(alumnoDTO.getNombre());
            alumno.setApellido(alumnoDTO.getApellido());
            alumno.setMatricula(alumnoDTO.getMatricula());
            alumno.setCorreo(alumnoDTO.getCorreo());
            alumno.setDireccion(alumnoDTO.getDireccion());
        } catch (Exception e) {
            throw new ControllerException(e);
        }
        return alumno;

    }
    
    /**
     * Separa los apellidos
     * @param texto texto a separar
     * @return Array de apellidos separados
     */
    public static String[] separarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return new String[]{"", ""}; // Devuelve un arreglo con dos strings vacíos si el texto es nulo o vacío
        }

        // Encuentra el índice del primer espacio en el texto
        int espacioIndex = texto.indexOf(' ');
        
        // Si no se encuentra ningún espacio, devuelve el texto completo como la primera palabra
        // y una cadena vacía como la segunda palabra
        if (espacioIndex == -1) {
            return new String[]{texto, ""};
        }
        
        // Separa el texto en dos partes usando el índice del primer espacio
        String primeraPalabra = texto.substring(0, espacioIndex).trim();
        String segundaPalabra = texto.substring(espacioIndex + 1).trim();
        
        return new String[]{primeraPalabra, segundaPalabra};
    }
    
    
    
                                        
}

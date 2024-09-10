/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.pruebas.controller;

import java.util.ArrayList;
import java.util.List;
import org.itson.pruebas.controller.controllerExceptions.ControllerException;
import org.itson.pruebas.daos.AlumnoDAO;
import org.itson.pruebas.daos.Conexion;
import org.itson.pruebas.daos.IAlumnoDAO;
import org.itson.pruebas.exceptions.ModelException;
import org.itson.pruebas.model.Alumno;

/**
 *
 * @author elimo
 */
public class ConsultaAlumnoController implements IConsultaAlumnoController {

    private final IAlumnoDAO alumnoDAO;

    public ConsultaAlumnoController() {
        alumnoDAO = new AlumnoDAO(new Conexion());
    }

    /**
     * Consulta alumnos por matrícula.
     *
     * @param matricula La matrícula o parte de ella.
     * @return Lista de alumnos que coinciden con la búsqueda.
     * @throws ControllerException Si ocurre un error en la consulta.
     */
    @Override
    public List<AlumnoDTO> consultarPorMatricula(String matricula) throws ControllerException {
        List<AlumnoDTO> alumnos = new ArrayList<>();
        try {
            for (int i = 0; i < alumnoDAO.consultarPorMatricula(matricula).size(); i++) {

alumnos.add(convertirADTO(alumnoDAO.consultarPorMatricula(matricula).get(i)));
            }
        } catch (ModelException e) {
            throw new ControllerException(e);
        }
        return alumnos;
    }

    /**
     * Consulta alumnos por nombre.
     *
     * @param nombre El nombre o parte de él.
     * @return Lista de alumnos que coinciden con la búsqueda.
     * @throws ControllerException Si ocurre un error en la consulta.
     */
    @Override
    public List<AlumnoDTO> consultarPorNombre(String nombre) throws ControllerException {
        List<AlumnoDTO> alumnos = new ArrayList<>();
        try {
            for (int i = 0; i < alumnoDAO.consultaPorNombre(nombre).size(); i++) {

                alumnos.add(convertirADTO(alumnoDAO.consultaPorNombre(nombre).get(i)));
            }
        } catch (ModelException e) {
            throw new ControllerException(e);
        }
        return alumnos;
    }

    /**
     * Convierte una entidad Alumno a un AlumnoDTO.
     *
     * @param alumno alumno a convertir
     * @return La DTO Alumno resultante.
     */
    @Override
    public AlumnoDTO convertirADTO(Alumno alumno) {
        if (alumno == null) {
            return null;
        }

        AlumnoDTO dto = new AlumnoDTO();
        dto.setId(alumno.getId());
        dto.setNombre(alumno.getNombre());
        dto.setApellido(alumno.getApellido());
        dto.setMatricula(alumno.getMatricula());
        dto.setCorreo(alumno.getCorreo());
        dto.setDireccion(alumno.getDireccion());

        return dto;
    }
}

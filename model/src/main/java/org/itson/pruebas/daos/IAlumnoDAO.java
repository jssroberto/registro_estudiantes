package org.itson.pruebas.daos;

import java.util.List;
import org.itson.pruebas.exceptions.ModelException;
import org.itson.pruebas.model.Alumno;

/**
 * Interfaz para operaciones de acceso a datos de {@link Alumno}.
 *
 * <p>
 * Define métodos para consultar alumnos por matrícula y por nombre.</p>
 *
 * @author Eliana Monge
 * @author Roberto García
 * @version 1.0
 */
public interface IAlumnoDAO {

    /**
     * Registra un nuevo alumno en la base de datos.
     *
     * @param alumno El alumno que se va a registrar.
     * @throws ModelException Si ocurre un error al registrar al alumno.
     */
    public void registrar(Alumno alumno) throws ModelException;

    /**
     * Consulta un alumno por su matrícula.
     *
     * @param matricula La matrícula del alumno a consultar.
     * @return El alumno correspondiente a la matrícula.
     * @throws ModelException Si ocurre un error al consultar el alumno.
     */
    public List<Alumno> consultarPorMatricula(String matricula) throws ModelException;

    /**
     * Consulta un alumno por su nombre.
     *
     * @param nombre El nombre del alumno a consultar.
     * @return El alumno correspondiente al nombre.
     * @throws ModelException Si ocurre un error al consultar el alumno.
     */
    public List<Alumno> consultaPorNombre(String nombre) throws ModelException;

    /**
     * Actualiza los datos de un alumno existente en la base de datos.
     *
     * @param alumno El alumno con los datos actualizados.
     * @throws ModelException Si ocurre un error al actualizar el alumno.
     */
    public void actualizar(Alumno alumno) throws ModelException;

    /**
     * Elimina un alumno de la base de datos.
     *
     * @param alumno El alumno que se va a eliminar.
     * @throws ModelException Si ocurre un error al eliminar el alumno.
     */
    public void eliminar(Alumno alumno) throws ModelException;

}

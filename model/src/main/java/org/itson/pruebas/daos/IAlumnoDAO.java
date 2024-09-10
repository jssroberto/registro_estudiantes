package org.itson.pruebas.daos;

import java.util.List;
import org.itson.pruebas.exceptions.ModelException;
import org.itson.pruebas.model.Alumno;

/**
 * Interfaz para operaciones de acceso a datos de {@link Alumno}.
 *
 * <p>
 * Define métodos para registrar, consultar, actualizar y eliminar alumnos en la
 * base de datos.</p>
 *
 * <p>
 * Las consultas de alumnos se pueden realizar tanto por matrícula como por
 * nombre, devolviendo listas de alumnos que coincidan parcial o completamente
 * con los criterios de búsqueda.</p>
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
     * Consulta alumnos en la base de datos cuya matrícula coincida parcialmente
     * con la cadena proporcionada.
     *
     * @param matricula La matrícula (o parte de ella) del alumno a consultar.
     * @return Una lista de alumnos que coinciden con la matrícula
     * proporcionada.
     * @throws ModelException Si ocurre un error al consultar los alumnos.
     */
    public List<Alumno> consultarPorMatricula(String matricula) throws ModelException;

    /**
     * Consulta alumnos en la base de datos cuyo nombre coincida parcialmente
     * con la cadena proporcionada.
     *
     * @param nombre El nombre (o parte de él) del alumno a consultar.
     * @return Una lista de alumnos que coinciden con el nombre proporcionado.
     * @throws ModelException Si ocurre un error al consultar los alumnos.
     */
    public List<Alumno> consultaPorNombre(String nombre) throws ModelException;

    /**
     * Consulta todos los alumnos que esten registrados en la base de datos.
     *
     * @return Una lista de todos los alumnos registrados.
     * @throws ModelException Si ocurre un error al consultar los alumnos.
     */
    public List<Alumno> consultarTodos() throws ModelException;
    
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

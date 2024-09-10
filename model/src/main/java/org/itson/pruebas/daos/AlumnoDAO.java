package org.itson.pruebas.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.itson.pruebas.exceptions.ModelException;
import org.itson.pruebas.model.Alumno;

/**
 * Clase que implementa la interfaz {@link IAlumnoDAO} y proporciona operaciones
 * de acceso a datos para la entidad {@link Alumno} utilizando JPA (Java
 * Persistence API).
 *
 * <p>
 * Esta clase gestiona las operaciones de registro, consulta, actualización y
 * eliminación de instancias de {@link Alumno} en la base de datos.</p>
 *
 * @author Eliana Monge
 * @author Roberto García
 * @version 1.0
 */
public class AlumnoDAO implements IAlumnoDAO {

    private final IConexion conexion;

    /**
     * Constructor que inicializa la conexión a la base de datos utilizando la
     * implementación por defecto de {@link IConexion}.
     * 
     * @param conexion Inyección de implementación de {@link IConexion}
     */
    public AlumnoDAO(IConexion conexion) {
        this.conexion = conexion; 
    }

    /**
     * Registra un nuevo alumno en la base de datos.
     *
     * @param alumno La instancia de {@link Alumno} que se desea registrar.
     * @throws ModelException Si ocurre un error durante el registro del alumno.
     */
    @Override
    public void registrar(Alumno alumno) throws ModelException {
        EntityManager entityManager = null;
        EntityTransaction transaction = null;

        try {
            entityManager = this.conexion.crearConexion();
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(alumno);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw new ModelException("Error al registrar el alumno con matrícula: " + alumno.getMatricula(), e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    /**
     * Consulta alumnos en la base de datos cuya matrícula coincida parcialmente
     * con la cadena proporcionada.
     *
     * @param matricula La matrícula (o parte de ella) a buscar.
     * @return Una lista de alumnos que coinciden con la búsqueda.
     * @throws ModelException Si ocurre un error durante la consulta.
     */
    @Override
    public List<Alumno> consultarPorMatricula(String matricula) throws ModelException {
        EntityManager entityManager = null;
        List<Alumno> alumnos = null;

        try {
            entityManager = this.conexion.crearConexion();
            CriteriaBuilder cb = entityManager.getCriteriaBuilder();
            CriteriaQuery<Alumno> criteriaQuery = cb.createQuery(Alumno.class);
            Root<Alumno> root = criteriaQuery.from(Alumno.class);
            criteriaQuery.select(root).where(cb.like(root.get("matricula"), "%" + matricula + "%"));
            TypedQuery<Alumno> query = entityManager.createQuery(criteriaQuery);
            alumnos = query.getResultList();

        } catch (Exception e) {
            throw new ModelException("Error al consultar a los alumnos con matrícula: " + matricula, e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }

        return alumnos;
    }

    /**
     * Consulta alumnos en la base de datos cuyo nombre coincida parcialmente
     * con la cadena proporcionada.
     *
     * @param nombre El nombre (o parte de él) a buscar.
     * @return Una lista de alumnos que coinciden con la búsqueda.
     * @throws ModelException Si ocurre un error durante la consulta.
     */
    @Override
    public List<Alumno> consultaPorNombre(String nombre) throws ModelException {
        EntityManager em = null;
        List<Alumno> alumnos = null;

        try {
            em = this.conexion.crearConexion();
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Alumno> criteriaQuery = cb.createQuery(Alumno.class);
            Root<Alumno> root = criteriaQuery.from(Alumno.class);
            criteriaQuery.select(root).where(cb.like(root.get("nombre"), "%" + nombre + "%"));
            TypedQuery<Alumno> query = em.createQuery(criteriaQuery);
            alumnos = query.getResultList();
        } catch (Exception e) {
            throw new ModelException("Error al consultar a los alumnos con nombre: " + nombre, e);
        } finally {
            if (em != null) {
                em.close();
            }
        }

        return alumnos;
    }

    /**
     * Consulta todos los alumnos que esten registrados en la base de datos.
     *
     * @return Una lista de todos los alumnos registrados.
     * @throws ModelException Si ocurre un error al consultar los alumnos.
     */
    @Override
    public List<Alumno> consultarTodos() throws ModelException {
        EntityManager entityManager = null;
        List<Alumno> alumnos = null;

        try {
            entityManager = this.conexion.crearConexion();
            CriteriaBuilder cb = entityManager.getCriteriaBuilder();
            CriteriaQuery<Alumno> criteriaQuery = cb.createQuery(Alumno.class);
            Root<Alumno> root = criteriaQuery.from(Alumno.class);
            criteriaQuery.select(root);
            TypedQuery<Alumno> query = entityManager.createQuery(criteriaQuery);
            alumnos = query.getResultList();

        } catch (Exception e) {
            throw new ModelException("Error al consultar a los alumnos", e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }

        return alumnos;
    }

    /**
     * Actualiza la información de un alumno en la base de datos.
     *
     * @param alumno La instancia de {@link Alumno} con la información
     * actualizada.
     * @throws ModelException Si ocurre un error durante la actualización del
     * alumno.
     */
    @Override
    public void actualizar(Alumno alumno) throws ModelException {
        EntityManager entityManager = null;
        EntityTransaction transaction = null;

        try {
            entityManager = this.conexion.crearConexion();
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(alumno);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw new ModelException("Error al actualizar el alumno", e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    /**
     * Elimina un alumno de la base de datos.
     *
     * @param alumno La instancia de {@link Alumno} que se desea eliminar.
     * @throws ModelException Si ocurre un error durante la eliminación del
     * alumno.
     */
    @Override
    public void eliminar(Alumno alumno) throws ModelException {
        EntityManager entityManager = null;
        EntityTransaction transaction = null;

        try {
            entityManager = this.conexion.crearConexion();
            transaction = entityManager.getTransaction();
            transaction.begin();
            Alumno alumnoAEliminar = entityManager.find(Alumno.class, alumno.getMatricula());
            if (alumnoAEliminar != null) {
                entityManager.remove(alumnoAEliminar);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw new ModelException("Error al eliminar el alumno", e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

}

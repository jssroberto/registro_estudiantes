package org.itson.pruebas.tests;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.itson.pruebas.daos.AlumnoDAO;
import org.itson.pruebas.daos.IConexion;
import org.itson.pruebas.exceptions.ModelException;
import org.itson.pruebas.model.Alumno;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 * Clase de pruebas unitarias para la clase {@link AlumnoDAO}. Utiliza Mockito
 * para simular dependencias y JUnit 5 para la ejecución de pruebas.
 */
public class AlumnoDAOTest {

    @Mock
    private IConexion mockConexion;

    @Mock
    private EntityManager mockEntityManager;

    @Mock
    private EntityTransaction mockTransaction;

    @Mock
    private CriteriaBuilder mockCriteriaBuilder;

    @Mock
    private CriteriaQuery<Alumno> mockCriteriaQuery;

    @Mock
    private Root<Alumno> mockRoot;

    @Mock
    private TypedQuery<Alumno> mockTypedQuery;

    @InjectMocks
    private AlumnoDAO alumnoDAO;

    /**
     * Configura los mocks antes de cada prueba. Se inicializan los mocks y se
     * define el comportamiento de las simulaciones.
     */
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        when(mockConexion.crearConexion()).thenReturn(mockEntityManager);
        when(mockEntityManager.getTransaction()).thenReturn(mockTransaction);
        alumnoDAO = new AlumnoDAO(mockConexion);
    }

    /**
     * Prueba para verificar el registro exitoso de un alumno. Se asegura de que
     * el método {@link AlumnoDAO#registrar(Alumno)} persista el alumno, inicie
     * y confirme la transacción.
     */
    @Test
    void testRegistrar() throws ModelException {
        Alumno alumno = new Alumno("Juan", "Pérez", "A123456", "juan.perez@example.com", "Calle Falsa 123, Ciudad, País");

        doNothing().when(mockEntityManager).persist(alumno);
        doNothing().when(mockTransaction).begin();
        doNothing().when(mockTransaction).commit();

        alumnoDAO.registrar(alumno);

        verify(mockEntityManager, times(1)).persist(alumno);
        verify(mockTransaction, times(1)).begin();
        verify(mockTransaction, times(1)).commit();
        verify(mockEntityManager, times(1)).close();
    }

    /**
     * Prueba para verificar el manejo de errores al registrar un alumno. Se
     * asegura de que el método {@link AlumnoDAO#registrar(Alumno)} maneje
     * correctamente las excepciones y haga rollback en caso de error.
     */
    @Test
    void testRegistrarError() throws ModelException {
        Alumno alumno = new Alumno("Juan", "Pérez", "A123456", "juan.perez@example.com", "Calle Falsa 123, Ciudad, País");

        doNothing().when(mockTransaction).begin();
        when(mockTransaction.isActive()).thenReturn(true); 
        doThrow(new RuntimeException()).when(mockEntityManager).persist(alumno);
        doNothing().when(mockTransaction).rollback();

        assertThrows(ModelException.class, () -> {
            alumnoDAO.registrar(alumno);
        });

        verify(mockTransaction, times(1)).rollback();  
        verify(mockEntityManager, times(1)).close();  
    }

    /**
     * Prueba para verificar la consulta de alumnos por matrícula. Se asegura de
     * que el método {@link AlumnoDAO#consultarPorMatricula(String)} devuelva la
     * lista correcta de alumnos.
     */
    @Test
    void testConsultarPorMatricula() throws ModelException {
        String matricula = "123";
        Alumno alumno = new Alumno("Juan", "Pérez", "12345", "juan.perez@example.com", "Calle Falsa 123, Ciudad, País");

        
        when(mockEntityManager.getCriteriaBuilder()).thenReturn(mockCriteriaBuilder);
        when(mockCriteriaBuilder.createQuery(Alumno.class)).thenReturn(mockCriteriaQuery);
        when(mockCriteriaQuery.from(Alumno.class)).thenReturn(mockRoot);
        
        Predicate likePredicate = mock(Predicate.class);
        when(mockCriteriaBuilder.like(mockRoot.get("matricula"), "%" + matricula + "%")).thenReturn(likePredicate);
        when(mockCriteriaQuery.select(mockRoot)).thenReturn(mockCriteriaQuery);

        when(mockCriteriaQuery.where(likePredicate)).thenReturn(mockCriteriaQuery);

        when(mockEntityManager.createQuery(mockCriteriaQuery)).thenReturn(mockTypedQuery);
        when(mockTypedQuery.getResultList()).thenReturn(Collections.singletonList(alumno));

        
        List<Alumno> alumnos = alumnoDAO.consultarPorMatricula(matricula);

        
        assertNotNull(alumnos);
        assertEquals(1, alumnos.size());
        assertEquals("12345", alumnos.get(0).getMatricula());
    }

    /**
     * Prueba para verificar la consulta de alumnos por nombre. Se asegura de
     * que el método {@link AlumnoDAO#consultaPorNombre(String)} devuelva la
     * lista correcta de alumnos.
     */
    @Test
    void testConsultaPorNombre() throws ModelException {
        String nombre = "Juan";
        Alumno alumno = new Alumno("Juan", "Pérez", "12345", "juan.perez@example.com", "Calle Falsa 123, Ciudad, País");
        when(mockEntityManager.getCriteriaBuilder()).thenReturn(mockCriteriaBuilder);
        when(mockCriteriaBuilder.createQuery(Alumno.class)).thenReturn(mockCriteriaQuery);
        when(mockCriteriaQuery.from(Alumno.class)).thenReturn(mockRoot);

        Predicate likePredicate = mock(Predicate.class);
        when(mockCriteriaBuilder.like(mockRoot.get("nombre"), "%" + nombre + "%")).thenReturn(likePredicate);

        when(mockCriteriaQuery.select(mockRoot)).thenReturn(mockCriteriaQuery);
        when(mockCriteriaQuery.where(likePredicate)).thenReturn(mockCriteriaQuery);

        when(mockEntityManager.createQuery(mockCriteriaQuery)).thenReturn(mockTypedQuery);
        when(mockTypedQuery.getResultList()).thenReturn(Collections.singletonList(alumno));

        List<Alumno> alumnos = alumnoDAO.consultaPorNombre(nombre);

        assertNotNull(alumnos);
        assertEquals(1, alumnos.size());
        assertEquals("Juan", alumnos.get(0).getNombre());
    }

    /**
     * Prueba para verificar la consulta de todos los alumnos. Se asegura de que
     * el método {@link AlumnoDAO#consultarTodos()} devuelva la lista completa
     * de alumnos.
     */
    @Test
    void testConsultarTodos() throws ModelException {
        Alumno alumno1 = new Alumno("Juan", "Pérez", "12345", "juan.perez@example.com", "Calle Falsa 123, Ciudad, País");
        Alumno alumno2 = new Alumno("Ana", "Gómez", "67890", "ana.gomez@example.com", "Avenida Siempre Viva 742, Ciudad, País");
        when(mockEntityManager.getCriteriaBuilder()).thenReturn(mockCriteriaBuilder);
        when(mockCriteriaBuilder.createQuery(Alumno.class)).thenReturn(mockCriteriaQuery);
        when(mockCriteriaQuery.from(Alumno.class)).thenReturn(mockRoot);
        when(mockEntityManager.createQuery(mockCriteriaQuery)).thenReturn(mockTypedQuery);
        when(mockTypedQuery.getResultList()).thenReturn(Arrays.asList(alumno1, alumno2));

        List<Alumno> alumnos = alumnoDAO.consultarTodos();

        assertNotNull(alumnos);
        assertEquals(2, alumnos.size());
        assertTrue(alumnos.stream().anyMatch(a -> a.getNombre().equals("Juan")));
        assertTrue(alumnos.stream().anyMatch(a -> a.getNombre().equals("Ana")));
    }

    /**
     * Prueba para verificar la actualización exitosa de un alumno. Se asegura
     * de que el método {@link AlumnoDAO#actualizar(Alumno)} actualice el
     * alumno, inicie y confirme la transacción.
     */
    @Test
    void testActualizar() throws ModelException {
        Alumno alumno = new Alumno("Juan", "Pérez", "A123456", "juan.perez@example.com", "Calle Falsa 123, Ciudad, País");

        doNothing().when(mockTransaction).begin();
        doNothing().when(mockTransaction).commit();
        when(mockEntityManager.merge(alumno)).thenReturn(alumno);

        alumnoDAO.actualizar(alumno);

        verify(mockEntityManager, times(1)).merge(alumno);
        verify(mockTransaction, times(1)).begin();
        verify(mockTransaction, times(1)).commit();
        verify(mockEntityManager, times(1)).close();
    }

    /**
     * Prueba para verificar el manejo de errores al actualizar un alumno. Se
     * asegura de que el método {@link AlumnoDAO#actualizar(Alumno)} maneje
     * correctamente las excepciones y haga rollback en caso de error.
     */
    @Test
    void testActualizarError() throws ModelException {
        Alumno alumno = new Alumno("Juan", "Pérez", "A123456", "juan.perez@example.com", "Calle Falsa 123, Ciudad, País");

        doNothing().when(mockTransaction).begin();
        when(mockTransaction.isActive()).thenReturn(true);  // Asegura que la transacción esté activa
        when(mockEntityManager.merge(alumno)).thenThrow(new RuntimeException());
        doNothing().when(mockTransaction).rollback();

        assertThrows(ModelException.class, () -> {
            alumnoDAO.actualizar(alumno);
        });

        verify(mockTransaction, times(1)).rollback();
        verify(mockEntityManager, times(1)).close();
    }

    /**
     * Prueba para verificar la eliminación exitosa de un alumno. Se asegura de
     * que el método {@link AlumnoDAO#eliminar(Alumno)} elimine el alumno,
     * inicie y confirme la transacción.
     */
    @Test
    void testEliminar() throws ModelException {
        Alumno alumno = new Alumno("Juan", "Pérez", "A123456", "juan.perez@example.com", "Calle Falsa 123, Ciudad, País");
        alumno.setId(1L); // Asignar un ID para simular que el alumno ya existe en la base de datos.

        doNothing().when(mockTransaction).begin();
        when(mockEntityManager.find(Alumno.class, alumno.getId())).thenReturn(alumno);
        doNothing().when(mockEntityManager).remove(alumno);
        doNothing().when(mockTransaction).commit();

        alumnoDAO.eliminar(alumno);

        verify(mockEntityManager, times(1)).find(Alumno.class, alumno.getId());
        verify(mockEntityManager, times(1)).remove(alumno);
        verify(mockTransaction, times(1)).commit();
        verify(mockEntityManager, times(1)).close();
    }

    /**
     * Prueba para verificar el manejo de errores al eliminar un alumno. Se
     * asegura de que el método {@link AlumnoDAO#eliminar(Alumno)} maneje
     * correctamente las excepciones y haga rollback en caso de error.
     */
    @Test
    void testEliminarError() throws ModelException {
        Alumno alumno = new Alumno("Juan", "Pérez", "A123456", "juan.perez@example.com", "Calle Falsa 123, Ciudad, País");
        alumno.setId(1L);

        doNothing().when(mockTransaction).begin();
        when(mockTransaction.isActive()).thenReturn(true);  // Asegura que la transacción esté activa
        when(mockEntityManager.find(Alumno.class, alumno.getId())).thenReturn(alumno);
        doThrow(new RuntimeException()).when(mockEntityManager).remove(alumno);
        doNothing().when(mockTransaction).rollback();

        assertThrows(ModelException.class, () -> {
            alumnoDAO.eliminar(alumno);
        });

        verify(mockTransaction, times(1)).rollback();
        verify(mockEntityManager, times(1)).close();
    }

}

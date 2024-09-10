package org.itson.pruebas.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que representa a un alumno en el sistema. Mapea la entidad de la base
 * de datos con la tabla {@code alumnos}.
 */
@Entity
@Table(name = "alumnos")
public class Alumno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;

    @Column(name = "matricula", nullable = false, unique = true, length = 7)
    private String matricula;

    @Column(name = "correo", nullable = false, length = 100)
    private String correo;

    @Column(name = "direccion", length = 100)
    private String direccion;

    /**
     * Constructor por defecto. Inicializa una nueva instancia de {@code Alumno}
     * sin valores.
     */
    public Alumno() {
    }

    /**
     * Constructor con parámetros básicos. Inicializa una nueva instancia de
     * {@code Alumno} con el nombre, apellido, matrícula y correo.
     *
     * @param nombre el nombre del alumno
     * @param apellido el apellido del alumno
     * @param matricula la matrícula del alumno
     * @param correo el correo electrónico del alumno
     */
    public Alumno(String nombre, String apellido, String matricula, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.correo = correo;
    }

    /**
     * Constructor completo. Inicializa una nueva instancia de {@code Alumno}
     * con el nombre, apellido, matrícula, correo y dirección.
     *
     * @param nombre el nombre del alumno
     * @param apellido el apellido del alumno
     * @param matricula la matrícula del alumno
     * @param correo el correo electrónico del alumno
     * @param direccion la dirección del alumno
     */
    public Alumno(String nombre, String apellido, String matricula, String correo, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.correo = correo;
        this.direccion = direccion;
    }

    /**
     * Obtiene el identificador del alumno.
     *
     * @return el identificador del alumno
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el identificador del alumno.
     *
     * @param id el identificador del alumno
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del alumno.
     *
     * @return el nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     *
     * @param nombre el nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del alumno.
     *
     * @return el apellido del alumno
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del alumno.
     *
     * @param apellido el apellido del alumno
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la matrícula del alumno.
     *
     * @return la matrícula del alumno
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del alumno.
     *
     * @param matricula la matrícula del alumno
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Obtiene el correo electrónico del alumno.
     *
     * @return el correo electrónico del alumno
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del alumno.
     *
     * @param correo el correo electrónico del alumno
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la dirección del alumno.
     *
     * @return la dirección del alumno
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del alumno.
     *
     * @param direccion la dirección del alumno
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Calcula el código hash para el alumno. Utiliza el identificador único del
     * alumno para el cálculo.
     *
     * @return el código hash del alumno
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara el alumno con otro objeto para verificar igualdad. Dos alumnos
     * son iguales si tienen el mismo identificador.
     *
     * @param obj el objeto a comparar
     * @return {@code true} si el objeto es igual al alumno, {@code false} en
     * caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * Genera una representación en cadena del alumno. Incluye el identificador,
     * nombre, apellido, matrícula, correo y dirección.
     *
     * @return una cadena que representa al alumno
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", matricula=").append(matricula);
        sb.append(", correo=").append(correo);
        sb.append(", direccion=").append(direccion);
        sb.append('}');
        return sb.toString();
    }
}

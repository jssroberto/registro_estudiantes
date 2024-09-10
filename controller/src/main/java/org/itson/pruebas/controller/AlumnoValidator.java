package org.itson.pruebas.controller;

import java.util.regex.Pattern;

public class AlumnoValidator {

    // Expresiones regulares para validación
    private static final String NOMBRE_REGEX = "^[A-Za-zÁÉÍÓÚáéíóúÑñ ]{2,50}$";
    private static final String APELLIDO_REGEX = "^[A-Za-zÁÉÍÓÚáéíóúÑñ ]{2,50}$";
    private static final String CORREO_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final String DIRECCION_REGEX = "^[A-Za-z0-9ÁÉÍÓÚáéíóúÑñ,.\\s#-]{5,100}$";

    // Métodos de validación
    public boolean validarNombre(String nombre) {
        return Pattern.matches(NOMBRE_REGEX, nombre);
    }

    public boolean validarApellido(String apellido) {
        return Pattern.matches(APELLIDO_REGEX, apellido);
    }

    public boolean validarCorreo(String correo) {
        return Pattern.matches(CORREO_REGEX, correo);
    }

    public boolean validarDireccion(String direccion) {
        return Pattern.matches(DIRECCION_REGEX, direccion);
    }

    // Método de validación general
    public boolean validarAlumno(AlumnoDTO alumno) {
        return validarNombre(alumno.getNombre()) &&
               validarApellido(alumno.getApellido()) &&
               validarCorreo(alumno.getCorreo()) &&
               validarDireccion(alumno.getDireccion());
    }
}

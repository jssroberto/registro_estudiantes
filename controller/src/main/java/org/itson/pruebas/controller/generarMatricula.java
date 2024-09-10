/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.pruebas.controller;

import java.security.SecureRandom;

/**
 *
 * @author elimo
 */
public class generarMatricula {
    private static final String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITOS = "0123456789";
    private static final SecureRandom random = new SecureRandom(); // Usar SecureRandom para mejores resultados

    /**
     * Genera una matrícula aleatoria en el formato "L123L4".
     * 
     * @return Una matrícula aleatoria.
     */
    public String generarMatricula() {
        // Crear una StringBuilder para construir la matrícula
        StringBuilder matricula = new StringBuilder();

        // Generar una letra aleatoria
        matricula.append(letraAleatoria());

        // Generar tres dígitos aleatorios
        for (int i = 0; i < 3; i++) {
            matricula.append(digitoAleatorio());
        }

        // Generar otra letra aleatoria
        matricula.append(letraAleatoria());

        // Generar un dígito aleatorio
        matricula.append(digitoAleatorio());

        return matricula.toString();
    }

    /**
     * Devuelve una letra aleatoria.
     * 
     * @return Una letra aleatoria.
     */
    private char letraAleatoria() {
        return LETRAS.charAt(random.nextInt(LETRAS.length()));
    }

    /**
     * Devuelve un dígito aleatorio.
     * 
     * @return Un dígito aleatorio.
     */
    private char digitoAleatorio() {
        return DIGITOS.charAt(random.nextInt(DIGITOS.length()));
    }
}

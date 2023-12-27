/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Heras
 */
public class EmailNoValido extends Exception {

    public EmailNoValido(String msg) {
        super("ERROR: Formato de e-mail no valido");
    }
}

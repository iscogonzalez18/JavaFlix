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
public class EmailYaExistente extends Exception {
        public EmailYaExistente(String msg) {
            super(msg);
        }
}

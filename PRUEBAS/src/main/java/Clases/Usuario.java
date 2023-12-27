/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author Heras
 */
public abstract class Usuario implements Serializable {

    private String clave;
    private String correoelectronico;

    /**
     * Constructor de clase abstracta, heredan Cliente y Administrador
     * 
     * @param clave clave escogida por el usuario
     * @param correoelectronico el correo del usuario
     */
    public Usuario(String clave, String correoelectronico) {
        this.clave = clave;
        this.correoelectronico = correoelectronico;
    }

    /**
     * Devuelve la clave de este usuario
     * @return clave del usuario
     */
    public String getClave() {
        return clave;
    }

    /**
     * Cambia la clave de este usuario
     * @param clave nueva clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Devuelve el correo electronico de este usuario
     * @return correo de este usuario
     */
    public String getCorreoelectronico() {
        return correoelectronico;
    }

    /**
     * Cambia el correo electronico de este usuario
     * @param correoelectronico nuevo correo electronico
     */
    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    @Override
    public String toString() {
        return "Usuario{" + "clave=" + clave + ", correoelectronico=" + correoelectronico + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Heras
 */
public class PlanSuscripcion implements Serializable {

    private String tipo;
    private LocalDate fecha;
    private Cliente cliente;

    /**
     *Constructor para instanciar un plan de suscripcion
     * 
     * @param tipo tipo de la suscripcion (Basico, Estandar o Premium)
     * @param fecha fecha de contratacion de la suscripcion
     */
    public PlanSuscripcion(String tipo, LocalDate fecha) {
        this.tipo = tipo;
        this.fecha = fecha;
    }

    /**
     * Devuelve el tipo de esta suscripcion
     * @return tipo de esta suscripcion
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Cambia el tipo de esta suscripcion
     * @param tipo el nuevo tipo de suscripcion (Basica,Estandar o Premium)
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve la fecha de contratacion de esta suscripcion
     * @return fecha de contratacion (LocalDate)
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Establece una fecha de contratacion a esta suscripcion
     * @param fecha nueva fecha de contratacion
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Devuelve el cliente asociado a esta suscripcion
     * @return cliente asociado a la suscripcion 
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Asocia un cliente a esta suscripcion
     * @param cliente clinte para asociar
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}

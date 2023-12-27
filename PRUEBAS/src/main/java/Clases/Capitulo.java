/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Capitulo implements Serializable{
    
    private String titulo;
    private String duracion;
    
    /**
     * Crea una instancia de un capitulo, que se almacenara en una temporada
     * 
     * @param titulo titulo del capitulo
     * @param duracion duracion en HH:MM:SS
     * @see Temporada
     **/
    public Capitulo(String titulo, String duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }
    
    /**
     * Devuelve el titulo del capitulo
     *
     * 
     * @return El titulo de la instancia desde donde se llame
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Establece el titulo del capitulo
     *
     * @param titulo el nuevo titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Devuelve la duracion del capitulo
     *
     * @return la duracion del capitulo (HH:MM:SS)
     */
    public String getDuracion() {
        return duracion;
    }
    
    /**
     * Establece la duracion del capitulo
     *
     * @param duracion duracion nueva del capitulo
     */
    public void setDuración(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return  titulo + " (Duracion: " + duracion +')';
    }
    
}

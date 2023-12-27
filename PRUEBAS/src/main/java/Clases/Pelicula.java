/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Daniel
 */
public class Pelicula extends Contenido implements Serializable {
    
    private String duracion;
    private String director;

    /**
     * Constructor que hereda de Contenido.Crea una instancia de una pelicula
     * 
     * @param duracion duracion en HH:MM:SS de la pelicula  
     * @param director director encargado de la pelicula
     * @param titulo el titulo de la pelicula
     * @param sinopsis breve descripcion de la pelicula
     * @param actores lista de actores de la pelicula
     * @param anno año de publicacion de la pelicula
     * @param genero genero al que pertenece la pelicula
     * @param portada imagen de portada de la pelicula
     * 
     * @see Contenido
     */
    public Pelicula(String duracion, String director, String titulo, String sinopsis, String genero, int anno, ArrayList<String> actores,ImageIcon portada) {
        super(titulo, sinopsis, genero, anno, actores,portada);
        this.duracion = duracion;
        this.director = director;
    }

    /**
     * Devuelve la duracion de esta pelicula
     * 
     * @return la duracion de la pelicula (HH:MM:SS)
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * Establece una nueva duracion para esta pelicula
     * 
     * @param duracion nueva duracion
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * Devuelve el director encargado de esta pelicula
     * @return el director encargado de esta pelicula
     */
    public String getDirector() {
        return director;
    }

    /**
     * Establece un nuevo director a esta pelicula
     * @param director nuevo director
     */
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "duracion=" + duracion + ", director=" + director + '}';
    }
    
  
    
    
}

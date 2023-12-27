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
public class Serie extends Contenido implements Serializable {

    private ArrayList<Temporada> temporada;

    /**
     * Constructor que hereda de Contenido.Crea una instancia de una serie
     *
     * @param temporada el ArrayList de temporadas
     * @param titulo el titulo de la pelicula
     * @param sinopsis breve descripcion de la pelicula
     * @param actores lista de actores de la pelicula
     * @param anno año de publicacion de la pelicula
     * @param genero genero al que pertenece la pelicula
     * @param portada imagen de portada de la pelicula
     *
     * @see Contenido
     * @see Temporada
     */
    public Serie(ArrayList<Temporada> temporada, String titulo, String sinopsis, String genero, int anno, ArrayList<String> actores, ImageIcon portada) {
        super(titulo, sinopsis, genero, anno, actores, portada);
        this.temporada = temporada;
    }

    /**
     * Devuelve todas las temporadas de esta serie
     * @return ArrayList de todas las temporadas
     */
    public ArrayList<Temporada> getTemporada() {
        return temporada;
    }

    /**
     * Establece una nueva lista de temporadas a esta serie
     * @param temporada nueva ArrayList de temporadas
     */
    public void setTemporada(ArrayList<Temporada> temporada) {
        this.temporada = temporada;
    }

}
    

    


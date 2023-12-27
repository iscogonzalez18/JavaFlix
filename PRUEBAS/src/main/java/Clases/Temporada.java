/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Heras
 */
public class Temporada implements Serializable {
    
    private ArrayList<Capitulo> capitulos = new ArrayList<Capitulo>();

    /**
     * Constructor de UNA UNICA temporada.
     * 
     * @param capitulos ArrayList con los capitulos que forman la temporada
     * 
     * @see Capitulo
     */
    public Temporada(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    /**
     * Devuelve la lista de capitulos de esta temporada
     * @return ArrayList de capitulos 
     */
    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    /**
     * Establece una nueva lista de capitulos para esta temporada
     * @param capitulos nuevo ArrayList de capitulos
     */
    public void setCapitulos(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    
    
}

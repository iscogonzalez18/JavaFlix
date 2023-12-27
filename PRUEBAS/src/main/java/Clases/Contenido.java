/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;

/**
 *
 * @author Daniel
 */
public abstract class Contenido implements Serializable {

    private String titulo;
    private String sinopsis;
    private String genero;
    private int anno;
    private ArrayList<String> actores;
    private HashMap<Cliente, Integer> calificaciones = new HashMap<Cliente, Integer>();
    private ImageIcon portada;

    /**
     * Constructor para la clase padre abstracta de Serie y Pelicula
     *
     *
     * @param titulo el titulo del contenido
     * @param sinopsis breve descripcion del contenido
     * @param actores lista de actores del contenido
     * @param anno año de publicacion del contenido
     * @param genero genero al que pertenece el contenido
     * @param portada imagen de portada al contenido
     *
     * @see Serie
     * @see Pelicula
     */
    public Contenido(String titulo, String sinopsis, String genero, int anno, ArrayList<String> actores, ImageIcon portada) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.anno = anno;
        this.actores = actores;
        this.portada = portada;
    }

    /**
     * Devuelve el titulo del contenido
     *
     * @return titulo del contenido
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece un nuevo titulo al contenido
     *
     * @param titulo nuevo titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Devuelve la sinopsis del contenido
     *
     * @return sinopsis del contenido
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * Establece un nuevo titulo al contenido
     *
     * @param sinopsis nueva sinopsis
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    /**
     * Devuelve el genero del contenido
     *
     * @return genero del contenido
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece un nuevo genero al contenido
     *
     * @param genero nuevo genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Devuelve el año de publicacion del contenido
     *
     * @return año de publicacion del contenido
     */
    public int getAnno() {
        return anno;
    }

    /**
     * Cambia el año de publicacion del contenido
     *
     * @param anno nuevo año de publicacion
     */
    public void setAnno(int anno) {
        this.anno = anno;
    }

    /**
     * Devuelve la lista de actores del contenido
     *
     * @return ArrayList de actores del contenido
     */
    public ArrayList<String> getActores() {
        return actores;
    }

    /**
     * Establece una nueva lista de actores para el contenido
     *
     * @param actores nuevo ArrayList de actores
     */
    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    /**
     * Devuelve el diccionario de calificaciones del contenido
     *
     * @return HashMap de calificaciones
     */
    public HashMap<Cliente, Integer> getCalificaciones() {
        return calificaciones;
    }

    /**
     * Devuelve la nota que le ha dado un usuario a este contenido
     *
     * @param cliente cliente cuya nota se quiere extraer
     * 
     * @return calificacion dada por el cliente especificado
     */
    public int getCalificacion(Cliente cliente) {
        return calificaciones.get(cliente);
    }

    /**
     * Establece un nuevo diccionario de notas para el contenido
     *
     * @param calificacion nuevo ArrayList de actores
     */
    public void setCalificaciones(HashMap<Cliente, Integer> calificacion) {
        this.calificaciones = calificacion;
    }
 
    /**
     * Añade la calificacion de un cliente a el diccionario de calificaciones del contenido
     * 
     * @param cliente cliente que quiere añadir su calificacion al contenido
     * @param rate la calificacion en cuestion
     */
    public void addCalificacion(Cliente cliente, int rate) {
        calificaciones.put(cliente, rate);
    }

    /**
     * Cambia la calificacion que un cliente haya dado anteriormente a un contenido
     * 
     * @param cliente cliente que quiere cambiar su calificacion
     * @param rate la nueva calificacion
     */
    public void cambiarCalificacion(Cliente cliente, int rate) {
        calificaciones.replace(cliente, rate);
    }

    /**
     * Devuelve la portada de este contenido
     * 
     * @return ImageIcon de la portada
     */
    public ImageIcon getPortada() {
        return portada;
    }
    
    /**
     * Establece una nueva portada a este contenido
     * 
     * @param portada ImageIcon de la portada
     */
    public void setPortada(ImageIcon portada) {
        this.portada = portada;
    }

    /**
     * Devuelve la media de las calificaciones que tiene este contenido
     * 
     * @return -la nota media de las calificaciones<br>-0 si no ha sido calificado aun
     *          
     */
    public double getCalificacionMedia() {
        int sum = 0;
        int divisor = 0;
        for (Integer key : calificaciones.values()) {
            sum += key;
            divisor++;
        }
        try {
            return (sum / divisor);
        } catch (ArithmeticException e) {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Contenido{" + "titulo=" + titulo + ", sinopsis=" + sinopsis + ", genero=" + genero + ", anno=" + anno + ", actores=" + actores + '}';
    }

}

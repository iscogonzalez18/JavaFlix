/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class OrdenarContenido {

    /**
     * Ordena el contenido en el ArrayList dado de forma que quede primero los
     * contenidos mas recientes, y dentro de los contenidos en el mismo año, los
     * que tienen mejor nota media
     *
     * @param Contenido la lista de contenido a ordenar
     * @return ArrayList de contenido ordenado
     */
    public static ArrayList<Contenido> masRecienteMayorRating(ArrayList<Contenido> Contenido) {
        Contenido temp; // temporal para intercambio
        boolean estaOrdenado; // indica si esta ordenada
        for (int i = 0; i < Contenido.size() - 1; i++) {
            estaOrdenado = true;
            for (int j = 0; j < Contenido.size() - i - 1; j++) {
                if (Contenido.get(j).getAnno() < Contenido.get(j + 1).getAnno()) {
                    // Estan DESORDENADOS, intercambiar
                    temp = Contenido.get(j);
                    Contenido.set(j, Contenido.get(j + 1));
                    Contenido.set(j + 1, temp);
                    estaOrdenado = false;
                }
            }
            if (estaOrdenado) {
                // no encontramos nada para intercambiar.
                break; // hemos terminado
            }
        }
        for (int i = 0; i < Contenido.size() - 1; i++) {
            estaOrdenado = true;
            for (int j = 0; j < Contenido.size() - i - 1; j++) {
                if (Contenido.get(j).getCalificacionMedia() < Contenido.get(j + 1).getCalificacionMedia()
                        && Contenido.get(j).getAnno() == Contenido.get(j + 1).getAnno()) {
                    temp = Contenido.get(j);
                    Contenido.set(j, Contenido.get(j + 1));
                    Contenido.set(j + 1, temp);
                    estaOrdenado = false;
                }
            }
            if (estaOrdenado) {
                // no encontramos nada para intercambiar.
                break; // hemos terminado
            }
        }
        return Contenido;
    }

    /**
     * Busca en la lista de contenido proporcionada el actor / actriz que
     * especifique el usuario
     *
     * @param actor el actor / actriz que busca el usuario
     * @param Contenido la lista de contenido a recortar
     * @return ArrayList con los actores filtrados
     */
    public static ArrayList<Contenido> buscarActor(String actor, ArrayList<Contenido> Contenido) {
        ArrayList<Contenido> listaactor = new ArrayList<>();
        for (int i = 0; i < Contenido.size(); i++) {
            for (int j = 0; j < Contenido.get(i).getActores().size(); j++) {
                if (Contenido.get(i).getActores().get(j).toLowerCase().contains(actor.toLowerCase())) {
                    listaactor.add(Contenido.get(i));
                }
            }
        }
        return listaactor;
    }

    /**
     * Busca en la lista de contenido proporcionada los contenidos
     * pertenecientes al año que especifique el usuario
     *
     * @param anno el año que especifique el usuario
     * @param Contenido la lista de contenido a recortar
     * @return ArrayList con los contenidos del año especificado
     */
    public static ArrayList<Contenido> buscarAnno(int anno, ArrayList<Contenido> Contenido) {
        ArrayList<Contenido> listaanno = new ArrayList<>();
        for (int i = 0; i < Contenido.size(); i++) {
            if (Contenido.get(i).getAnno() == anno) {
                listaanno.add(Contenido.get(i));
            }
        }
        return listaanno;
    }

    /**
     * Busca en la lista de contenido proporcionada los contenidos que contengan el
     * genero que especifique el usuario
     *
     * @param genero el genero que especifique el usuario
     * @param Contenido la lista de contenido a recortar
     * @return ArrayList con los contenidos del genero especificado
     */
    public static ArrayList<Contenido> buscarGenero(String genero, ArrayList<Contenido> Contenido) {
        ArrayList<Contenido> listagenero = new ArrayList<>();
        for (int i = 0; i < Contenido.size(); i++) {
            if (Contenido.get(i).getGenero().toLowerCase().contains(genero.toLowerCase())) {
                listagenero.add(Contenido.get(i));
            }
        }
        return listagenero;
    }

    /**
     * Busca en la lista de contenido proporcionada titulos que contengan el especificado
     * por el usuario
     *
     * @param palabraclave el titulo que especifique el usuario
     * @param Contenido la lista de contenido a recortar
     * @return ArrayList con el contenido que contiene el titulo especificado
     */
    public static ArrayList<Contenido> buscarPalabra(String palabraclave, ArrayList<Contenido> Contenido) {
        ArrayList<Contenido> listapalabra = new ArrayList<>();
        for (int i = 0; i < Contenido.size(); i++) {
            if (Contenido.get(i).getTitulo().toLowerCase().contains(palabraclave.toLowerCase())) {
                listapalabra.add(Contenido.get(i));
            }
        }
        return listapalabra;
    }

}

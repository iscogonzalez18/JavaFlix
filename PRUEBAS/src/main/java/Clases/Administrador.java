package Clases;

public class Administrador extends Usuario {
    //atributos

    /**
     * Constructor de Administrador. Esta clase solo se instancia de forma 
     * estatica y final en UtilJavaflix
     * @param correoelectronico correo del Administrador
     * @param clave clave del administrador
     * 
     * @see UtilJavaflix
     */
    public Administrador(String correoelectronico, String clave) {
        super(clave, correoelectronico);
    }

}

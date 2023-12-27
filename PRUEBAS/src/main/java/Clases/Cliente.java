package Clases;

import java.util.ArrayList;

public class Cliente extends Usuario {

    //atributos
    private String dni;
    private String nombre;
    private TarjetaCredito tarjetacredito;
    private PlanSuscripcion plan;
    private ArrayList<Contenido> favoritos = new ArrayList<Contenido>();

    /**
     * Constructor que instancia un cliente
     * 
     * @param dni el numero de DNI del cliente (8 digitos y 1 letra)
     * @param nombre el nombre del cliente
     * @param tarjetacredito la tarjeta de credito asocidada al cliente
     * @param plan el plan asociado al cliente
     * @param clave la clave escogida por el cliente
     * @param correoelectronico el correo del cliente
     * 
     * @see TarjetaCredito
     * @see PlanSuscripcion
     **/   
    public Cliente(String dni, String nombre, TarjetaCredito tarjetacredito, PlanSuscripcion plan, String clave, String correoelectronico) {
        super(clave, correoelectronico);
        this.dni = dni;
        this.nombre = nombre;
        this.tarjetacredito = tarjetacredito;
        this.plan = plan;
    }
    
    /**
     * Devuelve el plan del cliente
     *
     * @return el plan de suscripcion del cliente
     * @see PlanSuscripcion
     */
    public PlanSuscripcion getPlan() {
        return plan;
    }
    
    /**
     * Establece un nuevo plan del cliente
     *
     * @param plan nuevo plan
     * @see PlanSuscripcion
     */
    public void setPlan(PlanSuscripcion plan) {
        this.plan = plan;
    }

    /**
     * Devuelve el DNI del cliente
     *
     * @return DNI del cliente
     */
    public String getDni() {
        return dni;
    }
    
    /**
     * Devuelve el nombre del cliente
     *
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Devuelve la tarjeta de credito del cliente
     *
     * @return tarjeta de credito del cliente
     * @see TarjetaCredito
     */
    public TarjetaCredito getTarjetacredito() {
        return tarjetacredito;
    }

    /**
    * Establece el DNI del cliente
    *
    * @param dni nuevo DNI del cliente
    */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    /**
    * Establece el nombre del cliente
    *
    * @param nombre nuevo nombre del cliente
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
    * Establece la tarjeta de credito del cliente
    *
    * @param tarjetacredito tarjeta de credito nueva
    * @see TarjetaCredito
    */
    public void setTarjetacredito(TarjetaCredito tarjetacredito) {
        this.tarjetacredito = tarjetacredito;
    }
    
    /**
     * Devuelve la lista con los contenidos favoritos del cliente
     *
     * @return ArrayList de contenidos
     */
    public ArrayList<Contenido> getFavoritos() {
        return favoritos;
    }
    
    /**
    * Establece la lista de contenidos favoritos del cliente
    *
    * @param favoritos lista a establecer
    */
    public void setFavoritos(ArrayList<Contenido> favoritos) {
        this.favoritos = favoritos;
    }
    
    /**
    * Añade el contenido a la lista de favoritos del cliente
    *
    * @param contenido contenido para ser añadido
    */
    public void addFavoritos(Contenido contenido) {
        favoritos.add(contenido);
    }
    
    /**
    * Elimina el contenido de la lista de favoritos del cliente
    *
    * @param contenido contenido a eliminar
    */    
    public void removeFavoritos(Contenido contenido){
        favoritos.remove(contenido);
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", tarjetacredito=" + tarjetacredito + '}';
    }

}

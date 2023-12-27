package Clases;

import java.io.Serializable;
import java.time.LocalDate;

public class TarjetaCredito implements Serializable {

    //atributos
    private String numero;
    private LocalDate caducidad;
    private double saldo;

    /**
     * Constructor que instancia una tarjeta de credito 
     * 
     * @param numero el numero de la tarjeta (16 digitos)
     * @param caducidad fecha de caducidad de la tarjeta
     * @param saldo saldo actual de la tarjeta
     */
    public TarjetaCredito(String numero, LocalDate caducidad, double saldo) {
        this.numero = numero;
        this.caducidad = caducidad;
        this.saldo = saldo;
    }

    /**
     * Devuelve el numero de esta tarjeta
     * @return numero de 16 digitos de esta tarjeta
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Devuelve la fecha de caducidad de esta tarjeta
     * @return fecha de caducidad de esta tarjeta
     */
    public LocalDate getCaducidad() {
        return caducidad;
    }

    /**
     * Devuelve el saldo disponible en esta tarjeta
     * @return saldo de esta tarjeta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Cambia el numero asociado a esta tarjeta
     * @param numero nuevo numero de 16 digitos
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Cambia la fecha de caducidad de esta tarjeta
     * @param caducidad nueva fecha de caducidad
     */
    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    /**
     * Cambia el saldo de esta tarjeta
     * @param saldo nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "numero=" + numero + ", caducidad=" + caducidad + ", saldo=" + saldo + '}';
    }

}

package com.proyectointegrador.TamyOshiro.Security.Controller;

/**
 *
 * @author tamy_
 */
public class Mensaje {
    private String mensaje;
    
    //Constructores

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    //Getter y Setter

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}

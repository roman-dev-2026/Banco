/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Usuario
 */
public class Respuesta <T>{
    private boolean exito;
    private String mansaje;
    private T datos;

    public Respuesta(boolean exito, String mansaje, T datos) {
        this.exito = exito;
        this.mansaje = mansaje;
        this.datos = datos;
    }

    public boolean isExito() {
        return exito;
    }

    public String getMansaje() {
        return mansaje;
    }

    public T getDatos() {
        return datos;
    }
    
    
}

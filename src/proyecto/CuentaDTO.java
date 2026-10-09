/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Usuario
 */
public class CuentaDTO {
   private String Titular;
   private String monto;

    public CuentaDTO(String Titular, String monto) {
        this.Titular = Titular;
        this.monto = monto;
    }

    public String getTitular() {
        return Titular;
    }

    public String getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "CuentaDTO{" + "Titular=" + Titular + ", monto=" + monto + '}';
    }
   
   
}

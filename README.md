#

## Clase main
Sirve para crear instanciar las clases para convertirlos en objeos concretos
```java
package proyecto;

public class Proyecto {

    public static ClienteDTO convertirADTO(Cliente cli){
        return new ClienteDTO(cli.getNombre(), cli.getApellido(), cli.getDni());
    }
    
    public static CuentaDTO convertirADTO(Cuenta cuenta){
        return new CuentaDTO("jose", "343255");
        
    }
    
    public static void main(String[] args) {
        
        Cliente cli = new Cliente(63234l, "roberto", "gutierrez", "2312", "hola");
        ClienteDTO cliDTO = convertirADTO(cli);
        
        Cuenta cuenta = new Cuenta(1l, "jose", "343255");
        CuentaDTO cuentaDTO = convertirADTO(cuenta);
        
        Respuesta<ClienteDTO> respuesta = new Respuesta<>(true, "Encontrado", cliDTO);

        System.out.println(cliDTO);
        System.out.println(cuentaDTO);
    }
    
}
```

## Clase ClienteDTO
```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Usuario
 */
public class ClienteDTO {
    private String nombre;
    private String apellido; 
    private String dni;

    public ClienteDTO(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
}
```

## Clase Cliente
```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String pass;

    public Cliente(Long id, String nombre, String apellido, String dni, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pass = pass;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getPass() {
        return pass;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}

```

## Clase Cuenta
```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private Long id;
    private String Titular;
    private String monto;

    public Cuenta(Long id, String Titular, String monto) {
        this.id = id;
        this.Titular = Titular;
        this.monto = monto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
    
}
```
## Clase CuentaDTO
```java
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

```
## Clase generica Respuesta
```java
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

```
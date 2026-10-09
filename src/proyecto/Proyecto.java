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

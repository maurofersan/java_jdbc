
package pe.mauro.eurekacs.controller;

import pe.mauro.eurekacs.domain.Empleado;
import pe.mauro.eurekacs.service.LogonService;
import pe.mauro.eurekacs.util.Memoria;

/**
 * @author Mauro
 */
public class LogonController {
    
    public void valida(String usuario, String clave){
        LogonService service = new LogonService();
        Empleado empleado = service.validar(usuario, clave);
        
        if(empleado == null){
            throw new RuntimeException("Datos Incorrectos.");
        }else{
            Memoria.put("usuario", empleado);
        }
    }
}

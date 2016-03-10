
package pe.mauro.eurekacs.service;

import pe.mauro.eurekacs.dao.Espec.DaoEmpleadoEspc;
import pe.mauro.eurekacs.dao.impl.DaoEmpleadoImpl;
import pe.mauro.eurekacs.domain.Empleado;

/**
 * @author Mauro
 */
public class LogonService {
    
    public Empleado validar(String usuario, String clave){
        Empleado bean = null;
        DaoEmpleadoEspc dao = new DaoEmpleadoImpl();
        bean = dao.validar(clave, usuario);
        return bean;
    }
}

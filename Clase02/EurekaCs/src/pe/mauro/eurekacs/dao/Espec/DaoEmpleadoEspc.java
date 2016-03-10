
package pe.mauro.eurekacs.dao.Espec;

import pe.mauro.eurekacs.domain.Empleado;

/**
 * @author Mauro
 */
public interface DaoEmpleadoEspc extends DaoCrudEspec<Empleado>{

    public Empleado validar(String clave, String usuario);
    
    
}

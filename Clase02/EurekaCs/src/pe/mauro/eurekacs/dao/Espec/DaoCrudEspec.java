
package pe.mauro.eurekacs.dao.Espec;

import java.util.List;

/**
 * @author Mauro
 * Create, Retrieve, Update, Delete
 */
public interface DaoCrudEspec<T> {
    
    public T readForId(String codigo);
    
    public List<T> readAll();
    
    public List<T> readForCriteria(T bean);
    
    public void insert(T bean);
    
    public void update(T bean);
    
    public void delete(String codigo);
}

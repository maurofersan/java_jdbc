
package pe.egcc.prueba;


public class PruebaBorrar {
    public static void main(String[] args) {
        
        int cont =  20;
        int size = 5;
        String formato = "%0" + size + "d";
//        cont++;
        
        for (int i = 0; i < 10; i++) {
             
            cont++;
            String codigo = String.format(formato, cont);
             System.out.println(codigo);
        }
        
    }
}

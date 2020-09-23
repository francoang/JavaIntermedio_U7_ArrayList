package proyecto_arraylist;

/**
 * Unidad 07. Ejemplos
 * Se utiliza el ArrayList con y sin genericos.
 * @author Angonoa Franco
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EjemplosArrayList ea = new EjemplosArrayList();
        
        System.out.println("===ARRAYLIST GENERICA===");
        ea.arrayListGenerica(); //Con este todo bien.
        
        System.out.println("\n===ARRAYLIST SIN GENERICO===");
        ea.sinGenericos(); //Este interrumpe el programa por la conversion de String a Integer.
        
    } 
    
}

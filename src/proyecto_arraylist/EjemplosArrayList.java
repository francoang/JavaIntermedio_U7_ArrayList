package proyecto_arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fnang
 */
public class EjemplosArrayList {

    public void sinGenericos() {
        List unArrayList = new ArrayList<>(3);

        unArrayList.add(1111); //0
        unArrayList.add(2222); //1
        unArrayList.add(3333); //2
        //unArrayList.add("Oops.. un string"); //¿Que hacemo aca?        

        for (Object ob : unArrayList) {
            Integer num = (Integer) ob; //Como recibe Object, hay que convertilo a Integer
            int numPrim = num; //Desempaquetado automatico
            System.out.println("Elem: " + numPrim);
        }
    }

    public void arrayListGenerica() {
        List<Integer> unArrayList = new ArrayList<>(3);

        unArrayList.add(1111);
        unArrayList.add(2222);
        unArrayList.add(3333);
        unArrayList.add(4444); //ArrayList crece automaticamente
        //unArrayList.add("Error de compilacion");

        System.out.println("Primer elemento: " + unArrayList.get(0));
        System.out.println("Cambio segundo elemento: " + unArrayList.set(1, new Integer(5555)));
        System.out.println("Tamaño del arreglo: " + unArrayList.size());
        System.out.println("Información de la lista: " + unArrayList.toString());
    }
}

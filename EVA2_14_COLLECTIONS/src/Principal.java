
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author martin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String>/*darle el tipo de datos generico*/ miListaEnla = new LinkedList();
        miListaEnla.add("Hola");
        miListaEnla.add(" ");
        miListaEnla.add("mundo");
        miListaEnla.add(" ");
        miListaEnla.add("cruel");
        miListaEnla.add("¡¡¡");
        miListaEnla.addFirst("xxxxxx");
        System.out.println(miListaEnla);
        for (String miListaEnla1 : miListaEnla) {
            System.out.print(miListaEnla1 + " - ");
        }
        System.out.println("");
        System.out.println("Cantidad de elementos " + miListaEnla.size());
        miListaEnla.remove(3);
        for (String miListaEnla1 : miListaEnla) {
            System.out.print(miListaEnla1 + " - ");
        }
        System.out.println("");
        System.out.println("Cantidad de elementos " + miListaEnla.size());
    }

}

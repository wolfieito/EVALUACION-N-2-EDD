
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Queue_doble miQueue = new Queue_doble();
        miQueue.add(new Nodo(1));
        miQueue.add(new Nodo(2));
        miQueue.add(new Nodo(3));
        miQueue.add(new Nodo(4));
        miQueue.add(new Nodo(5));
        miQueue.print();
        miQueue.printBack();
        miQueue.addBegin(new Nodo(0));
        miQueue.print();
        try {
            miQueue.insertAt(new Nodo(11111), 5);
            miQueue.print();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miQueue.add(new Nodo(200));
        miQueue.print();
        try {
            miQueue.deleteAt(4);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miQueue.print();
        miQueue.agregar(new Nodo(33333));
        miQueue.print();
        System.out.println("El primer elemento es "+miQueue.leer());
        try {
            System.out.println("El primer elemento es "+miQueue.quitar());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miQueue.print();
    }
}

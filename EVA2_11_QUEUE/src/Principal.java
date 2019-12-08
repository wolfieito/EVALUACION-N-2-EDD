
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
        Queue miQ = new Queue();
        miQ.agregar(new Nodo(0));
        miQ.agregar(new Nodo(1));
        miQ.agregar(new Nodo(2));
        miQ.agregar(new Nodo(3));
        miQ.print();
        System.out.println("El inicio de la cola es "+miQ.leer());
        try {
            System.out.println("El inicio de la cola es "+miQ.quitar());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miQ.print();
    }
    
}

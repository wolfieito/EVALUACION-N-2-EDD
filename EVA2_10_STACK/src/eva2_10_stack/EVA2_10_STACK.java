/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_stack;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author martin
 */
public class EVA2_10_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pila miPila = new Pila();
       miPila.push(new Nodo(100));
       miPila.push(new Nodo(200));
       miPila.push(new Nodo(300));
       miPila.push(new Nodo(400));
       miPila.print();
       System.out.println("Cima de la lista "+miPila.peek());
        try {
            System.out.println("Cima de la lista "+miPila.pop());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_10_STACK.class.getName()).log(Level.SEVERE, null, ex);
        }
        miPila.print();
    }
}

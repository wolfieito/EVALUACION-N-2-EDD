
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
        Stack_doble miStack = new Stack_doble();
        miStack.push(new Nodo(1));
        miStack.push(new Nodo(2));
        miStack.push(new Nodo(3));
        miStack.push(new Nodo(4));
        miStack.print();
        System.out.println("El primer dato es "+miStack.peek());
        try {
            System.out.println("El primer dato es "+miStack.pop());
            System.out.println("Borrado");
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El primer dato es "+miStack.peek());
    }
    
}

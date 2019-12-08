
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
        Lista miLista = new Lista();
        miLista.add(new Nodo(4));//1
        miLista.add(new Nodo(5));//2
        miLista.add(new Nodo(6));//3
        miLista.add(new Nodo(7));//4
        miLista.add(new Nodo(8));//5
        miLista.add(new Nodo(9));//6
        miLista.add(new Nodo(10));//7
        miLista.add(new Nodo(11));//8
        miLista.add(new Nodo(12));//9
        miLista.add(new Nodo(13));//10
        miLista.addBegin(new Nodo(9999));//0
        try {
            miLista.insertAt(0, new Nodo(5555));//2
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean vacia=miLista.isEmpty();
        if(vacia==true)
            System.out.println("Lista vacía");
        else
            System.out.println("Lista con nodos");
        miLista.print();
        try {
            miLista.deleteAt(0);
            miLista.print();
            miLista.add(new Nodo(200));
            miLista.print();
            miLista.deleteAt(11);
            miLista.print();
            miLista.add(new Nodo(111));
            miLista.print();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El valor de la posicion #3 es "+miLista.getAt(3));
        //miLista.print();
        /*int[] millon = new int[1000000];
        for (int i = 0; i < millon.length; i++) {
            millon[i]=(int)(Math.random()*1000);
        }*/
        /*for(int i =0 ; i<1000000 ; i++){
            miLista.add(new Nodo((int) Math.random()*1000));//adentro del parentesis es el numero que va a guardarse
        }*/
        System.out.println("Cantidad de nodos es "+miLista.size());
    }
}
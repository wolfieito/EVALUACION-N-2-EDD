/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_lista_doblemente_enlazada;

/**
 *
 * @author martin
 */
public class EVA2_9_LISTA_DOBLEMENTE_ENLAZADA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista_doble miLista = new Lista_doble();
        miLista.add(new Nodo(100));
        miLista.add(new Nodo(200));
        miLista.add(new Nodo(300));
        miLista.add(new Nodo(400));
        miLista.print();
        miLista.printBack();
        miLista.addBegin(new Nodo(500));
        miLista.print();
        miLista.insertAt(3, new Nodo(20000));
        miLista.print();
        miLista.deleteAt(3);
        miLista.print();
    }
    
}

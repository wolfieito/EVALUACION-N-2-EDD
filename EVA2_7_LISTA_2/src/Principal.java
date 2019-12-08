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
        Nodo nodo1 ,nodo2, nodo3;
        nodo1 = new Nodo(32);//todavia no estan conectados
        nodo2 = new Nodo(17);
        nodo3 = new Nodo(5);
        
        nodo1.setSiguiente(nodo2);//guardamos la referencia a nodo 2, apunta de nodo 1 a nodo 2
        nodo2.setSiguiente(nodo3);//guardamos la referencia a nodo 3, apunta de nodo 2 a nodo 3
        
        Nodo temp = nodo1;//nodo que se mueve entre los nodos
        while(temp != null){//imprimir todos los valores de la lista
            System.out.print(temp.getValor()+" - ");
            temp = temp.getSiguiente();
        }
    }

}

class Nodo {

    private int valor;//valor que guarda
    private Nodo siguiente;//referencia a otro nodo

    public Nodo() {//constructor que pone el nodo en null
        siguiente = null;
    }

    public Nodo(int valor) {//hace que el valor se guarde y el siguiente se vuelve null
        this.valor = valor;
        siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Nodo {
     
    private int valor;//valor que guarda
    private Nodo siguiente;//referencia a otro nodo
    private Nodo previo;

    public Nodo() {//constructor que pone el nodo en null
        siguiente = null;
        previo = null;
    }

    public Nodo(int valor) {//hace que el valor se guarde y el siguiente se vuelve null
        this.valor = valor;
        siguiente = null;
        previo = null;
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

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
}
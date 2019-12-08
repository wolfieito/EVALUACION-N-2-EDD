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
    private Nodo izq;//referencia a otro nodo
    private Nodo der;

    public Nodo() {//constructor que pone el nodo en null
        izq = null;
        der = null;
    }

    public Nodo(int valor) {//hace que el valor se guarde y el siguiente se vuelve null
        this.valor = valor;
        izq = null;
        der = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
}
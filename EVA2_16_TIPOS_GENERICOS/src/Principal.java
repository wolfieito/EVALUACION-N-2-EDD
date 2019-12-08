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
        Nodo<String> nodo =new Nodo<String>();
        nodo.setValor("Hola mundo cruel¡¡¡¡¡");
    }
    
}

class Nodo<T>/*<> indica tipo de datos genericos, es un identificador que se sustituye al usarlo, se usa T*/{
   private T valor;
   Nodo siguiente;
   Nodo previo;
   public Nodo(){
       this.siguiente=null;
       this.previo=null;
   }

    public Nodo(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
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
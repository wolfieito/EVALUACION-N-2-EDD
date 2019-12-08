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
        Nodo nObj1 = new Nodo();
        nObj1.valor = 100;
        nObj1.siguiente = new Nodo();//creamos nodo
        nObj1.siguiente.valor = 200;//usamos nodo
        nObj1.siguiente.siguiente = new Nodo();
        nObj1.siguiente.siguiente.valor = 300;
        System.out.println(nObj1.valor);
        System.out.println(nObj1.siguiente.valor);
        System.out.println(nObj1.siguiente.siguiente.valor);
    }
}
class Nodo{
        int valor;
        Nodo siguiente;
    }
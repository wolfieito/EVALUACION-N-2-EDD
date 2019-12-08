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
public class Lista_doble {

    private Nodo inicio;
    private Nodo fin;

    public Lista_doble() {//asegurarse que inicio sea siempre nulo
        this.inicio = null;
        this.fin = null;
    }

    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    //agregar al final de la lista
    public void add(Nodo nuevo) {
        //lista vacia
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);//hacia adelante
            nuevo.setPrevio(fin);//hacia atras
            fin = nuevo;
        }
    }

    public void print() {
        Nodo temp = inicio;
        while (temp != null) {//imprimir todos los valores de la lista
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }

    //imprimir de inicio a fin
    public void printBack() {
        Nodo temp = fin;
        while (temp != null) {//imprimir todos los valores de la lista
            System.out.print(temp.getValor() + " - ");
            temp = temp.getPrevio();
        }
        System.out.println("");
    }

    public int size() {
        int iCont = 0;
        Nodo temp = inicio;
        while (temp != null) {
            iCont++;
            temp = temp.getSiguiente();
        }
        return iCont;
    }

    public void clear() {
        inicio = null;
        fin = null;
    }

    public int getAt(int pos) {
        Nodo temp = inicio;
        int iCont = 0;
        while (iCont != pos) {
            iCont++;
            temp = temp.getSiguiente();
        }
        return temp.getValor();
    }

    public void addBegin(Nodo nuevo) {
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            inicio.setPrevio(nuevo);
            inicio.getPrevio().setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void insertAt(int pos, Nodo nuevo) {
        int iTama = size();
        if (pos == 0) {
            addBegin(nuevo);
        } else {
            Nodo temp = inicio;
            int iCont = 0;
            while (iCont != pos) {
                iCont++;
                temp = temp.getSiguiente();
            }
            nuevo.setSiguiente(temp);
            nuevo.setPrevio(temp.getPrevio());
            temp.getPrevio().setSiguiente(nuevo);
            temp.setPrevio(nuevo);
        }
    }

    public void deleteAt(int pos) {
        int iTama = size();
        if (isEmpty()) {
            System.out.println("Lista vacia");//usar excepciones
        } else {
            if (iTama == 1) {
                clear();
            } else if (pos == 0) {
                inicio = inicio.getSiguiente();
                inicio.setPrevio(null);
            } else {
                Nodo temp = inicio;
                int iCont = 0;
                while (iCont != pos) {
                    iCont++;
                    temp = temp.getSiguiente();
                }
                temp.getPrevio().setSiguiente(temp.getSiguiente());
                temp.getSiguiente().setPrevio(temp.getPrevio());
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Stack_doble {
    
    private Nodo inicio;
    private Nodo fin;

    public Stack_doble() {//asegurarse que inicio sea siempre nulo
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

    public void add(Nodo nuevo) {//lo que recibe es el tipo de dato que queremos ordenar
        //primero verificar si la lista esta vacia
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);//agregar el nodo al ultimo
            nuevo.setPrevio(fin);
            fin = nuevo;

        }
    }

    public void print() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }

    public void printBack() {
        Nodo temp = fin;
        while (temp != null) {
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

    public void addBegin(Nodo nuevo) {
        Nodo temp = inicio;
        if (temp == null) {
            add(nuevo);
        } else {
            temp.setPrevio(nuevo);
            nuevo.setSiguiente(temp);
            inicio = nuevo;
        }
    }

    public void insertAt(Nodo nuevo, int pos) throws Exception {
        int iTama = size();
        if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posicion es invalida");
        } else {
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
    }

    public void deleteAt(int pos) throws Exception {
        int iTama = size();
        if (isEmpty()) {
            throw new Exception("La posicion es invalida");
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

    public int getAt(int pos) {
        Nodo temp = inicio;
        int iCont = 0;
        while (iCont != pos) {
            iCont++;
            temp = temp.getSiguiente();
        }
        return temp.getValor();
    }
    public void push(Nodo nuevo){
        addBegin(nuevo);
    }
    public int peek(){
        return getAt(0);
    }
    public int pop() throws Exception{
        int iResu = getAt(0);
        deleteAt(0);
        return iResu;
    }
}
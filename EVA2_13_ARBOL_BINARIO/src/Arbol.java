/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Arbol {
    private Nodo root;

    public Arbol() {
        root = null;
    }
    public void agregarNodo(Nodo nuevo){//lo que va a ver lo que use el usuario
        agregarNodoRec(root, nuevo);//la primera vez inicia en la raiz 
    }
    private void agregarNodoRec(Nodo actual, Nodo nuevo){
        if(root == null){//arbol vacio
            root = nuevo;
        }else{
           if(nuevo.getValor() > actual.getValor()){//mayor--->derecha
               if(actual.getDer()==null){//derecha esta vacio
                   actual.setDer(nuevo);
               }else{//ya hay nodo a la derecha
                   agregarNodoRec(actual.getDer(),nuevo);
               }
           }else if(nuevo.getValor() < actual.getValor()){//menor----->izquierda
               if(actual.getIzq()==null){//izquierda esta vacio
                   actual.setIzq(nuevo);
               }else{//ya hay nodo a la izquierda
                   agregarNodoRec(actual.getIzq(),nuevo);
               }
           }else{//el valor es igual
               System.out.println("Ups, ya existe ese valor");
           }
        }
    }
    
    public void imprimePostOrder(){
        postOrder(root);
    }
    private void postOrder(Nodo actual){
        if(actual != null){
        //leer izquierda
        postOrder(actual.getIzq());
        //leer derecha
        postOrder(actual.getDer());
        //imprimir
        System.out.print(actual.getValor()+" - ");
        }
    }
    
    public void imprimePreOrder(){
        preOrder(root);
    }
    private void preOrder(Nodo actual){
        if(actual != null){
        //imprimir
        System.out.print(actual.getValor()+" - ");
        //leer izquierda
        preOrder(actual.getIzq());
        //leer derecha
        preOrder(actual.getDer());
        }
    }
    
    public void imprimeInOrder(){
        inOrder(root);
    }
    private void inOrder(Nodo actual){
        if(actual != null){
        //leer izquierda
        inOrder(actual.getIzq());
        //imprimir
        System.out.print(actual.getValor()+" - ");
        //leer derecha
        inOrder(actual.getDer());
        }
    }
}

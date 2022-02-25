package NodoYListas;



public class MyListDoble<T> {
    private Nodo<T> head;
    private Nodo<T> tail;
    private int size;



    public void addFirst(T add){
        Nodo<T> aux=new Nodo<>(add);
        if (size==0){
            tail=aux;
        }else {
            aux.setNext(head);
            head.setPrevius(aux);
        }
        head=aux;
        size++;
    }
    public void addLast(T add){
        Nodo<T> aux=new Nodo<>(add);
        if (size==0){
            head=aux;
        }else {
            aux.setPrevius(tail);
            tail.setNext(aux);
        }
        tail=aux;
        size++;
    }

//    public T find(T find){
//
//        if (size==0){
//            return null;
//        }else {
//            while ()
//        }
//
//
//
//    }
    public T remove(int index){
        if (index<0||index>=size){
            return null;
        }
        if (index==0){
            return removeFirst();
        }
        if (index==size-1){
            return removeLast();
        }

        Nodo<T> aux=head;
        while (index-->0){
            aux=aux.getNext();
        }
        aux.getPrevius().setNext(aux.getNext());
        aux.getNext().setPrevius(aux.getPrevius());
        size--;
        return aux.getInfo();
    }
    public T removeFirst(){

        if (head==null){
            return null;
        }

        Nodo<T> aux=head;
        if (size==1){
            head=null;
            tail=null;
        }else {
            head=aux.getNext();
            head.setPrevius(null);
            aux.setNext(null);
        }
        size--;
        return aux.getInfo();
    }
    public T removeLast(){
        if (tail==null){
            return null;
        }

        Nodo<T> aux=tail;
        if (size==1){
            head=null;
            tail=null;
        }else {
            tail=aux.getPrevius();
            tail.setNext(null);
            aux.setPrevius(null);
        }
        size--;
        return aux.getInfo();
    }



}

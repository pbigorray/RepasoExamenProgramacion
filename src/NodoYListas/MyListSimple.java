package NodoYListas;

public class MyListSimple<T> {
    private Nodo<T> head;
    private int size;

    public void push(T push){
        Nodo<T> aux=new Nodo<>(push);
        if (size==0){
            head=aux;
        }else {
            aux.setNext(head);
            head.setPrevius(aux);
            head=aux;
        }
        size--;
    }
    public T pop(){
        T aux=null;
        if (size==0){
            return null;
        }else {
            aux=head.getInfo();
            head=head.getNext();
            return aux;
        }

    }
}

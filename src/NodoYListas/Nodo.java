package NodoYListas;

public class Nodo<T> {
    private T info;
    private Nodo<T> next;
    private Nodo<T> previus;

    public Nodo(T info){
        this.info=info;
        next=null;
        previus=null;
    }
    public void setNext(Nodo<T> next){
        this.next=next;
    }
    public void setPrevius(Nodo<T> previus){
        this.previus=previus;
    }
    public void setInfo(T info) {
        this.info = info;
    }
    public Nodo<T> getNext(){
        return next;
    }
    public T getInfo(){
        return info;
    }
    public Nodo<T> getPrevius(){
        return previus;
    }

}

package Interfaces;

public interface Play {
    void play();
    default void repeat(){
while (true){
play();
}
    }
}

package Streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {
    Set<Integer> list= new HashSet<>();

    //pedir ayuda a joaquin
    public void prueba(){
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(5);
        list.stream()
                .filter(t->t >1)
                .sorted()
                .collect(Collectors.toList());
    }

}

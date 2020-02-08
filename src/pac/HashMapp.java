package pac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashMapp<T, E> {
    private T key;
    private E value;
    private HashMapp<T, E> lch;
    private HashMapp<T, E> rch;


class Mapp<T, E> {

    List<HashMapp<T, E>> list = new ArrayList<>();

    void add(T t, E e) {
        HashMapp<T, E> hashMapp = new HashMapp<>();
        hashMapp.key = t;
        hashMapp.value = e;
        list.add(hashMapp);
    }

}
}
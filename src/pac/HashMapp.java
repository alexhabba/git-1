package pac;

import java.util.ArrayList;
import java.util.List;

public class HashMapp<T, E> {
    private List<T> listT;
    private List<E> listE;

    public HashMapp() {
        this.listT = new ArrayList<>();
        this.listE = new ArrayList<>();
    }

    public static class Mapp {
        private Mapp root;
        private Mapp leftChild;
        private Mapp rightChild;
        private boolean lc;
        private boolean rc;
    }

}


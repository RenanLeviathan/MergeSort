package alg;

import static org.junit.jupiter.api.Assertions.*;

class MergesortTest {

    @org.junit.jupiter.api.Test
    void sort() {
        int[] A = {5,3,4,2,1};
        Mergesort m = new Mergesort(A);
        m.sort();
        assertEquals("{1,2,3,4,5}",m.toString());
    }
}
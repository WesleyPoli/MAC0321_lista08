package ex4;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.*;
import ex3.ArrayListMulticonjunto;


public class ConjuntoAdaptadorTeste {
    private ArrayListMulticonjunto<Integer> lista;
    private ConjuntoAdaptador<Integer> adaptador;

    @BeforeEach
    public void setUp() {
    	lista = new ArrayListMulticonjunto<>();
    	lista.add(1);
    	lista.add(2);
    	lista.add(2);
    	lista.add(3);
    	adaptador = new ConjuntoAdaptador<>(lista);
    }

    @Test
    public void testIterator() {
        Set<Integer> uniqueElements = new HashSet<>();
        for (Integer element : adaptador) {
            uniqueElements.add(element);
        }
        assertEquals(Set.of(1, 2, 3), uniqueElements);
    }

    @Test
    public void testNoDuplicates() {
        Set<Integer> uniqueElements = new HashSet<>();
        for (Integer element : adaptador) {
            uniqueElements.add(element);
        }
        assertTrue(uniqueElements.size() == 3);
    }

    @Test
    public void testContainsAllElements() {
        Set<Integer> uniqueElements = new HashSet<>();
        for (Integer element : adaptador) {
            uniqueElements.add(element);
        }
        assertTrue(uniqueElements.contains(1));
        assertTrue(uniqueElements.contains(2));
        assertTrue(uniqueElements.contains(3));
    }
}
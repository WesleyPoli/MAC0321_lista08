package ex4;

import ex3.ArrayListMulticonjunto;

import java.util.*;

class ConjuntoAdaptador<T> implements Iterable<T> {
    private ArrayListMulticonjunto<T>multiconjunto;

    public ConjuntoAdaptador (ArrayListMulticonjunto<T> multiconjunto) {
        this.multiconjunto = multiconjunto;
    }

    public Set<T> asSet() {
        return new HashSet<>(multiconjunto.getMulticonjunto());
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Iterator<T> it = multiconjunto.getMulticonjunto().iterator();
            private Set<T> seen = new HashSet<>();
            private T nextElement;

            @Override
            public boolean hasNext() {
                while (it.hasNext()) {
                    nextElement = it.next();
                    if (seen.add(nextElement)) {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public T next() {
                return nextElement;
            }
        };
    }
}
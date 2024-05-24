package ex3;

import java.util.*;

public class LinkedListMulticonjunto <T> {
	private LinkedList<T> multiconjunto;
	
	public LinkedListMulticonjunto() {
		this.multiconjunto = new LinkedList<T>();
	}
	
	
	public LinkedList<T> getMulticonjunto() {
		return this.multiconjunto;
	}

	public void add(T element) {
		this.multiconjunto.add(element);
	}
	
	
	
	public boolean equals(LinkedListMulticonjunto <T> m) {
		
		if (this.multiconjunto.size() != m.getMulticonjunto().size()) {
			return false;
		}
		else {
			for(int i = 0; i < this.multiconjunto.size(); i++) {
				if (this.multiconjunto.get(i) != m.getMulticonjunto().get(i)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public void addAll(LinkedListMulticonjunto <T> m) {
		for(int i = 0; i < m.getMulticonjunto().size(); i++) {
			this.multiconjunto.add(m.getMulticonjunto().get(i));
		}
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		LinkedList<Integer> lista2 = new LinkedList<Integer>();
		lista2.add(1);
		lista2.add(2);
		lista2.addFirst(3);
		
		System.out.println(lista.equals(lista2));
		lista.addAll(lista2);
		System.out.println(lista.equals(lista2));
		System.out.println(lista.get(0));
	}
}

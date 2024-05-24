package ex3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class MulticonjuntoTeste {
	
	
	
	
	
	@Test
	void TesteArrayList() {
		ArrayListMulticonjunto<Integer> lista = new ArrayListMulticonjunto<Integer>();
		ArrayListMulticonjunto<Integer> lista2 = new ArrayListMulticonjunto<Integer>();
		
		lista2.add(1);
		lista2.add(1);
		lista2.add(3);
		
		
		assertEquals(1, lista2.getMulticonjunto().get(0));
		assertEquals(1, lista2.getMulticonjunto().get(1));
		assertEquals(3, lista2.getMulticonjunto().get(2));
		
		
		
		lista.addAll(lista2);
		
		assertEquals(1, lista.getMulticonjunto().get(0));
		assertEquals(1, lista.getMulticonjunto().get(1));
		assertEquals(3, lista.getMulticonjunto().get(2));
		
		
		assertTrue(lista.equals(lista2));
	}
	
	@Test
	void TesteLinkedList() {
		LinkedListMulticonjunto<Integer> lista = new LinkedListMulticonjunto<Integer>();
		LinkedListMulticonjunto<Integer> lista2 = new LinkedListMulticonjunto<Integer>();
		
		
		lista2.add(1);
		lista2.add(1);
		lista2.add(3);
		
		
		assertEquals(1, lista2.getMulticonjunto().get(0));
		assertEquals(1, lista2.getMulticonjunto().get(1));
		assertEquals(3, lista2.getMulticonjunto().get(2));
		
		
		
		lista.addAll(lista2);
		
		assertEquals(1, lista.getMulticonjunto().get(0));
		assertEquals(1, lista.getMulticonjunto().get(1));
		assertEquals(3, lista.getMulticonjunto().get(2));
		
		
		assertTrue(lista.equals(lista2));
		
	}
	
	@Test
	void TesteStack() {
		StackMulticonjunto<Integer> lista = new StackMulticonjunto<Integer>();
		StackMulticonjunto<Integer> lista2 = new StackMulticonjunto<Integer>();
		
		
		lista2.add(1);
		lista2.add(1);
		lista2.add(3);
		
		
		assertEquals(1, lista2.getMulticonjunto().get(0));
		assertEquals(1, lista2.getMulticonjunto().get(1));
		assertEquals(3, lista2.getMulticonjunto().get(2));
		
		
		
		lista.addAll(lista2);
		
		assertEquals(1, lista.getMulticonjunto().get(0));
		assertEquals(1, lista.getMulticonjunto().get(1));
		assertEquals(3, lista.getMulticonjunto().get(2));
		
		
		assertTrue(lista.equals(lista2));
		
		
	}
	
}

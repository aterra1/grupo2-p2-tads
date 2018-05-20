package uy.edu.um.prog2.tad.tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeTest2 {

	@Test
	public void TestArbol() {
		
		MyTree<Integer, Integer> arbolTest = new MyTree<Integer, Integer>(3, 3);
		arbolTest.insert(4, 4, 3);
		arbolTest.insert(5, 5, 3);
		arbolTest.insert(6, 6, 4);
		arbolTest.insert(7, 7, 4);
		arbolTest.insert(8, 8, 5);
		
		arbolTest.delete(6);
		Integer a=4;
		
		assertEquals(a,arbolTest.find(4));
	}
}

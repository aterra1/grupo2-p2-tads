package uy.edu.um.prog2.tad.tree;

import uy.edu.um.prog2.tad.linkedlist.*;

public interface Tree<K, T> {
	
	public T find(K key);
	public void insert(K key, T data, K parentKey);
	public void delete(K key);
	public MyLinkedList<T> preorder();

}

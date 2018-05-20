package uy.edu.um.prog2.tad.tree;

import uy.edu.um.prog2.tad.linkedlist.*;

public class MyTree<K, T> implements Tree<K, T> {

	private Node<K, T> root;
	
	public MyTree(K key, T value){
		
		Node<K, T> originalRoot = new Node<K, T>(key, value);
		this.root = originalRoot;
	}
	
	public void insert(K key, T data, K parentKey) {
		
		Node<K, T> newLeaf = new Node<K, T>(key, data);
		Node<K, T> parent = root.findNode(parentKey);
		
		if(root == null || parent == null) {
			
			root = newLeaf;
		
		}else {
			
			if(parent.getLeftChild() == null) {
				
				parent.setLeftChild(newLeaf);
			
			}else {
				
				parent.setRightChild(newLeaf);
			}
		}
	}
	
	public T find(K key) {
		
		Node<K, T> nFound = root.findNode(key);
		T tFound = nFound.getData();
		
		return tFound;
	}

	public void delete(K key) {
		
		Node<K, T> nEliminate = root.findNode(key);
		if(nEliminate.getLeftChild() == null && nEliminate.getRightChild() == null) {
			
			Node<K, T> nParent = root.findParent(key);
			
			if(nParent.getLeftChild().equals(nEliminate)) {
				
				nParent.setLeftChild(null);
			
			}else {
				
				nParent.setRightChild(null);
			}
		}
	}
	
	public MyLinkedList<T> preorder(){
		
		return null;
	}

}

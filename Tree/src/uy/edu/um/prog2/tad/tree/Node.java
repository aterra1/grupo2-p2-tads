package uy.edu.um.prog2.tad.tree;

public class Node<K, T> {
	
	K key;
	T data;
	
	Node<K, T>leftChild;
	Node<K, T>rightChild;
	
	public Node(K key, T data) {
		
		this.key = key;
		this.data = data;
	}
	
	public Node<K, T> findNode(K key){
		
		Node<K, T> exit = null;
		
		if(getKey().equals(key)) {
			
			exit = this;
		
		}else if(getLeftChild() == null && getRightChild() == null) {
			
			exit = null;
			
		}else { 
			
			if(getLeftChild() != null) {
				
				exit = getLeftChild().findNode(key);
			}
			if(exit == null && getRightChild() != null) {
				
				exit = getRightChild().findNode(key);
			}
		}
		
		return exit;
	}
	
	public Node<K, T> findParent(K key){
		
		Node<K, T> parent = null;
		
		if(getLeftChild() == null && getRightChild() == null) {
			
			parent = null;
		
		}else if(getLeftChild().getKey().equals(key) || getRightChild().getKey().equals(key)){
		
			parent = this;
			
		}else { 
			
			if(getLeftChild() != null) {
				
				parent = getLeftChild().findParent(key);
			}
			
			if(parent == null && getRightChild() != null) {
				
				parent = getRightChild().findParent(key);
			}
		}
		
		return parent;
	} 
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public Node<K, T> getLeftChild() {
		return leftChild;
	}
	
	public void setLeftChild(Node<K, T> leftChild) {
		this.leftChild = leftChild;
	}
	
	public Node<K, T> getRightChild() {
		return rightChild;
	}
	
	public void setRightChild(Node<K, T> rightChild) {
		this.rightChild = rightChild;
	}
}

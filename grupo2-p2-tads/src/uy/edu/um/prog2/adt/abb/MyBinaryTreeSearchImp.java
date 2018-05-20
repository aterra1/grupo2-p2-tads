package uy.edu.um.prog2.adt.abb;

public class MyBinaryTreeSearchImp<K extends Comparable<K>, T> implements MyBinarySearchTree {
	private NodeBST raiz;
	
	public MyBinaryTreeSearchImp(Comparable key, T data) {
		raiz = new NodeBST(key, data);
	}
	@Override
	public T find(Comparable key) {
		if(raiz.findNode(key)!=null)
			return (T) raiz.findNode(key).getData();
		else 
			return null;
	}

	@Override
	public void insert(Comparable key, Object data) {
		raiz.insertNode(key, data);
	}

	@Override
	public void delete(Comparable key) {
		raiz.deleteNode(key);
	}

}

package uy.edu.um.prog2.adt.linkedlist;

public interface LinkedList<T> {

	public void addElement(Node oElement);
	
	public boolean checkEmpty();
	
	public void deleteElement(int nPosition);
	
	public T getElement(int nPosition);

}

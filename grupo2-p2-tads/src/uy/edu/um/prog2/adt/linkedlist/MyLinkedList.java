package uy.edu.um.prog2.adt.linkedlist;

public class MyLinkedList<T> implements LinkedList {

	private Node head;
	private Node tail;
	
	public MyLinkedList(Node head) {
		this.head = head;
	
	}
	
	
	public void addElement(Node oElement) {
		if(head == null) {
			head = oElement;
			
		}
		else {
			Node scope = head;
			Node mira = head;
			int x = 0;
			while(scope.getNext() != null) {
				scope = scope.getNext();
				x++;
			}
			scope.setNext(oElement);
			
			for(int i = 0; i<x-1; i++) {
				mira = mira.getNext();
			}
			scope.setPrevious(mira);
			tail = oElement;
		}
	}
		
		public boolean checkEmpty() {
			boolean check;
			if(head == null)
				check = true;
			else
				check = false;
			return check;
		}
		
		public T getElement(int nPosicion) {
			T dev = null;
			if(checkEmpty()== false) {
				Node scope = head;
				for(int x = 0; x < nPosicion; x++) {
					scope = scope.getNext();
					
				}
				dev = (T) scope.getValue();
				
				
			}
			return dev;
		}
		
		public void deleteElement(int nPosition){
			Node scope = head;
			Node newNext;
			Node newPrev;
			
			if(nPosition == 0 ) {
				head = head.getNext();
				
			}
			else {
				for(int x = 0; x < nPosition; x++) { 
					scope = scope.getNext();
				}
				newNext = scope.getNext();
				newPrev = scope.getPrevious();
				newNext.setPrevious(newPrev);
				newPrev.setNext(newNext);
				scope.setNext(null);
				scope.setPrevious(null);
				
				
			}
			
		}
	
		
}
	


package com.codingdojo.singlylikedlistproject;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    
    
    // adds a node to the list
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    
    // remove the last node
    public void remove() {
    	if(this.head == null) {
    		System.out.println("The list is empty");
    	}
    	if(this.head.next == null) {
    		this.head = null;
    		System.out.println("The list is now empty");
    	}
    	else {
    		System.out.println("inside else");
    		Node runner = this.head;
    		while(runner.next.next != null) {
    			runner = runner.next;
    		}
    		System.out.println("runner.next" + runner.next);
    		runner.next = null;
    		
    	}
    }
    
    public void printValues() {
    	if(this.head == null) {
    		System.out.println("The list is empty");
    	}
    	else {
    		Node runner = this.head;
    		while(runner != null) {
    			System.out.println(runner.value);
    			runner = runner.next;
    		}
    	}
    }
    
    public Node find(int val) {
    	Node runner = this.head;
    	if(this.head == null) {
    		System.out.println("The list is empty");
    		runner = null;
    	}

		while(runner != null) {
			if(runner.value == val) {
				System.out.println("value of found node " + runner.value);
				return runner;
			}
			runner = runner.next;			
		}  	
		return null;   	
    }
    
    public void removeAt(int value) {
    	if(this.head == null) {
    		System.out.println("The list is empty");
    	}
    	if(value == 0) {
    		this.head = this.head.next;
    	}
    	int position = 1;
    	Node beforeRunner = this.head;
    	Node runner = this.head.next;
    	while(runner != null) {
    		System.out.println("position is " + position);
    		if(position == value) {
    			System.out.println("Inside if");
    			beforeRunner.next = runner.next;
    		}
    		
    		beforeRunner = runner;
    		runner = runner.next;
    		position++;
    	}
    	
    }
}


package com.devendrabrain.linkedlist;

public class LinkedList_Devendra {

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public Node head;
	public int size = 0;

	public void addFront(int data) {

		Node newNode = new Node(data);

		// check if head is null
		if (head == null) {
			head = newNode;
			size++;
			return;
		}

		// if not
		newNode.next = head;
		head = newNode;
		size++;
	}

	public int getFirst() {
		return head.data;
	}

	public int getLast() {

		// check if head is empty
		if (head == null) {
			// throw exception
		}

		// only head node exist
		if (head.next == null) {
			return head.data;
		}

		// check if we have more than one node in list

		Node currentNode = head;

		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		// We are at the tail
		return currentNode.data;
	}

	public void addBack(int data) {

		Node newNode = new Node(data);

		// check if list null
		if (head == null) {
			head = newNode;
			size++;
			return;
		}

		// if not
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		currentNode.next = newNode;
		size++;
	}

	public int size() {
		
		if (head == null) {
			return 0;
		}

		int count = 1;
		Node current = head;

		while (current.next != null) {
			current = current.next;
			count++;
		}

		return count;
	}

	public void clear() {

		head = null;
	}

	public void deleteValue(int data) {

		if (head == null) {
			// throw exception
			return;
		}

		if (head.data == data) {
			head = head.next;
			return;
		}

		// if not
		Node currentNode = head;
		/*
		 * Node previousNode = null;
		 * 
		 * while (currentNode.next != null) {
		 * 
		 * if (currentNode.data == data) { if (previousNode == null) { head =
		 * currentNode.next; break; } else {
		 * 
		 * previousNode.next = currentNode.next; break; } } previousNode = currentNode;
		 * currentNode = currentNode.next; }
		 */

		while (currentNode.next != null) {
			if (currentNode.next.data == data) {
				currentNode.next = currentNode.next.next;
				return;
			}
			currentNode = currentNode.next;
		}
	}

	public void print() {

		Node currentHead = head;
		while (currentHead.next != null) {
			System.out.println(currentHead.data);
			currentHead = currentHead.next;
		}
	}

}

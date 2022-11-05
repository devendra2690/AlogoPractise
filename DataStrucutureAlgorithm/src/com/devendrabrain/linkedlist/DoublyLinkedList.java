package com.devendrabrain.linkedlist;

public class DoublyLinkedList {

	public class Node {
		int data;
		Node previous;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public Node head;

	public void addFront(int data) {

		Node currentNode = new Node(data);

		if (head == null) {

			head = currentNode;
			return;
		} else {

			currentNode.next = head;
			head.previous = currentNode;
			head = currentNode;
		}
	}

	public Integer getFirst() {
		return head.data;
	}

	public Integer getLast() {

		// We are at the tail
		if (head != null && head.next == null) {
			return head.data;
		}

		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		return currentNode.data;
	}

	public Integer getNext(int data) {

		if (head == null) {
			// throw exception
			return null;
		}

		if (head.next == null) {
			return head.data;
		}

		Node currentNode = head;
		while (currentNode.next != null) {
			if (currentNode.data == data) {
				return currentNode.next.data;
			}
		}

		return null;
	}

	public Integer getPrevious(int data) {

		if (head == null) {
			// throw exception
			return null;
		}

		if (head.next == null) {
			return head.data;
		}

		Node currentNode = head;
		while (currentNode.next != null) {
			if (currentNode.data == data) {
				return currentNode.previous.data;
			}
		}

		return null;
	}

	public void addBack(int data) {

		Node currentNewNode = new Node(data);

		if (head == null) {
			head = currentNewNode;
		}

		Node currentNode = head;

		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		currentNode.next = currentNewNode;
		currentNewNode.previous = currentNode;
	}

	public int size() {

		if (head == null) {
			return 0;
		}

		if (head.next == null) {
			return 1;
		}

		Node currentNode = head;
		int size = 0;
		while (currentNode.next != null) {
			size++;
		}

		return size;
	}

	public void clear() {
		head = null;
	}

	public void deleteValue(int data) {

		if (head == null) {
			return;
		}

		if (head.next != null && head.data == data) {
			head = null;
		}

		Node currentNode = head;
		while (currentNode.next != null) {
			if (currentNode.data == data) {
				currentNode.previous.next = currentNode.next;
				currentNode.next.previous = currentNode.previous;
				return;
			}
		}
	}

	public void print() {

		if (head == null) {
			return;
		}
		if (head.next == null) {
			System.out.println(head.data);
		}

		Node currentNode = head;
		while (currentNode.next != null) {
			System.out.println(currentNode.data);
		}

		System.out.println("");
	}

}

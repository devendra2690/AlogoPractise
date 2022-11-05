package com.devendrabrain.arrays;

public class CustomArray {

	private Object[] data;

	// Counter for the number of elements in our array
	private int size = 0;

	// The capacity of our array - or how many elements it can hold.
	// What we double when the number of elements exceeds the capacity of the array.
	private int initialCapacity;

	public CustomArray(int initialCapacity) {
		this.initialCapacity = initialCapacity;
		data = new Object[initialCapacity];
	}

	public Object get(int index) {
		return data[index];
	}

	public void set(int index, String value) {

		// check index
		if (index > data.length - 1) {
			resize();
		}
		// insert value
		data[index] = value;
		size++;

	}

	public void insert(int index, String value) {

		// check index
		if (index > data.length - 1) {
			resize();
		}

		// insert value
		data[index] = value;
		size++;
	}

	private void resize() {

		Object[] tempData = new Object[data.length + initialCapacity];
		for (int i = 0; i < data.length; i++) {
			tempData[i] = data[i];
		}
		data = tempData;
	}

	public int size() {
		return size;
	}

	public void print() {
		for (int index = 0; index < data.length; index++) {
			System.out.println(data[index]);
		}
	}

	// Some array implementations offer methods like insert (also known as
	// pushBack).
	// Which is like insert, only in does the insert at the end of the array.
	public void add(String value) {
		if (size == data.length - 1) {
			resize();
		}
		data[size + 1] = value;
	}

	public void delete(int index) {

		if (index > data.length) {
			// throw exception
		}

		for (int objIndex = index; objIndex < size; objIndex++) {
				data[objIndex] = data[objIndex + 1];
		}
		
		// Clear last element of array
        data[size - 1] = null;		
		size--;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean Contains(String value) {

		for (int index = 0; index < size; index++) {
			if (data[index] == value) {
				return true;
			}
		}
		return false;
	}

}

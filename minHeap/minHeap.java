/**
 * Cristian De Los Rios
 * CSC102
 * Dr.Hawthorne 
*/

package minHeap;
public class minHeap<E extends Comparable> {
private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

// Creates a default heap
public minHeap() {
} // End of default minHeap

// Creates a heap from an array of objects
public minHeap(E[] objects) {
	for (int i = 0; i < objects.length; i++)
		add(objects[i]); // Calling method add
} // End of minHeap

// Adds a new object into the heap
public void add(E newObject) {
	list.add(newObject); // Appends to the heap
	int currentIndex = list.size() - 1; // The index of the last node

	// Checks if the currentIndex is greater than zero
	while (currentIndex > 0) {
		int parentIndex = (currentIndex - 1) / 2;

		// Swaps if the current object is less than its parent
		if(list.get(currentIndex).compareTo(list.get(parentIndex)) < 0) {
			E temp = list.get(currentIndex);
			list.set(currentIndex, list.get(parentIndex));
			list.set(parentIndex, temp);
		} // End of if(list.get(currentIndex).compareTo(list.get(parentIndex)) < 0) {
		else
			break; // The tree is a heap nows
			currentIndex = parentIndex;
	} // End of while(currentIndex > 0) {
} // End of add

// The method nodeAt returns the element at the index position
public E nodeAt(int i) {
	return list.get(i); // Returns the element at index i
} // End of nodeAt

// Removes the root from the heap
public E remove() {
	if (list.size() == 0)
		return null;
		E removedObject = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.remove(list.size() - 1);

		int currentIndex = 0;
		while(currentIndex < list.size()) {
			int leftChildIndex = 2 * currentIndex + 1;
			int rightChildIndex = 2 * currentIndex + 2;

			// Finds the maximum between two children
			if (leftChildIndex >= list.size())
				break; // The tree is a heap
				int maxIndex = leftChildIndex;
			if (rightChildIndex < list.size()) {
				if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) {
					maxIndex = rightChildIndex;
				} // End of if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) {
			} // End of if (rightChildIndex < list.size()) {

			// Swaps if the current node is less than the maximum
			if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) {
				E temp = list.get(maxIndex);
				list.set(maxIndex, list.get(currentIndex));
				list.set(currentIndex, temp);
				currentIndex = maxIndex;
			} // End of if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) {
			else
				break; // The tree is a heap
		} // End of while(currentIndex < list.size()) {

		return removedObject;
} // End of remove

// Gets the number of nodes in the tree
public int getSize() {
	return list.size(); // Returns the size of the array list
	} // End of getSize
} // End of class minHeap
/**
 * Cristian De Los Rios
 * CSC102
 * Dr.Hawthorne 
*/



package minHeap;

public class Heap {
public static void main(String[] args) { 
	
// Creates list of integer values
Integer[] nodes = new Integer[] {-45, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};

minHeap<Integer> heap = new minHeap<Integer> (nodes);
System.out.println("\nMinimum Heap Sorting");

// Print sorted Heap
for (int i = 0; i < heap.getSize(); i++)
	System.out.print(heap.nodeAt(i) + " ");
} 
} 
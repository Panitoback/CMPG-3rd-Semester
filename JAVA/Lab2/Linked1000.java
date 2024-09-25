import java.util.LinkedList;

public class Linked1000 { // for 10000, 100000 and 1000000 just replace values
    public static void main(String[] args) {
        int size = 1000;
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Fill the linked list with integers
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }

        // Reading by index (reading the last element)
        long startTime = System.nanoTime();
        int valueAtIndex = linkedList.get(size - 1); // Read last element
        long endTime = System.nanoTime();
        System.out.println("Time taken to read by index: " + (endTime - startTime) + " nanoseconds");

        // Searching by value (search for value 999)
        startTime = System.nanoTime();
        boolean found = linkedList.contains(999); // Search by value
        endTime = System.nanoTime();
        System.out.println("Time taken to search by value: " + (endTime - startTime) + " nanoseconds");

        // Insertion at the head
        startTime = System.nanoTime();
        linkedList.addFirst(1001); // Insert at the head
        endTime = System.nanoTime();
        System.out.println("Time taken to insert at the head: " + (endTime - startTime) + " nanoseconds");

        // Insertion in the middle
        startTime = System.nanoTime();
        int mid = size / 2;
        linkedList.add(mid, 1002); // Insert in the middle
        endTime = System.nanoTime();
        System.out.println("Time taken to insert in the middle: " + (endTime - startTime) + " nanoseconds");

        // Insertion at the tail
        startTime = System.nanoTime();
        linkedList.addLast(1003); // Insert at the tail
        endTime = System.nanoTime();
        System.out.println("Time taken to insert at the tail: " + (endTime - startTime) + " nanoseconds");

        // Deletion from the head
        startTime = System.nanoTime();
        linkedList.removeFirst(); // Delete from the head
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from the head: " + (endTime - startTime) + " nanoseconds");

        // Deletion from the middle
        startTime = System.nanoTime();
        linkedList.remove(mid); // Delete from the middle
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from the middle: " + (endTime - startTime) + " nanoseconds");

        // Deletion from the tail
        startTime = System.nanoTime();
        linkedList.removeLast(); // Delete from the tail
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from the tail: " + (endTime - startTime) + " nanoseconds");
    }
}

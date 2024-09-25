import java.util.ArrayList;

public class ArrayList1000 { // for 10000, 100000 and 1000000 just replace values
    public static void main(String[] args) {
        int size = 1000;
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Fill the array list with integers
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }

        // Reading by index (reading the last element)
        long startTime = System.nanoTime();
        int valueAtIndex = arrayList.get(size - 1); // Read last element
        long endTime = System.nanoTime();
        System.out.println("Time taken to read by index: " + (endTime - startTime) + " nanoseconds");

        // Searching by value (search for value 999)
        startTime = System.nanoTime();
        boolean found = arrayList.contains(999); // Search by value
        endTime = System.nanoTime();
        System.out.println("Time taken to search by value: " + (endTime - startTime) + " nanoseconds");

        // Insertion at the head
        startTime = System.nanoTime();
        arrayList.add(0, 1001); // Insert at the head
        endTime = System.nanoTime();
        System.out.println("Time taken to insert at the head: " + (endTime - startTime) + " nanoseconds");

        // Insertion in the middle
        startTime = System.nanoTime();
        int mid = size / 2;
        arrayList.add(mid, 1002); // Insert in the middle
        endTime = System.nanoTime();
        System.out.println("Time taken to insert in the middle: " + (endTime - startTime) + " nanoseconds");

        // Insertion at the tail
        startTime = System.nanoTime();
        arrayList.add(1003); // Insert at the tail
        endTime = System.nanoTime();
        System.out.println("Time taken to insert at the tail: " + (endTime - startTime) + " nanoseconds");

        // Deletion from the head
        startTime = System.nanoTime();
        arrayList.remove(0); // Delete from the head
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from the head: " + (endTime - startTime) + " nanoseconds");

        // Deletion from the middle
        startTime = System.nanoTime();
        arrayList.remove(mid); // Delete from the middle
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from the middle: " + (endTime - startTime) + " nanoseconds");

        // Deletion from the tail
        startTime = System.nanoTime();
        arrayList.remove(arrayList.size() - 1); // Delete from the tail
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from the tail: " + (endTime - startTime) + " nanoseconds");
    }
}

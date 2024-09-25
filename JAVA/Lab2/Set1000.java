import java.util.HashSet;
import java.util.Set;

public class Set1000 { // for 10000, 100000 and 1000000 just replace values
    public static void main(String[] args) {
        int size = 1000;
        Set<Integer> set = new HashSet<>();

        // Fill the set with integers
        for (int i = 0; i < size; i++) {
            set.add(i);
        }

        // Reading by value (searching for value 999)
        long startTime = System.nanoTime();
        boolean found = set.contains(999);  // Search by value
        long endTime = System.nanoTime();
        System.out.println("Time taken to search by value: " + (endTime - startTime) + " nanoseconds");

        // Insertion (since set does not have a head, middle, or tail concept, we will just add)
        startTime = System.nanoTime();
        set.add(1001);  // Insert a new value
        endTime = System.nanoTime();
        System.out.println("Time taken to insert: " + (endTime - startTime) + " nanoseconds");

        // Deletion (removing a specific value)
        startTime = System.nanoTime();
        set.remove(999);  // Remove a value
        endTime = System.nanoTime();
        System.out.println("Time taken to delete a value: " + (endTime - startTime) + " nanoseconds");
    }
}

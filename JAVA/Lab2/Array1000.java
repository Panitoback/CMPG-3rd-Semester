import java.util.Arrays;

public class Array1000 { // for 10000, 100000 and 1000000 just replace values
    public static void main(String[] args) {
        int size = 1000;
        int[] array = new int[size];

        // Fill the array with integers
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        // Reading by index
        long startTime = System.nanoTime();
        int valueAtIndex = array[size - 1];  // Read last element
        long endTime = System.nanoTime();
        System.out.println("Time taken to read by index: " + (endTime - startTime) + " nanoseconds");

        // Search by value (value 999)
        startTime = System.nanoTime();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == 999) { //  for 10000, 100000 and 1000000 just replace values
                found = true;
                break;
            }
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to search by value: " + (endTime - startTime) + " nanoseconds");

        // Insertion at the head
        startTime = System.nanoTime();
        int[] newArray = new int[size + 1];
        newArray[0] = 1001;  // Insertion at the head ,  for 10000, 100000 and 1000000 just replace values
        System.arraycopy(array, 0, newArray, 1, size);  // Copy the rest of the array
        endTime = System.nanoTime();
        System.out.println("Time taken to insert at the head: " + (endTime - startTime) + " nanoseconds");

        // Insertion in the middle
        startTime = System.nanoTime();
        int mid = size / 2;
        int[] newArrayMid = new int[size + 1];
        System.arraycopy(array, 0, newArrayMid, 0, mid);  // Copy first half
        newArrayMid[mid] = 1001;  // Insert in the middle ,  for 10000, 100000 and 1000000 just replace values
        System.arraycopy(array, mid, newArrayMid, mid + 1, size - mid);  // Copy second half
        endTime = System.nanoTime();
        System.out.println("Time taken to insert in the middle: " + (endTime - startTime) + " nanoseconds");

        // Insertion at the tail
        startTime = System.nanoTime();
        int[] newArrayTail = Arrays.copyOf(array, size + 1);
        newArrayTail[size] = 1001;  // Insert at the end ,  for 10000, 100000 and 1000000 just replace values
        endTime = System.nanoTime();
        System.out.println("Time taken to insert at the tail: " + (endTime - startTime) + " nanoseconds");

        // Deletion from the head
        startTime = System.nanoTime();
        int[] arrayAfterDeleteHead = new int[size - 1];
        System.arraycopy(array, 1, arrayAfterDeleteHead, 0, size - 1);  // Copy except the first element
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from the head: " + (endTime - startTime) + " nanoseconds");

        // Deletion from the middle
        startTime = System.nanoTime();
        int[] arrayAfterDeleteMid = new int[size - 1];
        System.arraycopy(array, 0, arrayAfterDeleteMid, 0, mid);  // Copy first half
        System.arraycopy(array, mid + 1, arrayAfterDeleteMid, mid, size - mid - 1);  // Copy second half
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from the middle: " + (endTime - startTime) + " nanoseconds");

        // Deletion from the tail
        startTime = System.nanoTime();
        int[] arrayAfterDeleteTail = Arrays.copyOf(array, size - 1);  // Copy except the last element
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from the tail: " + (endTime - startTime) + " nanoseconds");
    }
}

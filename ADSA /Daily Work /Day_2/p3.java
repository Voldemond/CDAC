package Day_2;

public class p3{

    // Insert function to add element to array
    static int insert(int arr[], int size, int key, int capacity) {
        if (size >= capacity) {
            System.out.println("Array is full!");
            return size;
        }
        arr[size] = key; // Add the key at the current size index
        return size + 1; // Return the new size of the array
    }

    // Search function to find the index of an element
    static int search(int arr[], int size, int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i; // Return index if key is found
            }
        }
        return -1; // Element not found
    }

    // Delete function to remove an element from the array
    static int delete(int arr[], int size, int key) {
        int pos = search(arr, size, key); // Find the index of the key
        if (pos == -1) {
            System.out.println("Not Found");
            return size; // If key not found, return the same size
        }
        // Shift elements to the left
        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return size - 1; // Return new size of the array after deletion
    }

    public static void main(String args[]) {
        int a1[] = new int[100];
        int size = 10;

        // Initialize the array
        a1[0] = 9;
        a1[1] = 74;
        a1[2] = 11;
        a1[3] = 89;
        a1[4] = 54;
        a1[5] = 76;
        a1[6] = 11;
        a1[7] = 16;
        a1[8] = 76;
        a1[9] = 99;

        // Display initial array
        for (int i = 0; i < size; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println();

        // Search for key 99
        int key = 99;
        int pos = search(a1, size, key);

        if (pos != -1) {
            System.out.println("Found at index: " + pos);
        } else {
            System.out.println("Not Found");
        }

        // Insert new key 111
        key = 111;
        size = insert(a1, size, key, 100); // Ensure the size is updated

        // Display the array after insertion
        System.out.println("Array after insertion:");
        for (int i = 0; i < size; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println();

        // Delete key 76
        key = 76;
        size = delete(a1, size, key);

        // Display the array after deletion
        System.out.println("Array after deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println();
    }
}

package BinarySearch;

/**
 * This class implements the Binary Search algorithm.
 *
 * Binary Search is an efficient algorithm for searching a sorted array by
 * repeatedly dividing the search interval in half. It has a time complexity
 * of O(log n), making it much faster than linear search for large datasets.
 */
public class BinarySearch {

    /**
     * The main method to demonstrate the usage of the binarySearch method.
     *
     * @param args Command line arguments (not used in this implementation)
     */
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Test case 1: Searching for a value present in the array
        int result1 = binarySearch(sortedArray, 9);
        System.out.println("Index of 9: " + result1);  // Expected output: 8

        // Test case 2: Searching for a value not present in the array
        int result2 = binarySearch(sortedArray, 11);
        System.out.println("Index of 11: " + result2);  // Expected output: -1
    }

    /**
     * Performs a binary search on the given sorted array to find the specified key.
     *
     * @param arr The sorted array to search in
     * @param key The value to search for
     * @return The index of the key if found, -1 otherwise
     */
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Calculate the middle index
            // Using (left + right) / 2 can lead to integer overflow for large arrays
            int mid = left + (right - left) / 2;

            // Check if the key is present at the middle
            if (arr[mid] == key) {
                return mid;
            }

            // If the key is greater, ignore the left half
            if (arr[mid] < key) {
                left = mid + 1;
            }
            // If the key is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Key was not found in the array
        return -1;
    }
}
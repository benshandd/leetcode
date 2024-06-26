package org.example;

class BinarySearch {
    private final int[] array;
    private final int target;

    public BinarySearch(int size, int target) {
        this.target = target;
        this.array = new int[size];

        //Populate array
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        int result = binarySearch();

        if (result == -1) {
            System.out.println("Target " + target + " not found in the array.");
        } else {
            System.out.println("Target found at index " + result);
        }
    }

    private int binarySearch() {
        int low = 0;
        int high = array.length - 1;
        int iteration = 0;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            System.out.println("Iteration " + iteration + ": Middle index = " + middle);
            iteration++;

            if (array[middle] == target) {
                return middle;
            }
            if (array[middle] < target) { //Search right
                low = middle + 1;
            } else { //Search left
                high = middle - 1;
            }
        }
        return -1; // Not found
    }
}

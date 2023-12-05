package org.example.hw22;
public class SortingBenchmark {
    public static void runBenchmark(int[] array) {
        long bubbleSortTime = measureAndPrintTime("Bubble Sort", () -> bubbleSort(array.clone()));
        long quickSortTime = measureAndPrintTime("Quick Sort", () -> quickSort(array.clone(), 0, array.length - 1));

        String fasterAlgorithm = (bubbleSortTime < quickSortTime) ? "Bubble Sort" : "Quick Sort";
        System.out.println(fasterAlgorithm + " is faster.");
    }

    private static long measureAndPrintTime(String algorithmName, Runnable algorithm) {
        long startTime = System.nanoTime();
        algorithm.run();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Time for " + algorithmName + ": " + elapsedTime + " ns");
        return elapsedTime;
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
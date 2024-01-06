package DataModel.src.hw22;
public class SortingBenchmark {
    public static void runBenchmark(int[] array) {
        SortingAlgorithm bubbleSortAlgorithm = SortingBenchmark::bubbleSort;
        SortingAlgorithm quickSortAlgorithm = (arr) -> quickSort(arr, 0, arr.length - 1);

        long bubbleSortTime = measureAndPrintTime(bubbleSortAlgorithm, array.clone());
        long quickSortTime = measureAndPrintTime(quickSortAlgorithm, array.clone());

        String fasterAlgorithm = (bubbleSortTime < quickSortTime) ? "Bubble Sort" : "Quick Sort";
        System.out.println(fasterAlgorithm + " is faster.");
    }

    private static long measureAndPrintTime(SortingAlgorithm algorithm, int[] array) {
        long startTime = System.nanoTime();
        algorithm.sort(array);
        long endTime = System.nanoTime();
        return endTime - startTime;
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
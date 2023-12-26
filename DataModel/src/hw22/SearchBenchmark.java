package DataModel.src.hw22;
public class SearchBenchmark {

    public static void runBenchmark(int[] array, int target) {
        long linearSearchTime = measureAndPrintTime(SearchBenchmark::linearSearch, array, target);
        long binarySearchTime = measureAndPrintTime(SearchBenchmark::binarySearch, array, target);
        long quickSearchTime = measureAndPrintTime((arr, t) -> quickSearchRecursive(arr, t, 0, arr.length - 1), array, target);



        String fastestAlgorithm = findFastestAlgorithm(linearSearchTime, binarySearchTime, quickSearchTime);
        System.out.println(fastestAlgorithm + " is faster.");
    }

    private static String findFastestAlgorithm(long linearSearchTime, long binarySearchTime, long quickSearchTime) {
        if (linearSearchTime <= binarySearchTime && linearSearchTime <= quickSearchTime) {
            return "Linear Search";
        } else if (binarySearchTime <= linearSearchTime && binarySearchTime <= quickSearchTime) {
            return "Binary Search";
        } else {
            return "Quick Search";
        }
    }

    private static long measureAndPrintTime( SearchAlgorithm algorithm, int[] array, int target) {
        long startTime = System.nanoTime();
        algorithm.search(array, target);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    private static void linearSearch(int[] array, int target) {
        for (int j : array) {
            if (j == target) {
                return;
            }
        }
    }

    private static void binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

    private static boolean quickSearchRecursive(int[] array, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return true;
            } else if (array[mid] < target) {
                return quickSearchRecursive(array, target, mid + 1, high);
            } else {
                return quickSearchRecursive(array, target, low, mid - 1);
            }
        }

        return false;
    }
}
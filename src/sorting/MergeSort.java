package sorting;

/**
 * Merge sort operation.
 */
public class MergeSort extends AbstractSorter {

    @Override
    public void sort(Integer[] numbers) {
        mergeSort(numbers, 0, numbers.length - 1);
    }

    private static void mergeSort(Integer[] numere, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(numere, left, mid);
            mergeSort(numere, mid + 1, right);
            merge(numere, left, mid, right);
        }
    }

    private static void merge(Integer[] numere, int st, int mid, int dr) {
        int n1 = mid - st + 1;
        int n2 = dr - mid;

        Integer[] left = new Integer[n1];
        Integer[] right = new Integer[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = numere[st + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = numere[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = st;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                numere[k] = left[i];
                i++;
            }
            else {
                numere[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            numere[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            numere[k] = right[j];
            j++;
            k++;
        }
    }
}

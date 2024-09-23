package algorithm.sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 1, 8, 6, 9, 4};
        
        sort(arr);
        for (int i : arr) System.out.printf("%d, ", i);
    }

    private static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (end < start) return;
        int left = start, right = end - 1, pivot = end;

        while (left <= right) {
            while (left <= end && arr[left] < arr[pivot]) left++;
            while (right >= start && arr[right] > arr[pivot]) right--;

            int temp;
            if (right < left) {
                temp = arr[pivot];
                arr[pivot] = arr[left];
                arr[left] = temp;
            } else {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        quickSort(arr, start, right);
        quickSort(arr, left + 1, end);
    }
}

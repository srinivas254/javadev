package in.pbst;

public class problem12 {

    public static long countInversions(int[] arr) {
        int[] temp = new int[arr.length]; 
        return mergeSortAndCount(arr, temp, 0, arr.length - 1);
    }

    private static long mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        long inversions = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            inversions += mergeSortAndCount(arr, temp, left, mid); 
            inversions += mergeSortAndCount(arr, temp, mid + 1, right); 
            inversions += mergeAndCount(arr, temp, left, mid, right); 
        }
        return inversions;
    }

    private static long mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
      
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;
        int j = mid + 1; 
        int k = left; 
        long inversions = 0;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
                inversions += (mid - i + 1);
            }
        }

        while (i <= mid) {
            arr[k++] = temp[i++];
        }

        while (j <= right) {
            arr[k++] = temp[j++];
        }
        return inversions;
    }

    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        long inversionCount = countInversions(arr);
        System.out.println("Number of inversions: " + inversionCount);
    }
}


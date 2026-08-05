public class KthLargest {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Kth largest element: " + arr[k - 1]);
    }
    static void mergeSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int index = 0;

        while (i <= mid && j <= right) {

            if (arr[i] > arr[j]) {
                temp[index] = arr[i];
                i++;
            } else {
                temp[index] = arr[j];
                j++;
            }

            index++;
        }

        while (i <= mid) {
            temp[index] = arr[i];
            i++;
            index++;
        }

        while (j <= right) {
            temp[index] = arr[j];
            j++;
            index++;
        }

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }
}
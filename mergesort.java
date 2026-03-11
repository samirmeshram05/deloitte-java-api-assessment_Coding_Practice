public class mergesort {

    public static void merge(int arr[], int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++) {
            a[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            b[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {

            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = a[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = b[j];
            j++;
            k++;
        }
    }

    public static void mergesort(int arr[], int l, int r) {

        if (l < r) {

            int mid = (l + r) / 2;

            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {

        int arr[] = {5, 4, 3, 2, 1};

        mergesort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class J {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int p = i - 1;
            while (p >= 0 && arr[p] > key) {
                arr[p + 1] = arr[p];
                p--;

            }
            arr [p+1]=key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 4, 5, 1, 2 };
        insertionSort(arr);
    }
}

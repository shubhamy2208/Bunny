package Twopointertechnique;

public class reversearray {
    public static void main(String[] args) {
        int arr[] = {6, 7, 8, 9, 0, 5, 78};
        int n = arr.length;

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
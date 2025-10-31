package search;
class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;

        // Use long to avoid overflow
        long totalSum = (long) n * (n + 1) / 2;
        long arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += (long) arr[i];
        }

        return (int) (totalSum - arrSum);
    }
}

public class missingarr {
    public static void main(String[] args) {
        // Hardcoded array (1..5 missing 3)
        int[] arr = {1, 2, 4, 5};

        Solution sol = new Solution();
        int missing = sol.missingNum(arr);

        System.out.println("Missing Number is: " + missing);
    }
}

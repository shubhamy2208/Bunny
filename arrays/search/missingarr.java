/*You are given an array arr[] of size n - 1 that contains distinct
 integers in the range from 1 to n (inclusive). This array represents
  a permutation of the integers from 1 to n with one element missing. 
  Your task is to identify and return the missing element.
 */
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
       
        int[] arr = {1, 2, 4, 5};

        Solution sol = new Solution();
        int missing = sol.missingNum(arr);

        System.out.println("Missing Number is: " + missing);
    }
}

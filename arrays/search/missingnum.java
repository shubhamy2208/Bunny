// leetcode
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 
package search;
public class missingnum {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long totalSum = (long) n * (n + 1) / 2; // sum of 0..n
        long arrSum = 0;

        for (int num : nums) {
            arrSum += (long) num;
        }

        return (int) (totalSum - arrSum);
    }

    // Main method for local testing
    public static void main(String[] args) {
        // Hardcoded array
        int[] nums = {3, 0, 1};
        
        Solution sol = new Solution();
        int missing = sol.missingNum(nums);
        System.out.println("Missing number is: " + missing); // Output: 2
    }
}

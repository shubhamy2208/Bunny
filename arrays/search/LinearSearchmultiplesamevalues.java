package search;

public class LinearSearchmultiplesamevalues {
    public static void main(String[] args) {
        int arr []= {23,45,65,1,65,34};
        int target= 65;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Target not found in the array");
        }
    }
}

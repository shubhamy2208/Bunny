import java.util.Arrays;

public class sortarraybuildin {
    public static void main(String[] args) {
        //sort ascending order
        int arr []={34,3,45,23,1,-6};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    private static void print(int[] arr) {
      for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      };
      System.out.println();
        
    }
}

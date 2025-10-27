public class sum_array {

    public static void main(String[] args) {
        int arr[]= {4,5,6,77,3};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum = sum +arr[i];
        };
    System.out.print("the sum of the array is : "+ sum);
    }
}
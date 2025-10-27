public class prod_array {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6};
        int product = 1 ;
        for (int i =0;i<arr.length ;i++){
            product = product* arr[i];
        };
        System.out.print("the product of the array is :"+product);

    }
}

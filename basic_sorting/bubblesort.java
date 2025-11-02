package basic_sorting;

public class bubblesort {
    public static void printkar(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2,0,2};
        int n = arr.length;
        printkar(arr);
        System.out.println();
       for(int j =0;j<n-1;j= j+1){
         for(int i=0;i<n-1-j;i=i+1){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]=temp;
            }
        }
       }
        printkar(arr);
    }
    
}

import java.util.Scanner;

public class printnegative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int n = sc.nextInt();
        int arr[]= new int [n];

        //input liya yaha se
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the element of arr: ");
            arr[i]= sc.nextInt();
        };

        //output ke liye
         for(int i=0;i<arr.length;i++){
            //if condition se negative value output print ke liye 
            if(arr[i]<0){
            System.out.print(arr[i]+" ");
            }
        };
    }
}

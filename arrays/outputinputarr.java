import java.util.Scanner;

public class outputinputarr{
    public static void main(String[] args) {
        //scanner input lene ke liye 
        Scanner sc = new Scanner(System.in);
        // int arr[]={5,6,4,7,9};
        // //arr.length lenght check karne ke liye 
        // int n= arr.length;   // 0 to n-1 tak index 
        // //basic output technique
        // // System.out.println(arr[0]);
        // // System.out.println(arr[1]);
        // // System.out.println(arr[2]);
        // // System.out.println(arr[3]);
        // // System.out.println(arr[4]);

        // // using loops jo ek baar me sab output values print kar sakte hai 
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+ " ");
        // };

       
        int inp[]= new int [7];

          // input lene ka tarika wo bhi loops se hi hoga 
          for(int i=0;i<inp.length;i++){
            inp[i]=sc.nextInt();
          };
          //output print karne ke liye 

           for(int i=0;i<inp.length;i++){
            System.out.print(inp[i]+ " ");
          }
  }
}
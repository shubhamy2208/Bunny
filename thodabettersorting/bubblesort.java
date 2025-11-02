package thodabettersorting;
/*Array: {1, 2, 3, 4, 5} (already sorted)
1st pass ke time koi bhi if (arr[i] > arr[i+1]) true nahi hoga →
koi swapping nahi hogi → swap 0 hi rahega.
if (swap == 0) true ho jaayega → loop se break ho jaayega.
💨 Result: Sorting ek hi pass me ruk jaati hai — optimized sorting 
Agar swap variable nahi hota, to har case me outer loop n-1 times chalta rahega,
chahe array already sorted ho ya nahi → extra time waste hota hai  */

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

        //bubble sort optimized
       for(int j =0;j<n-1;j= j+1){ //n-1 tak jayega
        int swap=0;
            for(int i=0;i<n-1-j;i=i+1){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]=temp;
                    swap++;
                }
            }
            if(swap==0) break;
       }
        printkar(arr);
    }
    
}


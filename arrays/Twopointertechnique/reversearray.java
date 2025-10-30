package Twopointertechnique;

public class reversearray {
    public static void main(String[] args) {
        int arr[]={6,7,8,9,0,5};
        int n = arr.length;
        int i=0,j=n-1;
        //while loop for reversing the array 
        while (i<j) {
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        for(int ele:arr) System.out.print(ele+" ");
    }
}

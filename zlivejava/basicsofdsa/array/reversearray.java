package zlivejava.basicsofdsa.array;

public class reversearray {
    public static void main(String[] args) {
         int arr[]={34,45,43,23,12,76,8};// array 

       
        int n = arr.length;
         int i=0;
        int j =n-1;
    
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    for (int ele : arr) {
        System.out.print(ele +" ");
        
    }
   
}
}



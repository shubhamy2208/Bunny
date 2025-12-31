package zlivejava.basicsofdsa.array;

public class secondlargest {
    public static void main(String[] args) {
        int arr[]={34,45,43,23,12,76,8};// array 

    int max = Integer.MIN_VALUE;
    int smax = Integer.MIN_VALUE;

    //calculate max element of the array 
    for(int i=0;i<arr.length;i++){
        if (arr[i]>max){
            max = arr[i];
        }
    }

    // calculate secondmax using loops
    for(int j =0;j<arr.length;j++){
        if (arr[j]>smax && arr[j]!= max){
            smax = arr[j];
        }
    }
    System.out.println(smax);

    }
    
}


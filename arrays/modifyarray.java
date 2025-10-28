public class modifyarray {
    public static void main(String[] args) {
        int arr[]= {34,45,6,57,7};
        print(arr);
        
    }

    private static void print(int[] arr) {
      for (int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            arr[i]=arr[i]*2;
        }
        else{
            arr[i]=arr[i]+10;
        }
        System.out.print(arr[i]+" ");
      };
      
    }
}

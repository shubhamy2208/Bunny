public class findmaxvalueofarray {
    public static void main(String[] args) {
        int arr []={45,56,3,4,57,90,23};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
           
        }
         System.out.print(max);

    }
}

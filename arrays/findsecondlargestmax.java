public class findsecondlargestmax {
    public static void main(String[] args) {
        int arr[]= {45,45};
        secondmax(arr);
        System.out.println(secondmax(arr));
    }

    private static int secondmax(int[] arr) {
        int max =0;
        int smax=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]>smax&&arr[j]!=max){
                smax=arr[j];
            }
        }
        if(smax==0){
            return -1;
        }
        return smax;
        
    }
}

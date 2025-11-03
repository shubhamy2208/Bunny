public class findsecondlargestmax {
    public static void main(String[] args) {
        int arr[]= {45,56,43,22,56,98,97};
        secondmax(arr);
        System.out.println(secondmax(arr));
    }

    private static int secondmax(int[] arr) {
        int max =Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

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
        if(smax==Integer.MIN_VALUE){
            return -1;
        }
        return smax;
        
    }
}

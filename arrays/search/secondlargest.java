package search;

public class secondlargest {
    public static void main(String[] args) {
        int arr []= {4,54,65,65,23,64};
        int max = 0;
        int smax=0;
        int n = arr.length;
        //calculate max value first. 
        for (int i = 0;i<n;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        // calculate sec max value here 
        for (int i = 0;i<n;i++){
            if(arr[i]>smax&& arr[i]!=max){
                smax= arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
 
}

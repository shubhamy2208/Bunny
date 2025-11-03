public class twosum {
    public static void main(String[] args) {
        int arr []= {34,45,3,5,43,12,};
        int target=15;
        System.out.print(twoSum(arr,target));

    }

   public static boolean twoSum(int arr[],int target){
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    
   }
}

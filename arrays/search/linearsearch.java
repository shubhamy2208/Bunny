package search;

public class linearsearch {
    public static void main(String[] args) {
        int arr []= {23,45,65,1,34};
        int target= 65;
        int found =-1;
       
        for (int i=0;i<arr.length;i++){
            if(arr[i]== target){
                found=i;
               
                break;
            }      
        }
        if (found!=-1)   System.out.println("Target fount at the index :"+found);
        else System.out.println("Target is not in array");
        
        
    }
}

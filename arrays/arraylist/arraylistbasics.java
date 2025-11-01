package arraylist;

import java.util.ArrayList;

public class arraylistbasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        arr.add(34);
        arr.add(33);
        arr.add(45); 
        arr.add(67);
        arr.add(38);
        arr.add(24);
        // System.out.println(arr.get(0));
        //agar koi value change karni hai to set use karne ka 
        arr.set(3, 1);
        // System.out.println(arr);
        int n = arr.size();
        for(int i =0;i<n;i++){
            System.out.print(arr.get(i)+" ");
   
        }
        // adding new values in array using add
        arr.add(90); //34 33 45 1 38 24 90 add ho jayega last me 

         // adding new values in array using add kisi dusre index pe 
         arr.add(3, 12);
        System.out.println(arr);
    }
}

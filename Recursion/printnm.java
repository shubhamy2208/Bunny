package Recursion;

import java.util.Scanner;
public class printnm {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name ");
    String nm = sc.nextLine();

   System.out.println("enter N");
      int n = sc.nextInt();
      print(nm,n);
   }

   // recursive function 
   static void print(String nm,int n){
      if(n==0){
         return;
      }
      System.out.println(nm);
      print(nm,n-1);
   }
}

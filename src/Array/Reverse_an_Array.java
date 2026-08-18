package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_an_Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
    int n=sc.nextInt();
    int []a=new int[n];
    System.out.println("Enter any number");
    for(int i=0; i<n; i++){
        a[i]=sc.nextInt();
    }
        System.out.print("Reverse array is : ");
    for(int i=n-1; i>=0; i--){
        System.out.print(a[i]+" ");
    }
    }
}
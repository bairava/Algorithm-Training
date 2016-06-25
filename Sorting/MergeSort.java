package mergesort;

import java.util.Scanner;
public class MergeSort {
  static int[] toSort;
    public static void main(String[] args) {
        System.out.println("Please enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Please enter the "+n+" elements");
        toSort = new int[n];
        for(int i=0 ; i<n; i++){
            toSort[i]=sc.nextInt();
        }
        mergeSort(0,n/2);
        mergeSort((1+n/2),n);
    }
    
    public static void mergeSort(int left,int right){
        
    }
    
}

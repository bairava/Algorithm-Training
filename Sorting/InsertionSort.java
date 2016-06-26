package mergesort;
/**
* Insertion Sort implementation in JAVA
**/
import java.util.Scanner;
public class InsertionSort {
   public static void main(String[] args) {
    //Request user to enter the count of elements   
    System.out.println("Please enter the number of elements for insertion sort");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
     //Request user to enter 'n' elements
    if(n>0){
        System.out.println("Please enter the "+n+" elements");
        int[] toSort = new int[n];
        for(int i=0 ; i<n; i++){
            toSort[i]=sc.nextInt();
        }
        //Sort the input
        int temp=0;
        for(int j=0;j<n-1;j++){
            //If J'th element is greater than J+1'th element insert it in appropriate place else do nothing
            if(toSort[j]>toSort[j+1])
            {     
               while(j>=0){
                 if(toSort[j]>toSort[j+1])
                 {
                 temp=toSort[j+1];
                 toSort[j+1]=toSort[j];
                 toSort[j] = temp;
                 j--;
                 }
                 else
                     break;
               } 
            }
        }
        //Printing the sorted array
        for(int answer : toSort)
                System.out.print(answer+" ");
    }
    //If invalid count of elements entered by user terminate the program
    else{
           System.out.println("Invalid input!!! Please enter a positive number for count of elements"); 
        }
    }   
}
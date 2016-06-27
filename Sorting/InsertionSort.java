/**
* Insertion Sort implementation in JAVA
**/
import java.util.InputMismatchException;
import java.util.Scanner;
public class InsertionSort {
   public static void main(String[] args) {
    //Request user to enter the count of elements   
    System.out.println("Please enter the number of elements for insertion sort");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    //Request user to enter 'n' elements
    try{
        int[] toSort = new int[n];
        System.out.println("Please enter the "+n+" elements");
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
     catch(NegativeArraySizeException e){
        System.out.println("Array size can't be negative, please try again with a positive value "+e);
    }
    catch(InputMismatchException e){
        System.out.println("Please enter only integers as array elements "+e);
    }
    catch(Exception e){
        System.out.println("Exception due to "+e);
    }
    }   
}
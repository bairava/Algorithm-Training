/**
* Bubble Sort implementation in JAVA
**/
import java.util.InputMismatchException;
import java.util.Scanner;

public class BubbleSort {

   public static void main(String[] args) {
    //Request user to enter the count of elements   
    System.out.println("Please enter the number of elements for bubble sort");
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
        //For n-1 passes
        for(int j=0;j<n-1;j++){
            //Swap the numbers if kth element is greater than k+1th element
            for(int k=0;k<(n-1-j);k++){
                if(toSort[k]>toSort[k+1])
                 {
                 temp=toSort[k+1];
                 toSort[k+1]=toSort[k];
                 toSort[k] = temp;
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

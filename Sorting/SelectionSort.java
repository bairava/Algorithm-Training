import java.util.*;
/**
* Selection Sort implementation in JAVA
**/
public class SelectionSort {
     public static void main(String[] args) throws Exception {
    try{
    //Request user to enter the count of elements   
    System.out.println("Please enter the number of elements for selection sort");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    //Request user to enter 'n' elements
    int[] toSort = new int[n];
    System.out.println("Please enter the "+n+" elements");
        for(int i=0 ; i<n; i++){
            toSort[i]=sc.nextInt();
        }
        int smallestElement;
        int smallestElementLocation;
         //Sorting the input
        for(int j=0 ; j<n-1; j++){
            smallestElement = toSort[j];
            smallestElementLocation=j;
            boolean change = false;
            //Determine the smallest element
            for(int k=j+1; k<n;k++){
                if(toSort[k]<smallestElement)
                {
                    smallestElement=toSort[k];
                    smallestElementLocation=k;
                    change=true;
                }
            }
            //Swap the smallest element to the first place of unsorted part
            if(change){
            int temp=toSort[j];
            toSort[j]=smallestElement;
            toSort[smallestElementLocation]=temp;
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
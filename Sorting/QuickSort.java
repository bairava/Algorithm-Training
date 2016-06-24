import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        //Get the count of elements
        System.out.println("Please enter the count of elements to sort...");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int eachElement;
        int[] inputArray = new int[count];
        System.out.println("Please enter the element");
        //Update unsorted array of elements
        while(count>0){
            eachElement = sc.nextInt();
            inputArray[count-1] = eachElement;
            count--;
        }
        //Call for the quick sort mothod
        int[] sortedArray = myQuickSort(0,inputArray.length-1,inputArray);
        //Print the sorted array
        for(int answer : sortedArray)
            System.out.print(answer +" ");
    }

    private static int[] myQuickSort(int start, int end, int[] inputArray) {
      if(start<end){
          int p = partition(start,end,inputArray);
          myQuickSort(start,p-1,inputArray);
          myQuickSort(p+1,end,inputArray);
      }
        return inputArray;
    }

    private static int partition(int start, int end,int[] inputArray) {
        int pivot=inputArray[end];
        int i=start;
        for(int j=start;j<end;j++){
            if(inputArray[j]<pivot){
                int temp=inputArray[i];
                inputArray[i]=inputArray[j];
                inputArray[j]=temp;
                i++;
            }   
        }
            int temp=inputArray[i];
            inputArray[i]=inputArray[end];
            inputArray[end]=temp;
        return i;
    }
}
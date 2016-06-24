public class QuickSort {
public static int[] inputArray = new int[]{4,35,34,32,5,2,55,94,84,28,10};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] sortedArray = myQuickSort(0,inputArray.length-1);
        for(int j=0;j<sortedArray.length;j++)
            System.out.print(sortedArray[j] +" ");
    }

    private static int[] myQuickSort(int start, int end) {
      if(start<end){
          int p = partition(start,end);
          myQuickSort(start,p-1);
          myQuickSort(p+1,end);
      }
        return inputArray;
    }

    private static int partition(int start, int end) {
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
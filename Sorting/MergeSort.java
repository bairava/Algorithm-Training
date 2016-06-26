import java.util.Scanner;
public class MergeSort {
 
    public static void main(String[] args) {
        System.out.println("Please enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n>0){
        System.out.println("Please enter the "+n+" elements");
        int[] toSort = new int[n];
        for(int i=0 ; i<n; i++){
            toSort[i]=sc.nextInt();
        }
        int[] tempArray;
        if(n==1)
            System.out.println();
        
        else if(n>1){
            tempArray = new int[n];
            mergeSortSplit(toSort,tempArray,0,n-1);
        }
        for(int answer : toSort)
                System.out.print(answer+" ");
      }
        
        else{
           System.out.println("Invalid input!!! Please enter a positive number for count of elements"); 
        }
    }
    
    public static void mergeSortSplit(int[] toSort,int[] tempArray,int start,int end){
        int mid;
        
        if(end>start)
        {    
            mid = (end+start)/2;
            mergeSortSplit(toSort,tempArray,start,mid);
            mergeSortSplit(toSort,tempArray,mid+1,end);
            mergeArray(toSort,tempArray,start,mid+1,end);
        }
    }
    
    public static void mergeArray(int[] toSort,int[] tempArray,int start,int mid,int end){
          int i, start_end, count, temp;
          start_end = mid-1;
          temp = start;
          count = end-start+1;
          
          while((start<=start_end)&&(mid<=end)){
              if(toSort[start]<=toSort[mid]){
                  tempArray[temp] = toSort[start];
                  temp++;
                  start++;
              }
              else{
                  tempArray[temp]=toSort[mid];
                  temp++;
                  mid++;
              }
          }
          
          
          while (start <= start_end){
                tempArray[temp] = toSort[start];
                start++;
                temp++;
            }

          while (mid <= end){
                tempArray[temp] = toSort[mid];
                mid++;
                temp++;
            }
          
          for (i = 0; i < count; i++){
              toSort[end] = tempArray[end];
              end--;
                }
        }
    }
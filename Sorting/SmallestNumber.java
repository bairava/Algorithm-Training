import java.io.IOException;
import java.util.Scanner;

public class SmallestNumber{
    //Static Variable declaration
    public static int input[];
    static int flag;
    //Main Method   
    public static void main(String[] args) throws IOException{
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers separated by ',' : for ex 14,5,21");
        System.out.println("Number options: 14,5,21,17,6,2,22,15,7,13");
        //Read input from user
        String inputLine = sc.nextLine();
        //Store individual number in the array
        String[] inputProcessed = inputLine.split(",");
        input = new int[inputProcessed.length];
        for(int j=0;j<inputProcessed.length;j++){
            input[j] = Integer.parseInt(inputProcessed[j]);
        }
         
        int result=0;
        SmallestNumber sn = new SmallestNumber(); 
        for(int i=0;i<input.length;i++){
            flag=0;
            //Calling the Method to find the numbers in ascending order 
            result = sn.orderSmallest(input.length,input[i]);
            inputProcessed[result]= " "+input[i];
        }
        //Prnting the result
        for(int k=0; k<inputProcessed.length;k++){
            if(k==0)
                System.out.println("The 1st smallest number is"+inputProcessed[k]);
            if(k==1)
                System.out.println("The 2nd smallest number is"+inputProcessed[k]);
            if(k==2)
                System.out.println("The 3rd smallest number is"+inputProcessed[k]);
            else if(k>2)
            System.out.println("The " +(k+1)+ "th smallest number is"+inputProcessed[k]);
        }
     }
       
    
    catch(Exception E){
        System.out.println("Please enter valid positive integers separated with ','");
    }
        }
    
    //Recursive Method to calculate the third smallest number 
    public int orderSmallest(int length,int number){
    if(length==0){
                return flag;
     }
    else if(length>0){
      if(number > input[length-1])  {  
        flag = flag+1+orderSmallest(length-1, number); //Calls the method again until length becomes 0
        return flag;
      } 
      else if(number <= input[length-1]){
        flag = flag+0+orderSmallest(length-1, number); //Calls the method again until length becomes 0
        return flag;
      }
     }
    return flag;
    }
}
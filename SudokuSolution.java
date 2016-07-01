/**
* Java program to solve sudoku puzzle
**/
public class SudokuSolution {
    //Declaration of Global Variables
    public static int[][] grid ={
                 {3, 0, 6, 5, 0, 8, 4, 0, 0},
                 {5, 2, 0, 0, 0, 0, 0, 0, 0},
                 {0, 8, 7, 0, 0, 0, 0, 3, 1},
                 {0, 0, 3, 0, 1, 0, 0, 8, 0},
                 {9, 0, 0, 8, 6, 3, 0, 0, 5},
                 {0, 5, 0, 0, 9, 0, 6, 0, 0},
                 {1, 3, 0, 0, 0, 0, 2, 5, 0},
                 {0, 0, 0, 0, 0, 0, 0, 7, 4},
                 {0, 0, 5, 2, 0, 6, 3, 0, 0}
                  };
    
    //Main method to resolve the sudoku puzzle
    public static void main(String[] args){
	System.out.println("Unsolved Sudoku Puzzle \n");
            printSudoku();
	System.out.println("\n Solved Sudoku Puzzle \n");
	if (solvedSudoku()){
            printSudoku();
	}
    }
    
    //Method to print the Sudoku Array contents
    public static void printSudoku(){ 
      for(int i=0;i<9;i++)
            {
                System.out.print("|");
                for(int j=0;j<9;j++){
                System.out.print(grid[i][j]+"|");
            }
                 System.out.println("");
        }
    }
    
    //Recursive method to resolve the puzzle
    public static boolean solvedSudoku(){
    //Determining cell with value 0 
	int[] temp = findZero();
        
	if (temp != null){
	int row =temp[0];
	int col =temp[1];
        
	for(int i =1;i<=9;i++){
                //Method to check whether the number can replace 0
		if (updateNumberSafe(row,col,i)){
			grid[row][col]=i;
                            if (solvedSudoku()){
                                	return true;
                            }
			grid[row][col]=0;
                                        }
                                }
                            }else 
                            {
                                   return true;
                            }
            return false;
        }
    
    //Method to determine whether any cell contains 0
    public static int[] findZero(){
        int[] t = new int[2];
            for (int i =0;i<grid.length;i++){
		for(int j =0;j<grid.length;j++){
			if (grid[i][j]==0){
				t[0]=i;
				t[1]=j;
				return t;
			}
		}
	}
	return null;
    }

//Method to check whether the number can replace 0
public static boolean updateNumberSafe(int row,int col,int num){

	return checkRow(row,col,num) && checkCol(row,col,num) && checkGrid(row,col,num);
}

//Method to check whether the number is unavailble in the Row
public static boolean checkRow(int row,int col,int num){
for(int i =0;i<grid.length;i++){
	if(grid[row][i]==num){
		return false;
	}
}
return true;
}

//Method to check whether the number is unavailble in the Column
public static  boolean checkCol(int row,int col,int num){
for(int i =0;i<grid.length;i++){
	if(grid[i][col]==num){
		return false;
	}
}
return true;
}

//Method to check whether the number is unavailble in the 3 * 3 Grid
public static boolean checkGrid(int row,int col,int num){
row=row-(row%3);
col = col-(col%3);

for (int i =0;i<3;i++){
		for(int j =0;j<3;j++){
			if (grid[i+row][j+col]==num){
				return false;
			}
		}
	}
return true;
    }
}
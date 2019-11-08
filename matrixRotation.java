package Srishti.com;

public class matrixRotation 
{
public static void main(String args[])
{
	int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int N=3;
	int row=matrix.length;
	int col=3;
	System.out.println("BEFORE");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(matrix[i][j]);
		}
		System.out.println();
	}
	System.out.println("AFTER");
	 for (int x = 0; x < row / 2; x++) 
     { 
         
         for (int y = x; y < row-x-1; y++) 
         { 
             int temp = matrix[x][y]; 
    
             matrix[x][y] = matrix[y][row-1-x]; 
    
             matrix[y][N-1-x] = matrix[row-1-x][row-1-y]; 
    
             matrix[row-1-x][row-1-y] = matrix[row-1-y][x]; 
    
             matrix[row-1-y][x] = temp; 
         } 
     } 
 

	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(matrix[i][j]);
		}
		System.out.println();
	}
}
}

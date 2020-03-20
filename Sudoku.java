//  Sudoku checking Sudoku is a number puzzle in which the goal is to complete a 9-by-9 table
//that is partially filled. When completed, the table must satisfy the following conditions:
// In each row, 1 through 9 must appear exactly once each.
//  In each column, 1 through 9 must appear exactly once each.
// The 9-by-9 table can be naturally divided into nine 3-by-3 subtables. The third requirement 
// Is that in each 3-by-3 subtable, 1 through 9 must appear exactly once each.
//Write a method, sudokuSolutionCheck, that receives a 9-by-9 two-dimensional array of
//int values as its formal parameter, and then returns whether or not the array represents a   
//Sudoku solution. The method may halt with ArrayIndexOutOfBoundsExceptions if the row or
//column dimension of the array is smaller than 9 or the array contains an element smaller than 
//  or greater than 9.

import java.util.*;

class Sudoku
{
    static int arr[][]=new int[9][9];
    static
    {
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                arr[i][j]=j+1;
    }
    static boolean horizontlCheck(int a[][])
    {
        int c[][]=new int[9][9];
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
            {
                c[i][j]=a[i][j];
                if(a[i][j]<1 || a[i][j]>9)
                    throw new ArrayIndexOutOfBoundsException("Cannot have numbers other than 1-9");
            }
        for(int i=0;i<9;i++)
            Arrays.sort(c[i]);
        return Arrays.deepEquals(arr,c);
    }
    static boolean verticalCheck(int a[][])
    {

        int c[][]=new int[9][9];
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                c[i][j]=a[i][j];        
        int b[][]=new int[9][9];
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                b[i][j]=c[j][i];
        for(int i=0;i<9;i++)
            Arrays.sort(b[i]);
        return Arrays.deepEquals(arr,b);
    }
    static boolean squareCheck(int a[][])
    {
        int x[][]=new int[9][9];
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                x[i][j]=a[i][j];
        int b[]=new int[9];
        for(int i=0;i<9;i++)
        {
            int r=(i/3)*3;
            int c=(i*3)%9;
            for(int j=0;j<9;j++)
                b[j]=x[r+j/3][c+j%3];
            Arrays.sort(b);
            if(!Arrays.equals(b,arr[0]))
                return false;
        }
        return true;
    }
    static boolean isSudoku(int a[][])
    {
        if(a.length!=9)
            throw new ArrayIndexOutOfBoundsException("Sudoku must be 9X9");
        for(int[] i:a)
        {
            if(a.length!=9)
            throw new ArrayIndexOutOfBoundsException("Sudoku must be 9X9");
        }
        return (horizontlCheck(a)&&verticalCheck(a)&&squareCheck(a));
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a[][]={{5,3,4,6,7,8,9,1,2},{6,7,2,1,9,5,3,4,8},{1,9,8,3,4,2,5,6,7},{8,5,9,7,6,1,4,2,3},{4,2,6,8,5,3,7,9,1}
                   ,{7,1,3,9,2,4,8,5,6},{9,6,1,5,3,7,2,8,4},{2,8,7,4,1,9,6,3,5},{3,4,5,2,8,6,1,7,9}};
        System.out.println("Choose:\n\t\t1.Enter your own sudoku\n\t\t2.Verify default sudoku");
        if(sc.nextInt()==1)
            for(int i=0;i<9;i++)
                for(int j=0;j<9;j++)
                    a[i][j]=sc.nextInt();
        System.out.println("Sudoku is : ");
        for(int i=0;i<9;i++)
        {
            System.out.println("\n");
            for(int j=0;j<9;j++)
                System.out.print("  "+a[i][j]);
        }
        try
        {
            System.out.println(isSudoku(a)?"\nSudoku is complete":"\nSudoku is incomplete");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("\n"+e.getMessage());
        }
    }
}
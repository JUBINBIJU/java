import java.util.Scanner;

class Matrix
{
    public int matrix[][],r,c;
    Matrix(int r,int c)
    {
        matrix=new int[r][c];
        this.r=r;
        this.c=c;
    }
    void insert()
    {
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                matrix[i][j]=MatrixAdd.sc.nextInt();
    }
    void printMatrix()
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print("\t"+matrix[i][j]);
            System.out.println();
        }
    }

    static Matrix addMatrix(Matrix a, Matrix b)
    {
        if(a.r==b.r && a.c==b.c)
        {
            Matrix m=new Matrix(a.r,a.c);
            for(int i=0;i<a.r;i++)
                for(int j=0;j<a.c;j++)
                    m.matrix[i][j]=a.matrix[i][j]+b.matrix[i][j];
            return m;
        }
        System.out.println("LENGTHS ARE UNEQUAL!!!  ");
        return new Matrix(0,0);
    }
}
class MatrixAdd
{
    public static Scanner sc=new Scanner(System.in);

    public static void main(String args[])
    {
        System.out.println("Enter no.of rows and columns of matrix1 : ");
        Matrix m1=new Matrix(sc.nextInt(),sc.nextInt());
        System.out.println("Enter no.of rows and columns of matrix2 : ");
        Matrix m2=new Matrix(sc.nextInt(),sc.nextInt());
        if(m1.r==m2.r && m1.c==m2.c)
        {
            System.out.println("Enter data of matrix1 : ");
            m1.insert();            
            System.out.println("Enter data of matrix2 : ");
            m2.insert();
            Matrix m=Matrix.addMatrix(m1,m2);
            m.printMatrix();
            return;
        }
        System.out.println("LENGTHS ARE UNEQUAL!!!  ");
    }
}
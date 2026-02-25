import java.util.Scanner;
class Matrix{
    public static void main(String args[]){
    int m,n,a[][],b[][],c[][],i,j;
    System.out.println("Enter the  no of Rows and Columns:");
    Scanner sc=new Scanner(System.in);
    m=sc.nextInt();
    n=sc.nextInt();
    a=new int[m][n];
    b=new int[m][n];
    c=new int[m][n];
    System.out.println("Enter the Elements of 1st matrix");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println("Enter the Elements 2nd matrix");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            b[i][j]=sc.nextInt();
        }
    }
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
           c[i][j]=a[i][j]+b[i][j]; 
        }
    }
    System.out.println("Sum of matrices");
      for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
           System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }
    }
}
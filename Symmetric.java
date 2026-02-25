import java.util.Scanner;
class Symmetric{
    public static void main(String args[])
    {
        int a[][],n,m,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Rows and Columns");
        n=sc.nextInt();
        m=sc.nextInt();
        a=new int[10][10];
        System.out.println("Enter the Elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
            a[i][j]=sc.nextInt();
            }
        }
        if(n!=m)
        {
            System.out.println("This Matrix is not Symmetric");
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    System.out.println("This Matrix is not Symmetric");
                    return;
                }
            }
        }
        System.out.println("This Matrix Is Symmetric");
    }
}
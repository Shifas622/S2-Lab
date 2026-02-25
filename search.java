import java.util.Scanner;
class search{
    public static void main(String args[])
    {
        int n,a[],key,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the Elements of Array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(key==a[i])
            {
             System.out.println("Element Found at Position"+(i+1));
             flag=1;
             break;
            }
        }
        if(flag==0)
        {
            System.out.println("Element is not Found");
        }
    }
}
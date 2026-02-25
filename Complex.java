import java.util.Scanner;
class Complex{
    public static void main(String args[])
    {
        int a,b,c,d,realsum,imgsum;
        System.out.println("Enter the Real Part of First Complex Number ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter the Imaginary Part of First Complex Number ");
        b=sc.nextInt();
        System.out.println("Enter the Real Part of Second Complex Number ");
        c=sc.nextInt();
        System.out.println("Enter the Imaginary Part of Second Complex Number ");
        d=sc.nextInt();
        realsum=a+c;
        imgsum=b+d;
        System.out.println("Result is "+realsum+"+"+imgsum+"i");
    }   
}
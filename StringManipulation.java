import java.util.Scanner;
class StringManipulation{
    public static void main(String args[])
    {
        String s,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        s=sc.nextLine();
        b=sc.nextLine();
        System.out.println("Lower Case: "+s.toLowerCase());
        System.out.println("Upper Case: "+s.toUpperCase());
        System.out.println("Size Of the String is: "+s.length());
        System.out.println("Substring is: "+s.substring(0,5));
        System.out.println(s.contains("hi"));
        System.out.println(s.compareTo(b));
    }
}
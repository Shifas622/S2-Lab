class Shapes{
    void area(int a,int b)
    {
        System.out.println("The Area of Rectangle:"+a*b);
    }
   double area(double a)
    {
      
        return 3.14*a*a;
    }
    int area(int side){
         
         return side*side;
    }
public static void main(String args[])
{
    Shapes sh=new Shapes();
    sh.area(4,8);
    double var=sh.area(0.5);
    System.out.println("The Area of Square:"+sh.area(4));
}
}
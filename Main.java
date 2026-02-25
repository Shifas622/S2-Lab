class Main{
    public static void main(String args[])
    {
        Product p1=new Product(101,"Laptop",50000);
        Product p2=new Product(102,"Mouse",5000);
        Product p3=new Product(103,"Keyboard",1000);
        if (p1.price<p2.price && p1.price<p3.price)
        {
           System.out.println("Laptop is lowest"); 
        }
        else if(p2.price<p1.price && p2.price<p3.price)
        {
            System.out.println("Phone is lowest"); 
        }
        else
        {
           System.out.println("Mouse is lowest");  
        }
    }

}
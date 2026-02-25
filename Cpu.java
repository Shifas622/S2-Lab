import java.util.Scanner;
class Cpu{
    int price;
    Cpu(int price)
    {
        this.price=price;
    }
    void show()
    {
        System.out.println("The price of the Cpu is "+price);
    }
    class Processor{
        int cores;
        String manufacture;
        Processor(int Cores,String manufacture)
        {
            this.cores=Cores;
            this.manufacture=manufacture;
        }
        void display()
        {
            System.out.println("No of Cores is "+cores);
            System.out.println("Manufactured by "+manufacture);
        }
    }
    static class Ram{
        String memory;
        String manufacture;
        Ram(String memory,String manufacture)
        {
            this.memory=memory;
            this.manufacture=manufacture;
        }
        void display1()
        {
            System.out.println("Ram Memory is"+memory);
            System.out.println("Manufactured by"+manufacture);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Processor Manufacture");
        String manu=sc.nextLine();
        System.out.println("Enter the Cpu Price");
        int a=sc.nextInt();
        Cpu cpu=new Cpu(a);
        cpu.show();
        System.out.println("Enter the no of cores");
        int b=sc.nextInt();
        Cpu.Processor processor=cpu.new Processor(b,manu);
        processor.display();
    }
}


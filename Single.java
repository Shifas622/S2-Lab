class Data{
    int roll;
    String name;
    Data(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
}

class Student extends Data
{
    Student(int roll,String name)
    {
        super(roll,name);
    }
 void display()
 {
    System.out.println("Name:" + name + "Roll:" +roll);
 }
}
class Single{
    public static void main(String[] args) {
    Student d=new Student(10,"shifas");
    d.display();
    }
}


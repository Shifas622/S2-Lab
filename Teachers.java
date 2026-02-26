class Teacher{
    int emp_id,salary;
    String Teacher_name;
    Teacher(int emp_id,int salary,String Teacher_name){
        this.emp_id=emp_id;
        this.salary=salary;
        this.Teacher_name=Teacher_name;
    }
}
class Student extends Teacher{
    int rollno;
    String name;
    Student(int emp_id,int salary,String Teacher_name,int rollno,String name)
    {
        super(emp_id,salary,Teacher_name);
        this.rollno=rollno;
        this.name=name;
    }
    void display()
    {
        System.out.println("Employee Id "+emp_id);
        System.out.println("Salary is "+salary);
        System.out.println("Teacher name "+Teacher_name);
        System.out.println("Roll no "+ rollno);
        System.out.println("Student name "+ name);
    }
}
public class Teachers{
    public static void main(String args[])
    {
        Student []stud=new Student[3];
        stud[0]=new Student(101,20000,"Sunitha Miss",36,"JayaKrishnan");
        stud[1]=new Student(102,20000,"Pooja Miss",48,"Shifas");
        stud[2]=new Student(103,20000,"Lubi Miss",10,"Adhwaith");
        for(int i=0;i<stud.length;i++)
        {
            stud[i].display();
        }
    }
}
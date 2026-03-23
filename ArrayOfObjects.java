class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student(1, "Arun");
        students[1] = new Student(2, "Meera");
        students[2] = new Student(3, "Rahul");

        for (Student s : students) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
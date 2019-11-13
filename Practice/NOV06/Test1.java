package Practice.NOV06;

class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("홍길동");

        p = s;

        System.out.println(s.name);

        s.grade = "A";
        s.department = "Com";

        Person pp = new Student("홍길동");
        Student ss;

        ss = (Student) pp;

        ss.grade = "A";
        System.out.println(ss.name + ", " + ss.grade);
        System.out.println(pp.name + ", " + ss.grade);
    }
}

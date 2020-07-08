package Practice.NOV13;

class Person {
    private int weight;
    int age;
    protected int height;
    public String name;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Student extends Person {
    public void set() {
        age = 30;
        name = "홍길동";
        height = 175;
        setWeight(99);
    }
}

public class Test3 {
    public static void main(String[] args){
        Person p = new Person();
        System.out.print(p.getWeight());
        System.out.println(", " + p.age + ", " + p.height + ", " + p.name);

        Student s = new Student();
        s.set();
        System.out.print(s.getWeight());
        System.out.println("," + s.age + ", " + s.height + ", " + s.name);
    }
}

package Practice.NOV20;

class Box<T> {
    private T data;

    public void set(T data) {
        this.data = data;
    }

    public T get() {
        return data;
    }
}

public class Test4 {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        //Box<String> b = new Box<String>();
        b.set("자바");
        String s = b.get();
        System.out.println(s);

        Box<Integer> b2 = new Box<Integer>();
        //Box<Integer> b2 = new Box<> ();
        b2.set(10);
        int i = b2.get();
        System.out.println(i);
    }
}

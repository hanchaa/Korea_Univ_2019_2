package Practice.NOV27;

class Pair<F, V> {
    private F data1;
    private V data2;

    public Pair(F field, V value) {
        this.data1 = field;
        this.data2 = value;
    }

    public F getKey() {
        return data1;
    }

    public V getValue() {
        return data2;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("학번:", 12345678);
        System.out.println(pair.getKey() + " " + pair.getValue());

        Pair<String, String> db = new Pair<String, String>("이름:", "홍길동");
        System.out.println(db.getKey() + " " + db.getValue());
    }
}

import java.util.ArrayList;

public class HeapDynamicJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 3);
        }
        System.out.println(list);
    }
}
public class FixedHeapDynamicJava {
    public static void main(String[] args) {
        Integer[] heapArray = new Integer[5];
        for (int i = 0; i < heapArray.length; i++) {
            heapArray[i] = i * 10;
        }
        for (int val : heapArray) {
            System.out.println(val);
        }
    }
}
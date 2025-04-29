public class StackDynamicJava {
    static void printNumbers(int count) {
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = i + 1;
        }
        for (int n : nums) {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        printNumbers(5);
    }
}
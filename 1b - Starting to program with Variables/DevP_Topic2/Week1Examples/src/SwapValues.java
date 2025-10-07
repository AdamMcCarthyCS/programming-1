public class SwapValues {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // dummy variable to help with swapping
        int c = a;

        // swap the values in a and b
        a = b;
        b = c;

        // Output the changes
        System.out.println("Before: a = " + b + ", b = " + a);
        System.out.println("After: a = " + a + ", b = " + b);
    }
}

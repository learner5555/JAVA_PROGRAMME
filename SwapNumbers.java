public class SwapNumbers {
    public static void main(String[] args) {
        // // Step 1: Declare two variables
        int a = 5;
         int b = 10;
        
        // System.out.println("Before swapping:");
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
        
        // // Step 3: Using a temporary variable
        // int temp = a;  // temp 5
        // a = b;   // a 10
        // b = temp;  // 5
        
        // System.out.println("\nAfter swapping using temporary variable:");
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
        
        // Step 4: Without using a temporary variable
        a = a + b;    // a 15
        b = a - b;   // b 10
        a = a - b;    // a 5
        
        System.out.println("\nAfter swapping without using temporary variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

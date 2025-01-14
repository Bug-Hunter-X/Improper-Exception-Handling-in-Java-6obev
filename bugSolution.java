public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        try {
            x = x / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero. Setting x to a default value.");
            x = -1; // Or any other appropriate default value
            // Log the exception for debugging purposes
            // Log the exception, include relevant context, and stack trace
        }
        System.out.println(x); // Now it will print -1
    }
}
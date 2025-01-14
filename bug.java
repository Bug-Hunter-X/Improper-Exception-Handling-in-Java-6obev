public class UncommonBug {
    public static void main(String[] args) {
        int x = 5;
        try {
            x = x / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            // Missing: handle the exception properly 
            // Instead of just printing the message, consider alternative actions
            // Example: setting x to a default value, logging to file, re-throwing
        }
        System.out.println(x); // this will print 0 if the ArithmeticException is caught
    }
}
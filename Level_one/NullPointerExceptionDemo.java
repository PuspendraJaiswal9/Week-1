public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; 
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; 
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException...");
        try {
            generateException(); 
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nHandling NullPointerException...");
        handleException(); 
    }
}

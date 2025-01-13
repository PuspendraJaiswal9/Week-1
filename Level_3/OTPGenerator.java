import java.util.HashSet;

public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; 
    }

    // Method to ensure OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int otp : otps) {
            uniqueSet.add(otp);
        }
        return uniqueSet.size() == otps.length; 
    }

    public static void main(String[] args) {
        int[] otps = new int[10]; 

        // Generate 10 OTPs and store in the array
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if OTPs are unique
        boolean isUnique = areOTPsUnique(otps);
        System.out.println("\nAre all OTPs unique? " + (isUnique ? "Yes" : "No"));
    }
}

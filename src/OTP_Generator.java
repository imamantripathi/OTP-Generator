import java.util.*;

public class OTP_Generator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Welcome To the OTP Generator");
        System.out.println("");
        System.out.print("Enter the Length for OTP: ");
        int len = sc.nextInt();
        System.out.println("");
        Random rnd = new Random();
        String random = "";
        String numbers = "1234567890";
        for (int i = 0; i < len; i++) {
            random = random + rnd.nextInt(numbers.length());
        }
        System.out.println("The Generated OTP of " + len + " digits is " + random);
        System.out.println("");
        System.out.println("Thanks For Using this Program.....");
        System.out.println("");
    }
}
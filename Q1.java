import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ur age :: ");
        int age = s.nextInt();

        try {
            if (age < 18)
                throw new InvalidAgeException("Invalid age");
            else
                System.out.println("Valid age");
        } catch (InvalidAgeException a) {
            System.out.println(a);
        }
    }
}
class InvalidAgeException extends Exception {

    public InvalidAgeException(String str) {
        System.out.println(str);
    }
}
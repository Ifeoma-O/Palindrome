import java.util.Scanner;
public class JavaMethod2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter any number greater than one digit: ");
        number = input.nextInt();

        if (isPalindrome(number)){
            System.out.println(number + " is a palindrome");
        }else {
            System.out.println(number + " is not a palindrome");
        }
    }
    public static boolean isPalindrome(int number){
        int original = number;
        int reversed = 0;

        while (number > 0){
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number = number / 10;
        }
        return original == reversed;
    }
}

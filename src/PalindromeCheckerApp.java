import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("   Welcome to Palindrome App   ");
        System.out.println("================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String word = sc.nextLine();

        // remove spaces and convert to lowercase
        word = word.replaceAll(" ", "").toLowerCase();

        String reverse = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if(word.equals(reverse)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        sc.close();
    }
}
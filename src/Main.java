import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palindrome = "";
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a word or statement that you would like to check to see if it" +
                " qualifies as a Palindrome:");
        String name = myObj.nextLine();
        String newName = name.replaceAll("[^a-zA-Z]+","");
        int stringLength = newName.length();

        for (int i = stringLength - 1; i > -1; i--) {

            palindrome = palindrome + newName.charAt(i);

        }

        if (newName.toLowerCase().equals(palindrome.toLowerCase())) {
            System.out.println("Yes! " + name + " is a Palindrome!");
        }
        else {
            System.out.println("I'm sorry, but " + name + " does not qualify as a Palindrome.");
        }

    }
}
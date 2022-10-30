import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task3matcher {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // word that I search
        System.out.println("Enter the word that you wanted to find: ");
        String s2 = scan.nextLine();

        // Creating a pattern
        Pattern pattern = Pattern.compile(s2);
        //patern = s2;

        //where I search
        System.out.println("Enter the text, where you lost: ");
        String s1 = scan.nextLine();

        // Creating a matcher
        Matcher matcher = pattern.matcher(s1);

        if (matcher.find()) {
            System.out.println("Yes");
        } else {
            System.out.println("False");
        }


    }

}

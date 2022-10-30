package classWork;

import java.util.Scanner;

public class Task1polindrom {

    public static String re(String word){

        return new StringBuilder(word).reverse().toString(); //reverse.polindrom
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:");

        String word = scan.nextLine();
        word = word.toLowerCase();
        String Reword = re(word).toLowerCase();

        if(word.equals(Reword)){
            System.out.println( Reword+ " is a polindrom");
        } else {
            System.out.println(word + " is not a polindrom DUDE!");
        }



    }
}

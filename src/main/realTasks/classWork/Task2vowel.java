import java.util.Scanner;

public class Task2vowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name or word: ");
        String word = scan.nextLine();
        String name = word.toLowerCase();

        int acounter = 0;
        int ecounter = 0;
        int icounter = 0;
        int ucounter = 0;
        int ocounter = 0;

        char array[] = name.toCharArray(); //to make String a char
        //char array[] = {'a', 'b', 'c', 'd' ...};

        for (int i = 0; i <array.length; i++) {
            if(array[i] == 'a'){
                acounter++;
            } else { acounter += 0; }

            if(array[i] == 'e'){
                ecounter++;
            } else {ecounter +=0;}

            if(array[i] == 'i'){
                icounter++;
            } else {icounter +=0;}

            if(array[i] == 'u'){
                ucounter++;
            } else {ucounter +=0;}

            if(array[i] == 'o'){
                ocounter++;
            } else {ocounter +=0;}

        }

        System.out.println(acounter + "a");
        System.out.println(ecounter + "e");
        System.out.println(icounter + "i");
        System.out.println(ucounter + "u");
        System.out.println(ocounter + "o");

    }
}


import java.util.Scanner;

public class UsingStringMethods {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String kbString = kb.nextLine();
        System.out.println("Enter a word: "+ kbString );

        System.out.println("Enter a number as an index: ");
        int kbIndex = kb.nextInt();
        System.out.println("Enter a number as an index: "+ kbIndex );

        System.out.println("The size of the word is : " + kbString.length());
        System.out.println("The substring from 0 to " + kbIndex +" is : " + kbString.substring(0,kbIndex+1));
    }

}
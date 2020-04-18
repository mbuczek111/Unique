package unique;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Unique {

    public static void main(String[] args) {
        LinkedHashSet<Character> kolekcja = new LinkedHashSet<>();
        System.out.println("Please enter a sentence: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char [] arrayC= input.toCharArray();
        for (int i = 0; i <input.length() ; i++) {
            kolekcja.add(arrayC[i]);
        }
        kolekcja.remove(' ');
        for (Character ch:kolekcja) {
            System.out.print(ch);
            System.out.print(",");
        }

    }
}

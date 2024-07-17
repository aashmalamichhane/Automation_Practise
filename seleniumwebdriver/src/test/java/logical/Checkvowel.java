package logical;

import java.util.Scanner;

public class Checkvowel {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String name = "Aashma";
        String input = name.toLowerCase();

        int vowel = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
        }

        System.out.println("Number of vowels in the input string: " + vowel);

    }
}


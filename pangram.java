package manoharproblems;
import java.util.Scanner;

public class PangramChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();

        if (isPangram(sentence)) {
            System.out.println(sentence + " is a pangram.");
        } else {
            System.out.println(sentence + " is not a pangram.");
        }

    }

    public static boolean isPangram(String sentence) {

        boolean[] letters = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;
            }
        }

        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }

        return true;

    }

}

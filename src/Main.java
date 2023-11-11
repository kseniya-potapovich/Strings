import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String theLongest = null;
        int theMaxLength = 0;
        String theShortest = null;
        int theMinLength = 0;

        String[] strs = new String[3];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = scanner.nextLine();
        }

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > theMaxLength) {
                theLongest = strs[i];
                theMaxLength = strs[i].length();
            }
        }

        theMinLength = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < theMinLength) {
                theShortest = strs[i];
                theMinLength = strs[i].length();
            }
        }

        System.out.println("The longest string is " + "'" + theLongest + "'" + " with length " + theMaxLength);
        System.out.println("The shortest string is " + "'" + theShortest + "'" + " with length " + theMinLength);
    }
}

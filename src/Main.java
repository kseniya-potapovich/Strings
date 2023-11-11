import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strs = new String[3];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = scanner.nextLine();
        }

        String theLongest = null;
        int theMaxLength = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > theMaxLength) {
                theLongest = strs[i];
                theMaxLength = strs[i].length();
            }
        }

        int theMinLength = strs[0].length();
        String theShortest = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < theMinLength) {
                theShortest = strs[i];
                theMinLength = strs[i].length();
            }
        }

        System.out.println("The longest string is " + "'" + theLongest + "'" + " with length " + theMaxLength);
        System.out.println("The shortest string is " + "'" + theShortest + "'" + " with length " + theMinLength);

        int[] sizeOfString = new int[strs.length];
        int[] count= new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            sizeOfString[i] = strs[i].length();
            count[i] = i;
        }
        for (int i =0;i< strs.length-1;i++){
            for (int j = i+1;j< strs.length;j++){
                if (sizeOfString[i]>sizeOfString[j]){
                    int temp = count[i];
                    count[i] = count[j];
                    count[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(count));
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[count[i]]);
        }
    }
}

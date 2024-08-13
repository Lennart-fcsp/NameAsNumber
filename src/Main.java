import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //asking the user to give a name
        System.out.println("Please enter a name: ");
        Scanner scanner = new Scanner(System.in);

        //reading and saving the name
        String input = scanner.next().toLowerCase();

        //Converting name to number
        int result = getNumberFromName(input);

        //Print result
        System.out.println(input + " => " + result);
    }

    //Converting  name to number and return result
    static int getNumberFromName(String input) {

        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int j = alphabet.indexOf(input.charAt(i));
            if (j != -1) {
                result += j + 1;
            }
        }

        return result;
    }
}
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;

public class Math465Project1 {

    public static void main(String[] args) {

        //Creating the alphabet array as well as the accept state array
        String alphabet[] = new String[1000];
        int accept[] = new int[]{15, 16, 17, 18, 20, 23, 25, 27, 29};

        //Filling the alphabet array in a three-digit format
        for (int i = 0; i <= 999; i++) {
            alphabet[i] = new DecimalFormat("000").format(i);
        }

        //Reading in the input file
       // Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter transitions");
        //String str = scanner.nextLine();
        String str = "";
        try {
            str = new String(Files.readAllBytes(Paths.get("testdoc.txt")));
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        //Exception handling for strings not in a multiple of 3
        if ((str.length() % 3) != 0) {
            System.out.println("Please enter a valid string for this DFA");
        }

        //Setting the start state to 0
        int currentState = 0;

        //Series of case statements representing the states traveled
        //to as the 3-length strings are input.  This will loop through
        //the string one letter at a time and will stop when the
        //string ends.
        System.out.print(currentState + " ");
        for (int i = 0; i < str.length(); i += 3){
            String s = str.substring(i, i+3);
            switch (currentState) {
                case 0: {
                    if (s.equals(alphabet[105])) {
                        currentState = 1;
                    }
                    else if (s.equals(alphabet[119])) {
                        currentState = 3;
                    }
                    else {
                        currentState = 0;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 1: {
                    if (s.equals(alphabet[102])) {
                        currentState = 2;
                    }
                    else if (s.equals(alphabet[119])) {
                        currentState = 3;
                    }
                    else {
                        currentState = 0;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 2: {
                    if (s.equals(alphabet[105])) {
                        currentState = 4;
                    }
                    else if (s.equals(alphabet[119])) {
                        currentState = 5;
                    }
                    else {
                        currentState = 2;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 3: {
                    if (s.equals(alphabet[105])) {
                        currentState = 1;
                    }
                    else if (s.equals(alphabet[104])) {
                        currentState = 6;
                    }
                    else {
                        currentState = 0;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 4: {
                    if (s.equals(alphabet[102])) {
                        currentState = 7;
                    }
                    else if (s.equals(alphabet[119])) {
                        currentState = 5;
                    }
                    else {
                        currentState = 2;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 5: {
                    if (s.equals(alphabet[105])) {
                        currentState = 4;
                    }
                    else if (s.equals(alphabet[104])) {
                        currentState = 8;
                    }
                    else {
                        currentState = 2;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 6: {
                    if (s.equals(alphabet[105])) {
                        currentState = 9;
                    }

                    else {
                        currentState = 0;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 7: {
                    if (s.equals(alphabet[105])) {
                        currentState = 1;
                    }
                    else if (s.equals(alphabet[119])) {
                        currentState = 10;
                    }
                    else {
                        currentState = 7;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 8: {
                    if (s.equals(alphabet[105])) {
                        currentState = 11;
                    }

                    else {
                        currentState = 2;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 9: {
                    if (s.equals(alphabet[102])) {
                        currentState = 2;
                    }
                    else if (s.equals(alphabet[108])) {
                        currentState = 13;
                    }
                    else {
                        currentState = 0;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 10: {
                    if (s.equals(alphabet[105])) {
                        currentState = 1;
                    }
                    else if (s.equals(alphabet[104])) {
                        currentState = 14;
                    }
                    else {
                        currentState = 7;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 11: {
                    if (s.equals(alphabet[102])) {
                        currentState = 7;
                    }
                    else if (s.equals(alphabet[108])) {
                        currentState = 12;
                    }
                    else {
                        currentState = 2;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 12: {
                    if (s.equals(alphabet[105])) {
                        currentState = 4;
                    }
                    else if (s.equals(alphabet[101])) {
                        currentState = 19;
                    }
                    else {
                        currentState = 2;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 13: {
                    if (s.equals(alphabet[105])) {
                        currentState = 1;
                    }
                    else if (s.equals(alphabet[101])) {
                        currentState = 15;
                    }
                    else {
                        currentState = 0;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 14: {
                    if (s.equals(alphabet[105])) {
                        currentState = 9;
                    }

                    else {
                        currentState = 7;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 15: {
                    if (s.equals(alphabet[105])) {
                        currentState = 16;
                    }
                    else if (s.equals(alphabet[119])) {
                        currentState = 17;
                    }
                    else {
                        currentState = 15;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 16: {
                    if (s.equals(alphabet[102])) {
                        currentState = 19;
                    }
                    else if (s.equals(alphabet[119])) {
                        currentState = 17;
                    }
                    else {
                        currentState = 15;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 17: {
                    if (s.equals(alphabet[105])) {
                        currentState = 16;
                    }
                    else if (s.equals(alphabet[119])) {
                        currentState = 18;
                    }
                    else {
                        currentState = 15;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 18: {
                    if (s.equals(alphabet[105])) {
                        currentState = 20;
                    }

                    else {
                        currentState = 15;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 19: {
                    if (s.equals(alphabet[105])) {
                        currentState = 22;
                    }
                    else if (s.equals(alphabet[119])) {
                        currentState = 21;
                    }
                    else {
                        currentState = 19;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 20: {
                    if (s.equals(alphabet[102])) {
                        currentState = 19;
                    }
                    else if (s.equals(alphabet[108])) {
                        currentState = 23;
                    }
                    else {
                        currentState = 15;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 21: {
                    if (s.equals(alphabet[105])) {
                        currentState = 22;
                    }
                    else if (s.equals(alphabet[104])) {
                        currentState = 24;
                    }
                    else {
                        currentState = 19;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 22: {
                    if (s.equals(alphabet[102])) {
                        currentState = 25;
                    }
                    else if (s.equals(alphabet[119])) {
                        currentState = 21;
                    }
                    else {
                        currentState = 19;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 23: {
                    if (s.equals(alphabet[105])) {
                        currentState = 16;
                    }
                    else if (s.equals(alphabet[101])) {
                        currentState = 0;
                    }
                    else {
                        currentState = 15;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 24: {
                    if (s.equals(alphabet[105])) {
                        currentState = 26;
                    }

                    else {
                        currentState = 19;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 25: {
                    if (s.equals(alphabet[105])) {
                        currentState = 16;
                    }
                    else if (s.equals(alphabet[119])) {
                        currentState = 27;
                    }
                    else {
                        currentState = 25;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 26: {
                    if (s.equals(alphabet[102])) {
                        currentState = 25;
                    }
                    else if (s.equals(alphabet[108])) {
                        currentState = 28;
                    }
                    else {
                        currentState = 19;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 27: {
                    if (s.equals(alphabet[105])) {
                        currentState = 16;
                    }
                    else if (s.equals(alphabet[104])) {
                        currentState = 29;
                    }
                    else {
                        currentState = 25;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 28: {
                    if (s.equals(alphabet[105])) {
                        currentState = 22;
                    }
                    else if (s.equals(alphabet[101])) {
                        currentState = 2;
                    }
                    else {
                        currentState = 19;
                    }
                    System.out.print(currentState + " ");
                    break;
                }

                case 29: {
                    if (s.equals(alphabet[105])) {
                        currentState = 20;
                    }

                    else {
                        currentState = 25;
                    }
                    System.out.print(currentState + " ");
                    break;
                }
            }
        }

        //Looping through all the possible accept states to
        //find a match.  If no match found, print "REJECT"
        for (int i = 0; i < accept.length; i++) {
            if (accept[i] == currentState) {
                System.out.println();
                System.out.println("ACCEPT");
                break;
            }
            else if (i == (accept.length - 1)) {
                System.out.println();
                System.out.println("REJECT");
            }
        }

    }
}
